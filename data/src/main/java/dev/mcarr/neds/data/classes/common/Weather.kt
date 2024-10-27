package dev.mcarr.neds.data.classes.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the weather of the area at which a given event will take place.
 * */
@Serializable
data class Weather(

    /**
     * UUID used to uniquely identify a type of weather.
     * eg. 08e5f78c-1a36-11eb-9269-cef03e67f1a3
     * */
    @SerialName("id")
    val id: String,

    /**
     * Description of the weather.
     * eg. FINE
     * */
    @SerialName("name")
    val name: String,

    /**
     * Alternative name used for this weather condition.
     * eg. "fine" instead of "FINE".
     * `shortName` appears to be a misnomer.
     * */
    @SerialName("short_name")
    val shortName: String,

    /**
     * Icon URI Alternative name used for this weather condition.
     * eg. "fine" instead of "FINE".
     * `shortName` appears to be a misnomer.
     * */
    @SerialName("icon_uri")
    val iconUri: String
)