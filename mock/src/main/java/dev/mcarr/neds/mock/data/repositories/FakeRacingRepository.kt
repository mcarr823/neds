package dev.mcarr.neds.mock.data.repositories

import dev.mcarr.neds.common.classes.racing.RacingNetworkResponse
import dev.mcarr.neds.common.interfaces.data.repositories.IRacingRepository
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import dev.mcarr.neds.mock.data.datasources.FakeRacingDataSource
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Mock implementation of the IRacingRepository interface.
 *
 * This repository class uses hard-coded test data contained within this
 * project and does not request real data from a live endpoint.
 *
 * @see IRacingRepository
 * */
class FakeRacingRepository() : IRacingRepository{

    override val racingDataSource = FakeRacingDataSource()

    override val nextRaces = MutableStateFlow<RacingNetworkRequestOutcome<RacingNetworkResponse>>(
        RacingNetworkRequestOutcome.Progress()
    )

    override suspend fun getNextRace(count: Int) {

        // Unlike the live implementation of IRacingRepository, this mock
        // implementation doesn't perform any remote requests.
        // It uses local test data, which is retrieved immediately.
        // So there's no point in setting a temporary Progress state,
        // or adding error handling, since the request is instantaneous
        // and cannot fail.
        val races = racingDataSource.getNextRace(count)
        nextRaces.value = RacingNetworkRequestOutcome.Success(races)

    }

}