package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.classes.racing.RacingNetworkResponse
import dev.mcarr.neds.common.classes.racing.RacingNetworkResponseData
import dev.mcarr.neds.common.interfaces.data.datasources.IRacingDataSource

/**
 * Fake racing data source.
 *
 * Provides example data for unit testing purposes, layout
 * testing purposes, etc.
 * */
class FakeRacingDataSource : IRacingDataSource {

    /**
     * Hard-coded test data.
     *
     * @return A single RaceSummary object
     * */
    fun getRaceSummary(): RaceSummary {
        return FakeRace1()
    }

    /**
     * Hard-coded test data.
     *
     * The test data can optionally (enabled by default) have its start time
     * updated before being returned. This is to ensure that the data is a
     * mix of expired and non-expired data.
     *
     * @param updateStartTimes If true, update the start times of the test data
     * before returning it.
     *
     * @return A single RaceSummary object
     * */
    fun getRaceSummaries(
        updateStartTimes: Boolean = true
    ): List<RaceSummary> {
        val races = listOf(
            FakeRace1(),
            FakeRace2(),
            FakeRace3(),
            FakeRace4(),
            FakeRace5(),
            FakeRace6(),
            FakeRace7(),
            FakeRace8(),
            FakeRace9(),
            FakeRace10(),
            FakeRace11(),
            FakeRace12(),
            FakeRace13(),
            FakeRace14(),
            FakeRace15(),
            FakeRace16(),
            FakeRace17(),
            FakeRace18(),
            FakeRace19(),
            FakeRace20(),
            FakeRace21(),
            FakeRace22(),
            FakeRace23(),
            FakeRace24(),
            FakeRace25(),
            FakeRace26(),
            FakeRace27(),
            FakeRace28(),
            FakeRace29(),
            FakeRace30(),
        )

        // If we aren't updating the start times, just return the data as-is
        if (!updateStartTimes)
            return races

        val currentTimeMillis = System.currentTimeMillis()
        val currentTimeSeconds = currentTimeMillis / 1000

        return races.mapIndexed { i, it ->

            // Offset measured in seconds.
            // Increase by 10 seconds per loop iteration.
            // Start at -70 (70 seconds in the past) so the first
            // two results (-70, -60) will be considered expired, and
            // the rest won't.
            val offset = i * 10 - 70

            val newTimeSeconds = currentTimeSeconds + offset
            it.copy(
                advertisedStart = it.advertisedStart.copy(seconds = newTimeSeconds)
            )
        }

    }

    /**
     * Hard-coded test data.
     *
     * @return A single RacingNetworkResponse object
     * */
    override suspend fun getNextRace(count: Int): RacingNetworkResponse {

        val raceIds = ArrayList<String>()
        val raceSummaries = HashMap<String, RaceSummary>()

        // Extract and repackage the response.
        // This is necessary to ensure that we only return `count` results.
        getRaceSummaries()
            .take(count)
            .forEach { summary ->
                val raceId = summary.raceId
                raceIds.add(raceId)
                raceSummaries[raceId] = summary
            }

        return RacingNetworkResponse(
            status = 200,
            data = RacingNetworkResponseData(
                nextToGoIds = raceIds,
                raceSummaries = raceSummaries
            ),
            message = "Next $count races from each category"
        )


    }

}