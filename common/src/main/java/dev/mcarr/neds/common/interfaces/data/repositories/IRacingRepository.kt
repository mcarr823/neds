package dev.mcarr.neds.common.interfaces.data.repositories

import dev.mcarr.neds.common.classes.racing.RacingNetworkResponse
import dev.mcarr.neds.common.interfaces.data.datasources.IRacingDataSource
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Interface which defines the behavior of any repository classes
 * which provide racing data.
 * */
interface IRacingRepository {

    /**
     * Data source from which to retrieve racing data.
     * */
    val racingDataSource: IRacingDataSource

    /**
     * Flow of races retrieved from the data source.
     * */
    val nextRaces: MutableStateFlow<RacingNetworkRequestOutcome<RacingNetworkResponse>>

    /**
     * Retrieves the next `count` number of races from the
     * data source and stores the result in the `nextRaces` flow.
     *
     * @param count Number of races to retrieve
     * */
    suspend fun getNextRace(count: Int)

}