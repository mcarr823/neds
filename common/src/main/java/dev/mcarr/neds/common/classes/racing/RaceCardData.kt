package dev.mcarr.neds.common.classes.racing

/**
 * Data class representing the data shown on a RaceCard
 * composable in the :ui module.
 * */
data class RaceCardData(

    /**
     * UUID of the racing event.
     * */
    val raceId: String,

    /**
     * Text representation of the race number.
     * */
    val raceNumber: String,

    /**
     * Text representation of the starting time of an event.
     * */
    val startsIn: String,

    /**
     * Meeting name.
     * eg. Charles Town
     * */
    val meetingName: String

)