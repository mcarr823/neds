package dev.mcarr.neds.common.classes.racing

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents a HTTP response from the /racing endpoint.
 * */
@Serializable
data class RacingNetworkResponse(

    /**
     * HTTP status code.
     *
     * Should be 200 if successful.
     * */
    @SerialName("status")
    val status: Int,

    /**
     * Racing data queried from the server.
     *
     * TODO make it nullable? test some invalid responses
     * */
    @SerialName("data")
    val data: RacingNetworkResponseData,

    /**
     * Success or error message explaining the status
     * of the response.
     * */
    @SerialName("message")
    val message: String
)