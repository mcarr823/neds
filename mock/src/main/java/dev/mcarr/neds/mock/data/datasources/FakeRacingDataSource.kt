package dev.mcarr.neds.mock.data.datasources

import android.content.Context
import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.classes.racing.RacingNetworkResponse
import dev.mcarr.neds.common.classes.racing.RacingNetworkResponseData
import dev.mcarr.neds.common.interfaces.data.datasources.IRacingDataSource
import dev.mcarr.neds.mock.R
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream

/**
 * Fake racing data source.
 *
 * Provides example data for unit testing purposes, layout
 * testing purposes, etc.
 *
 * @param c Context used to open the app's resources
 * */
class FakeRacingDataSource(
    private val c: Context
) : IRacingDataSource {

    override suspend fun getNextRace(count: Int): RacingNetworkResponse {

        val json = Json{ explicitNulls = false }

        // Pull the data from a raw JSON file and parse it.
        // It would be better to create individual objects and call those
        // objects from a series of functions, rather than parsing the
        // JSON dump every time.
        // But doing that will take time. So for now, let's just parse
        // the data dump.
        val resp = c.resources.openRawResource(R.raw.racing_data).use {
            json.decodeFromStream<RacingNetworkResponse>(it)
        }

        val raceIds = ArrayList<String>()
        val raceSummaries = HashMap<String, RaceSummary>()

        // Extract and repackage the response.
        // This is necessary to ensure that we only return `count` results.
        resp.data
            .raceSummaries
            .entries
            .take(count)
            .map { it.value }
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