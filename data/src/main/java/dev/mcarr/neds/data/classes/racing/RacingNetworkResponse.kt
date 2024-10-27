package dev.mcarr.neds.data.classes.racing

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