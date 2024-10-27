package dev.mcarr.neds.data.repositories

import dev.mcarr.neds.data.classes.racing.RaceSummary
import dev.mcarr.neds.data.datasources.IRacingDataSource

/**
 * Repository for requesting racing data.
 *
 * @param racingDataSource Data source from which to retrieve
 * racing data.
 * */
class RacingRepository(
    private val racingDataSource: IRacingDataSource
) {

    /**
     * Retrieves the next `count` number of races from the
     * data source and parses the RacingNetworkResponse,
     * providing the results as a list of RaceSummary objects.
     *
     * @param count Number of race summaries to return in the response.
     * */
    suspend fun getNextRace(count: Int): List<RaceSummary> =
        racingDataSource.getNextRace(count)
            .data
            .raceSummaries
            .entries
            .map { it.value }

}