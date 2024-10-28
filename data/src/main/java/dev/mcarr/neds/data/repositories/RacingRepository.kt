package dev.mcarr.neds.data.repositories

import dev.mcarr.neds.common.classes.racing.RacingNetworkResponse
import dev.mcarr.neds.common.interfaces.data.datasources.IRacingDataSource
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Repository for requesting racing data.
 *
 * @param racingDataSource Data source from which to retrieve
 * racing data.
 * */
class RacingRepository(
    private val racingDataSource: IRacingDataSource
) {

    val nextRaces = MutableStateFlow<RacingNetworkRequestOutcome<RacingNetworkResponse>>(
        RacingNetworkRequestOutcome.Progress()
    )

    /**
     * Retrieves the next `count` number of races from the
     * data source and parses the RacingNetworkResponse,
     * providing the results as a list of RaceSummary objects.
     *
     * @param count Number of race summaries to return in the response.
     * */
    suspend fun getNextRace(count: Int) {

        nextRaces.value = RacingNetworkRequestOutcome.Progress()
        try {
            val races = racingDataSource.getNextRace(count)
            nextRaces.value = RacingNetworkRequestOutcome.Success(races)
        }catch (e: Exception){
            nextRaces.value = RacingNetworkRequestOutcome.Failure(e)
        }

    }

}