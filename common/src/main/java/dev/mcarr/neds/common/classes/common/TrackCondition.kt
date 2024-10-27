package dev.mcarr.neds.common.classes.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the condition of a given track at which
 * an event will take place.
 * */
@Serializable
data class TrackCondition(

    /**
     * UUID used to uniquely identify a type of condition.
     * eg. 10a14653-a33d-11e7-810d-0a1a4ae29bd2
     * */
    @SerialName("id")
    val id: String,

    /**
     * Description of the condition.
     * eg. Good
     * */
    @SerialName("name")
    val name: String,

    /**
     * Alternative name used for this condition.
     * eg. "good" instead of "Good".
     * `shortName` appears to be a misnomer.
     * */
    @SerialName("short_name")
    val shortName: String
)