package dev.mcarr.neds.data.datasources

import dev.mcarr.neds.data.classes.racing.RacingNetworkResponse

/**
 * Interface from which any data sources extending or mocking the
 * /racing API endpoint must inherit.
 * */
interface IRacingDataSource {

    /**
     * Retrieve the next `count` number of races.
     *
     * @param count Number of races to return in the response.
     * */
    suspend fun getNextRace(count: Int): RacingNetworkResponse

}