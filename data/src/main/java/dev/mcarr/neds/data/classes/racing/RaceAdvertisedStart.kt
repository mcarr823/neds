package dev.mcarr.neds.data.classes.racing

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Represents the advertised start time of an event measured in
 * seconds since epoch.
 * */
@Serializable
data class RaceAdvertisedStart(

    /**
     * Time when a race is advertised to start, measured in seconds since
     * epoch.
     * */
    @SerialName("seconds")
    val seconds: Long

)