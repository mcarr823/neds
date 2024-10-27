package dev.mcarr.neds.common.classes.racing

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes the conditions surrounding a particular race, such as
 * the weather, the track condition, and the distance of the race.
 *
 * This is only a subset of the information available about a given
 * race. For more detailed information, see the RaceSummary class.
 *
 * @see RaceSummary
 *
 * Note that some fields in this class, such as weather and raceComment,
 * are marked as nullable.
 *
 * This is because not all fields are guaranteed to be provided by
 * the server.
 *
 * eg. Weather data and race commentary may not be available yet,
 * and may thus be omitted from the server response data.
 * */
@Serializable
data class RaceForm(

    /**
     * Distance of the event.
     * */
    @SerialName("distance")
    val distance: Int,

    /**
     * Unit of measurement used by `distance`.
     * */
    @SerialName("distance_type")
    val distanceType: DistanceType,

    /**
     * UUID of the `distanceType`.
     * */
    @SerialName("distance_type_id")
    val distanceTypeId: String,

    /**
     * Condition of the track.
     * */
    @SerialName("track_condition")
    val trackCondition: TrackCondition?,

    /**
     * UUID of the `trackCondition`.
     * */
    @SerialName("track_condition_id")
    val trackConditionId: String?,

    /**
     * Expected type of weather at the given event.
     * */
    @SerialName("weather")
    val weather: Weather?,

    /**
     * UUID of the `weather`.
     * */
    @SerialName("weather_id")
    val weatherId: String?,

    /**
     * Commentary available about the race.
     * */
    @SerialName("race_comment")
    val raceComment: String?,

    /**
     * JSON string containing data which is largely duplicated
     * with other fields in this class.
     * */
    @SerialName("additional_data")
    val additionalData: String,

    /**
     * TODO verify this field's purpose
     * Appears to be a boolean flag (1 or 0).
     * */
    @SerialName("generated")
    val generated: Int,

    /**
     * TODO verify this field's purpose
     * */
    @SerialName("silk_base_url")
    val silkBaseUrl: String,

    /**
     * Alternative commentary available about the race.
     * Usually matches the `raceComment` field.
     * */
    @SerialName("race_comment_alternative")
    val raceCommentAlternative: String?
)