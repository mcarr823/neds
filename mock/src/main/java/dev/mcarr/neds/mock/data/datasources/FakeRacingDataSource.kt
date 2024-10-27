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

    fun getRaceSummary(): RaceSummary {
        return FakeRace1()
    }

    fun getRaceSummaries(): List<RaceSummary> {
        return listOf(
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
    }

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