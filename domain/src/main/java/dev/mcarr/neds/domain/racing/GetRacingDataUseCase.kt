package dev.mcarr.neds.domain.racing

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.interfaces.domain.racing.IGetRacingDataUseCase
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import dev.mcarr.neds.data.repositories.RacingRepository
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Implementation of the IGetRacingDataUseCase interface which pulls data
 * from a RacingRepository object.
 *
 * Data is queried from a HTTP endpoint and cached locally in a flow.
 *
 * @see IGetRacingDataUseCase
 * @see RacingRepository
 * */
class GetRacingDataUseCase() : IGetRacingDataUseCase {

    override val repo = RacingRepository()

    override val cachedRaces = MutableStateFlow<List<RaceSummary>>(listOf())

    /**
     * State of the latest RacingRepository request.
     * */
    val lastOutcome = MutableStateFlow<RacingUseCaseOutcome>(
        RacingUseCaseOutcome.Progress()
    )

    override suspend fun getMoreRaces(count: Int){

        repo.getNextRace(count)

        val outcome = repo.nextRaces.value
        lastOutcome.value =
            when (outcome) {
                is RacingNetworkRequestOutcome.Success -> {
                    cachedRaces.value = outcome.response.getRaceSummaries()
                    RacingUseCaseOutcome.Success()
                }

                is RacingNetworkRequestOutcome.Progress -> {
                    RacingUseCaseOutcome.Progress(outcome.inProgress)
                }

                is RacingNetworkRequestOutcome.Failure -> {
                    RacingUseCaseOutcome.Failure(outcome.e)
                }
            }
    }

}