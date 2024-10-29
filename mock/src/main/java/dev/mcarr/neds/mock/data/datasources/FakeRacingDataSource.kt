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
     * You can also specify how many expired races you want to include in the
     * response, for the sake of more predictable testing patterns.
     *
     * @param updateStartTimes If true, update the start times of the test data
     * before returning it.
     * @param expiredRaces If `updateStartTimes` is true, then `expiredRaces`
     * is the number of races for which their times should be set to an expired
     * value. ie. Races which started 60+ seconds ago.
     *
     * @return A single RaceSummary object
     * */
    fun getRaceSummaries(
        updateStartTimes: Boolean = true,
        expiredRaces: Int = 2
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

        // Calculate the current time in seconds.
        // We use this value because the test data uses hard-coded times
        // which will expire. So we need to adjust them relative to the
        // current time in order to keep them relevant.
        val currentTimeMillis = System.currentTimeMillis()
        val currentTimeSeconds = currentTimeMillis / 1000

        // This is the initial offset from the current time.
        // We start at -50 (50 second before `currentTimeSeconds`) since
        // that's just barely relevant (races expire 60 seconds after starting)
        val initialOffsetSeconds = -50

        // Next, we figure out the offset calculated from the number of races
        // we want to show which actually ARE expired.
        // Given that:
        // - the initial offset is -50
        // - races expire at -60, and
        // - the loop below increases times in 10 second intervals
        // We thus we need to calculate the expired races offset in -10 second
        // intervals.
        // So if we want to show 2 expired races, we calculate the offset to
        // -20, which then updates the `calculatedOffset` to be -70.
        // That would give us two expired races (at -60 and -70) and the rest
        // not expired.
        val expiredRacesOffsetSeconds = expiredRaces * -10
        val calculatedOffset = initialOffsetSeconds + expiredRacesOffsetSeconds

        return races.mapIndexed { i, it ->

            // Offset measured in seconds.
            // Increase by 10 seconds per loop iteration.
            val offset = calculatedOffset + i * 10

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