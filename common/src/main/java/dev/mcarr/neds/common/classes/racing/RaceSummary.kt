package dev.mcarr.neds.common.classes.racing

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.math.abs

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
){

    /**
     * Calculates the amount of time, measured in seconds, until the race is
     * set to begin.
     *
     * This value may be negative if the race has already started.
     *
     * @return How many seconds until the race starts
     * */
    fun startsInSeconds(): Long {
        val currentTimeSeconds = System.currentTimeMillis() / 1000
        return advertisedStart.seconds - currentTimeSeconds
    }

    /**
     * Checks if a race has already started and should no longer be displayed
     * to the user.
     *
     * A race is considered "expired" if it started at least 60 seconds ago.
     *
     * @return True if the race started at least 60 seconds ago
     * */
    fun hasExpired(): Boolean {
        val startsInSeconds = startsInSeconds()
        return startsInSeconds <= -60
    }

    /**
     * Provides a text representation of the starting time of an event.
     *
     * This is intended as display text to be shown to the user.
     *
     * Time may be measured in either minutes or seconds, and may show
     * events which have or have not already started.
     *
     * NOTE: This function does not currently handle units of time measurement
     * greater than minutes, nor does it handle negative time units greater
     * than seconds.
     *
     * That is because the app currently only displayed recent events, or events
     * which are comping up in the near future.
     *
     * This should change if/when the app is updated to show events which are
     * further in the past or future.
     *
     * @return User-displayable text representation of a race's starting time
     * */
    fun startsInDisplayText(): String {
        val startsInSeconds = startsInSeconds()
        if (startsInSeconds < 0){
            val absoluteSeconds = abs(startsInSeconds)
            return "Started ${absoluteSeconds}s ago"
        }else if (startsInSeconds >= 60) {
            val startsInMinutes = startsInSeconds / 60
            return "Starts in ${startsInMinutes}m"
        }else {
            return "Starts in ${startsInSeconds}s"
        }
    }

    /**
     * Provides a text representation of the race number in the format
     * of: "Race #${number}"
     *
     * This is intended as display text to be shown to the user.
     *
     * @return User-displayable text representation of a race number
     * */
    fun getRaceNumberDisplayText(): String {
        return "Race #$raceNumber"
    }

    /**
     * Export the race summary data as a RaceCardData object to be displayed
     * on the UI.
     *
     * @return A RaceCardData object containing data from this summary
     * 
     * @see RaceCardData
     * */
    fun toRaceCardData() = RaceCardData(
        raceId = raceId,
        raceNumber = getRaceNumberDisplayText(),
        startsIn = startsInDisplayText(),
        meetingName = meetingName
    )

}