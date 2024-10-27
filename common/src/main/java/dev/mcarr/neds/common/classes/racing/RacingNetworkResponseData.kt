package dev.mcarr.neds.common.classes.racing

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Data contained within a HTTP response from the /racing endpoint.
 * */
@Serializable
data class RacingNetworkResponseData(

    /**
     * If the request was a "nextraces" or similar request,
     * this list will contain the IDs of the upcoming races.
     * */
    @SerialName("next_to_go_ids")
    val nextToGoIds: List<String>,

    /**
     * A map of race IDs and race summaries.
     *
     * The race IDs (also found in `nextToGoIds`) each map to the
     * `raceId` field of the RaceSummary object in the map.
     * */
    @SerialName("race_summaries")
    val raceSummaries: Map<String, RaceSummary>

)