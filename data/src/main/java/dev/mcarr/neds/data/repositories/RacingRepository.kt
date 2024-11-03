package dev.mcarr.neds.data.repositories

import dev.mcarr.neds.common.classes.racing.RacingNetworkResponse
import dev.mcarr.neds.common.interfaces.data.repositories.IRacingRepository
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import dev.mcarr.neds.data.datasources.RacingDataSource
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Live implementation of the IRacingRepository interface.
 *
 * This repository class requests real racing data from a live, remote
 * endpoint via HTTP requests.
 *
 * @see IRacingRepository
 * */
class RacingRepository() : IRacingRepository{

    override val racingDataSource = RacingDataSource()

    override val nextRaces = MutableStateFlow<RacingNetworkRequestOutcome<RacingNetworkResponse>>(
        RacingNetworkRequestOutcome.Progress()
    )

    override suspend fun getNextRace(count: Int) {

        // Set the state to Progress initially, since the HTTP request
        // won't be instantaneous.
        nextRaces.value = RacingNetworkRequestOutcome.Progress()

        try {

            // Attempt to retrieve some races from the remote endpoint.
            // If the request succeeds, set the state to Success and provide
            // the state flow with the retrieved races.
            val races = racingDataSource.getNextRace(count)
            nextRaces.value = RacingNetworkRequestOutcome.Success(races)

        }catch (e: Exception){

            // If an exception occurs (eg. no internet connection), set
            // the state to Failure.
            e.printStackTrace()
            nextRaces.value = RacingNetworkRequestOutcome.Failure(e)

        }

    }

}