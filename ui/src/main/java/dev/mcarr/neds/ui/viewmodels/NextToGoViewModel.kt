package dev.mcarr.neds.ui.viewmodels

import android.util.Log
import androidx.annotation.IntRange
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.interfaces.viewmodels.INextToGoViewModel
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import dev.mcarr.neds.domain.racing.GetRacingDataUseCase
import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit

/**
 * Viewmodel which provides functionality specific to the NextToGoScreen composable.
 *
 * @see dev.mcarr.neds.ui.screens.NextToGoScreen
 * @see GetRacingDataUseCase
 * */
class NextToGoViewModel : ViewModel(), INextToGoViewModel {

    override val source = GetRacingDataUseCase()

    /**
     * Flow containing the current category selection.
     * */
    var categories = MutableStateFlow<List<RacingCategory>>(listOf())

    /**
     * Flow of the most recent manual flow update in milliseconds since epoch.
     * */
    private val timeTick = MutableStateFlow<Long>(0L)

    /**
     * Time in milliseconds since epoch at which the last attempt to download
     * race data from the server was attempted.
     * */
    private var lastDownloadMillis = 0L

    /**
     * Size increment applied to the function responsible for downloading races.
     * We download data in progressively larger chunks, calculated by the attempt
     * multiplied by the increment value.
     *
     * @see downloadRaceData
     * */
    private var downloadSizeIncrement = 20

    /**
     * The maximum number of download attempts which should be allowed.
     *
     * Note that this value should reflect the IntRange specified in downloadRaceData.
     *
     * @see downloadRaceData
     * */
    private var maxDownloadAttempts = 5

    /**
     * Interval at which the flow data should be manually updated to reflect the
     * passage of time.
     * */
    private val intervalSeconds = 1

    override val exactNumberOfResultsToDisplay = 5

    /**
     * Coroutine responsible for managing the state of the event loop.
     *
     * This should probably be replaced by a more direct kind of
     * lifecycle/coroutine integration at some point.
     * */
    private var eventLoop: Job? = null

    /**
     * Flow which updates the UiState object exposed to the user interface.
     *
     * The data is all taken from the UseCase, but the flow itself can be triggered
     * again from this viewmodel.
     *
     * Updates if:
     * - `categories` is updated to reflect a change in the category filter
     * - `cachedRaces` is updated. eg. If more races are downloaded.
     * - `lastOutcome` is updated. eg. If a UseCase request runs.
     * - `timeTick` is updated by another function to force new data
     *
     * This flow automatically removes expired entries and maps the data to
     * a RaceCardData object for display on the UI.
     *
     * @see dev.mcarr.neds.common.classes.racing.RaceCardData
     * @see GetRacingDataUseCase
     * @see NextToGoScreenUiState
     * */
    override val uiState = combine(
        categories,
        source.cachedRaces,
        source.lastOutcome,
        timeTick
    ) { category, summaries, outcome, _ ->

        // Filter out any races which are not the right category,
        // or which have already expired.
        // Also, sort the races by their start time.
        val categoryIds = category.map { it.uuid }
        val races = summaries
            .filter { category.isEmpty() || it.categoryId in categoryIds }
            .sortedBy { it.advertisedStart.seconds }
            .filterNot { it.hasExpired() }
            .map(RaceSummary::toRaceCardData)

        NextToGoScreenUiState(
            category = category,
            loadingState = outcome,
            races = races
        )

    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = NextToGoScreenUiState(
            category = listOf(),
            loadingState = RacingUseCaseOutcome.Success(),
            races = listOf()
        )
    )

    override fun resetState(){
        lastDownloadMillis = 0L
        source.lastOutcome.value = RacingUseCaseOutcome.Success()
        updateViews()
    }

    override fun setCategory(category: List<RacingCategory>){
        Log.v("NextToGoViewModel", "Set category: "+category.joinToString(", "){ it.name })
        this.categories.value = category
    }

    /**
     * Downloads more race data from the remote endpoint.
     *
     * The amount of downloaded data is proportional to the attempt number.
     *
     * This is so we can download an increasing amount of data if we don't
     * currently have enough to satisfy the UI's requirements.
     *
     * @param downloadAttempt How many downloads have been attempted, including
     * this attempt.
     * */
    private suspend fun downloadRaceData(
        @IntRange(from = 1, to = 5)
        downloadAttempt: Int
    ){

        // Request a number of races proportional to the attempt
        val count = downloadAttempt * downloadSizeIncrement
        source.getMoreRaces(count)

    }

    /**
     * This function provides the logic loop responsible for keeping the UI up to date.
     *
     * Flows are used for some level of filtering. But races are also time-sensitive, so
     * we need a loop which updates values over time.
     *
     * NOTE There's probably a way to do that with flows, so it may be worth revisiting
     * this in the future to see if there's a better way of doing this.
     *
     * This function works by looping every `intervalSeconds` seconds.
     * It then causes the flow to update by changing the value of `timeTick`.
     * This causes the logic in `uiState` to run again, filtering out expired races
     * and updating the start times being displayed.
     *
     * It also triggers a request for more data from the UseCase if the size of the filtered
     * data has dropped below the minimum threshold.
     *
     * This loop stops if the `loadingState` changes.
     * This way it will stop automatically if an error occurs, and will need to be started
     * again manually by the `resetState` function, triggered by user interaction with the UI.
     *
     * @see resetState
     * @see uiState
     * */
    private fun updateViews(){

        val intervalMillis = intervalSeconds * 1_000L
        var downloadAttempt = 0

        eventLoop = viewModelScope.launch(Dispatchers.IO){

            // Abort if the loading state has changed.
            // eg. The request has failed.
            while (uiState.value.loadingState is RacingUseCaseOutcome.Success) {

                val now = System.currentTimeMillis()

                // Update the time flow to trigger an update of the uiState flow
                timeTick.value = now

                Log.v("NextToGoViewModel", "Loop iteration... ($now)")

                // If we don't have enough results to display anymore, request some more.
                if (uiState.value.races.size < exactNumberOfResultsToDisplay) {

                    // Calculate how long it's been since we last requested more data
                    val diffMillis = now - lastDownloadMillis
                    val diffMinutes = TimeUnit.MILLISECONDS.toMinutes(diffMillis)

                    // If it's been at least 1 minute, reset the download count
                    if (diffMinutes > 0){
                        downloadAttempt = 0
                    }

                    // Check how many download attempts we've made.
                    // If we've made too many in a short span of time, wait a while before
                    // trying again.
                    if (downloadAttempt < maxDownloadAttempts) {

                        Log.v("NextToGoViewModel", "Not enough data. Downloading more")

                        // Update the last download time and download attempt
                        lastDownloadMillis = now
                        downloadAttempt++

                        // Request more data
                        downloadRaceData(downloadAttempt)

                    }

                }

                // Wait for a while before triggering the loop again.
                delay(intervalMillis)

            }

        }
    }

    override fun pause(){
        eventLoop?.cancel()
    }

}