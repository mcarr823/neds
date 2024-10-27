package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace7() = RaceSummary(
    raceId = "45e07903-9302-491b-9942-690db2c7c952",
    raceName = "Dubbo Rsl Maiden",
    raceNumber = 1,
    meetingId = "5bce80de-2245-4013-aa16-d3a754b3e8e7",
    meetingName = "Dubbo",
    categoryId = "9daef0d7-bf3c-4f50-921d-8e818c60fe61",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927680
    ),
    raceForm = RaceForm(
        distance = 318,
        distanceType = DistanceType(
            id = "570775ae-09ec-42d5-989d-7c8f06366aa7",
            name = "Metres",
            shortName = "m"
        ),
        distanceTypeId = "570775ae-09ec-42d5-989d-7c8f06366aa7",
        trackCondition = TrackCondition(
            id = "10a14653-a33d-11e7-810d-0a1a4ae29bd2",
            name = "Good",
            shortName = "good"
        ),
        trackConditionId = "10a14653-a33d-11e7-810d-0a1a4ae29bd2",
        weather = Weather(
            id = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
            name = "Fine",
            shortName = "fine",
            iconUri = "Fine"
        ),
        weatherId = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
        raceComment = "JAYLA MAGIC (1) has her first outing without a trial but profiles nicely for this. Likely to be well fancied but watch market closely. MOLLY KEEPING (7) has finished in the placings both career runs so far, the latest when third (23.55) at this track. Expecting another bold showing. KATIE KEEPING (6) drew a squeeze box and was game in defeat when a close second, a neck from the winner Kia Mcgraw (23.37) at this track. Expected to be in this for a long way. LUMEAH BRIN (2) is a Garry Abernethy-trained newcomer by Brad Hill Billy out of Ferrero Miss. No trial form. Profiles nicely and can feature in the finish.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Dubbo\",\"state\":\"NSW\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Dubbo Rsl Maiden\",\"time\":\"2024-10-26T07:28:00Z\",\"class\":\"Maiden\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":1790),\"localised_prizemonies\":{\"AUD\":{\"1st\":1175,\"2nd\":315,\"3rd\":225,\"4th\":75,\"total_value\":1790),\"NZD\":{\"1st\":1281,\"2nd\":343,\"3rd\":245,\"4th\":82,\"total_value\":1951}),\"rail_position\":\"\",\"track_direction\":\"Right\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "JAYLA MAGIC (1) has her first outing without a trial but profiles nicely for this. Likely to be well fancied but watch market closely. MOLLY KEEPING (7) has finished in the placings both career runs so far, the latest when third (23.55) at this track. Expecting another bold showing. KATIE KEEPING (6) drew a squeeze box and was game in defeat when a close second, a neck from the winner Kia Mcgraw (23.37) at this track. Expected to be in this for a long way. LUMEAH BRIN (2) is a Garry Abernethy-trained newcomer by Brad Hill Billy out of Ferrero Miss. No trial form. Profiles nicely and can feature in the finish."
    ),
    venueId = "3a0b9f57-13a5-4ee7-b00c-6f43e42f54a2",
    venueName = "Dubbo",
    venueState = "NSW",
    venueCountry = "AUS"
)