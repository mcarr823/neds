package dev.mcarr.neds.data.classes.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Depicts a unit of measurement used when advertising
 * the distance of a race.
 *
 * For example, meters, miles, kilometers, etc.
 * */
@Serializable
data class DistanceType(

    /**
     * UUID used to uniquely identify a type of distance.
     * eg. 570775ae-09ec-42d5-989d-7c8f06366aa7
     * */
    @SerialName("id")
    val id: String,

    /**
     * Name of the unit of measurement.
     * eg. Metres
     * */
    @SerialName("name")
    val name: String,

    /**
     * Shorter name used when using this unit of measurement.
     * eg. "m" for Metres
     * */
    @SerialName("short_name")
    val shortName: String
)