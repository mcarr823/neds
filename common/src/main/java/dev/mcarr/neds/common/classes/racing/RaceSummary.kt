package dev.mcarr.neds.common.classes.racing

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Summary of a given racing event.
 *
 * Contains all of the pertinent data for a given event,
 * such as the location, race number, when it will occur,
 * and so on.
 * */
@Serializable
data class RaceSummary(

    /**
     * UUID of the racing event.
     * */
    @SerialName("race_id")
    val raceId: String,

    /**
     * Race name.
     * May include the race number.
     * eg. "Race 3 - Claiming"
     * Not to be confused with the meeting name.
     * @see meetingName
     * */
    @SerialName("race_name")
    val raceName: String,

    /**
     * Race event number.
     * */
    @SerialName("race_number")
    val raceNumber: Int,

    /**
     * UUID for a given meeting.
     * */
    @SerialName("meeting_id")
    val meetingId: String,

    /**
     * Meeting name.
     * eg. Charles Town
     * */
    @SerialName("meeting_name")
    val meetingName: String,

    /**
     * ID of a racing category.
     * @see dev.mcarr.neds.common.enums.racing.RacingCategory
     * */
    @SerialName("category_id")
    val categoryId: String,

    /**
     * Time at which the event is advertised to start.
     * */
    @SerialName("advertised_start")
    val advertisedStart: RaceAdvertisedStart,

    /**
     * Extra information about the race, including the expected
     * weather and track condition.
     * */
    @SerialName("race_form")
    val raceForm: RaceForm,

    /**
     * UUID of the venue.
     * */
    @SerialName("venue_id")
    val venueId: String,

    /**
     * Name of the venue.
     * */
    @SerialName("venue_name")
    val venueName: String,

    /**
     * State or territory in which the venue is located.
     * */
    @SerialName("venue_state")
    val venueState: String,

    /**
     * Country in which the venue is located.
     * */
    @SerialName("venue_country")
    val venueCountry: String
)