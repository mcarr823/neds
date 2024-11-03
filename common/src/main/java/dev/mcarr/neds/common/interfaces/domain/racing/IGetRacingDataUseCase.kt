package dev.mcarr.neds.common.interfaces.domain.racing

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.interfaces.data.repositories.IRacingRepository
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Interface which should be implemented by any UseCase classes which
 * retrieve data from an IRacingRepository implementation.
 *
 * Data is queried from the repository, then stored in a flow.
 *
 * The flow is then utilized by a viewmodel in order to expose
 * the data to the user interface.
 *
 * @see IRacingRepository
 * */
interface IGetRacingDataUseCase {

    /**
     * Repository from which to pull data.
     * */
    val repo: IRacingRepository

    /**
     * Flow containing a list of races retrieved from the repository.
     * */
    val cachedRaces: MutableStateFlow<List<RaceSummary>>

    /**
     * Queries the repository for more races and exposes the data via the
     * `cachedRaces` flow.
     *
     * @param count How many races to query from the repository
     *
     * @see cachedRaces
     * */
    suspend fun getMoreRaces(count: Int)

}