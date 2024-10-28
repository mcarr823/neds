package dev.mcarr.neds.common.sealed.racing

import dev.mcarr.neds.common.classes.racing.RaceSummaryList

sealed class RacingUseCaseOutcome {
    data class Progress(val inProgress: Boolean = true) : RacingUseCaseOutcome()
    data class Success(val finished: Boolean = true) : RacingUseCaseOutcome()
    data class Failure(val e: Throwable) : RacingUseCaseOutcome()
}