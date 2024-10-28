package dev.mcarr.neds.common.sealed.racing

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.classes.racing.RacingNetworkResponse

sealed class RacingNetworkRequestOutcome<RacingNetworkResponse> {
    data class Progress(val inProgress: Boolean = true) : RacingNetworkRequestOutcome<RacingNetworkResponse>()
    data class Success(val response: RacingNetworkResponse) : RacingNetworkRequestOutcome<RacingNetworkResponse>()
    data class Failure(val e: Throwable) : RacingNetworkRequestOutcome<RacingNetworkResponse>()
}