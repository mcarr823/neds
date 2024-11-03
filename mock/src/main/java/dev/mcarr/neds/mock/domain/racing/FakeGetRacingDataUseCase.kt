package dev.mcarr.neds.mock.domain.racing

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.interfaces.domain.racing.IGetRacingDataUseCase
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import dev.mcarr.neds.mock.data.repositories.FakeRacingRepository
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Implementation of the IGetRacingDataUseCase interface which pulls data
 * from a local test class.
 *
 * Data is hard-coded, does not require internet access to retrieve,
 * and is cached locally in a flow.
 *
 * @see IGetRacingDataUseCase
 * @see FakeRacingRepository
 * */
class FakeGetRacingDataUseCase : IGetRacingDataUseCase {

    override val repo = FakeRacingRepository()

    override val cachedRaces = MutableStateFlow<List<RaceSummary>>(listOf())

    override suspend fun getMoreRaces(count: Int) {
        repo.getNextRace(count)

        val outcome = repo.nextRaces.value
        when (outcome) {
            is RacingNetworkRequestOutcome.Success -> {
                cachedRaces.value = outcome.response.getRaceSummaries()
            }
            else -> {
                throw Exception("FakeRacingRepository failed to invoke getNextRace correctly")
            }
        }
    }

}