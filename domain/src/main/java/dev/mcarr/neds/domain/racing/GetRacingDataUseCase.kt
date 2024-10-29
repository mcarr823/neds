package dev.mcarr.neds.domain.racing

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import dev.mcarr.neds.data.repositories.RacingRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlin.collections.filter

/**
 * UseCase class which applies business logic to the results of a
 * RacingRepository's data for use by a viewmodel.
 *
 * @param repo Repository from which to pull data.
 * */
class GetRacingDataUseCase(
    private val repo: RacingRepository
) {

    /**
     * Flow containing the current category selection.
     * */
    var categories = MutableStateFlow<List<RacingCategory>>(listOf())

    /**
     * Full, unfiltered list of races cached from the RacingRepository.
     * */
    var cachedRaces = MutableStateFlow<List<RaceSummary>>(listOf())

    /**
     * State of the latest RacingRepository request.
     * */
    val lastOutcome = MutableStateFlow<RacingUseCaseOutcome>(
        RacingUseCaseOutcome.Progress()
    )

    /**
     * Flow of races, filtered by the selected categories.
     * The flow also removes expired races, and sorts by the advertised start
     * time of the race.
     * */
    val categorizedRaces = combine(
        categories,
        cachedRaces
    ) { categoryList, races ->
        val categoryIds = categoryList.map { it.uuid }
        races
            .filter { categoryList.isEmpty() || it.categoryId in categoryIds }
            .sortedBy { it.advertisedStart.seconds }
    }

    /**
     * Set the list of categories by which the flow of races should be
     * filtered.
     *
     * @param categories List of categories by which to filter.
     * */
    fun setCategory(categories: List<RacingCategory>) {
        this.categories.value = categories
    }

    /**
     * Queries the RacingRepository for `count` more races and updates the
     * flows accordingly.
     * */
    suspend fun getMoreRaces(count: Int){

        repo.getNextRace(count)

        val outcome = repo.nextRaces.value
        lastOutcome.value =
            when (outcome) {
                is RacingNetworkRequestOutcome.Success -> {
                    cachedRaces.value = outcome.response.getRaceSummaries()
                    RacingUseCaseOutcome.Success()
                }

                is RacingNetworkRequestOutcome.Progress -> {
                    RacingUseCaseOutcome.Progress(outcome.inProgress)
                }

                is RacingNetworkRequestOutcome.Failure -> {
                    RacingUseCaseOutcome.Failure(outcome.e)
                }
            }
    }

}