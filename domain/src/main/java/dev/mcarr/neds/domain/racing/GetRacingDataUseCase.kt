package dev.mcarr.neds.domain.racing

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import dev.mcarr.neds.data.repositories.RacingRepository
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * UseCase class which applies business logic to the results of a
 * RacingRepository's data for use by a viewmodel.
 *
 * @param repo Repository from which to pull data.
 * */
class GetRacingDataUseCase(
    private val repo: RacingRepository
) {

    /**
     * Full, unfiltered list of races cached from the RacingRepository.
     * */
    var cachedRaces = MutableStateFlow<List<RaceSummary>>(listOf())

    /**
     * State of the latest RacingRepository request.
     * */
    val lastOutcome = MutableStateFlow<RacingUseCaseOutcome>(
        RacingUseCaseOutcome.Progress()
    )

    /**
     * Queries the RacingRepository for `count` more races and updates the
     * flows accordingly.
     * */
    suspend fun getMoreRaces(count: Int){

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