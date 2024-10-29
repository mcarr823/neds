package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace13() = RaceSummary(
    raceId = "64bd2805-9a76-4d70-8e13-b6e33835734f",
    raceName = "Tab Venue Mode",
    raceNumber = 1,
    meetingId = "c6155eb4-49ee-4cc5-8288-234142e4f643",
    meetingName = "Ipswich",
    categoryId = "9daef0d7-bf3c-4f50-921d-8e818c60fe61",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729928160
    ),
    raceForm = RaceForm(
        distance = 520,
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
        raceComment = "NO POINTS LEFT (8) had a tough draw to overcome and was game in defeat when only 1.5 lengths from Saiph in third (30.81) at this track. The form out of his last race has been franked. Leading chance again. CRYSTAL VISION (1) makes her first outing and has drawn to advantage. Expected to feature on debut. SOILY (2) returned a better run last time, finishing in the money (30.45) at Albion Park behind Seriously in a Maiden. Has the early speed to land on the pace and can stick on. Will give a great sight again. CRAB POT (4) cannot be overlooked following a recent top-three finish.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Ipswich\",\"state\":\"QLD\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Tab Venue Mode\",\"time\":\"2024-10-26T07:36:00Z\",\"class\":\"Maiden\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":5400),\"localised_prizemonies\":{\"AUD\":{\"1st\":3510,\"2nd\":1080,\"3rd\":540,\"4th\":270,\"total_value\":5400),\"NZD\":{\"1st\":3826,\"2nd\":1177,\"3rd\":589,\"4th\":294,\"total_value\":5886}),\"rail_position\":\"\",\"track_direction\":\"Right\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "NO POINTS LEFT (8) had a tough draw to overcome and was game in defeat when only 1.5 lengths from Saiph in third (30.81) at this track. The form out of his last race has been franked. Leading chance again. CRYSTAL VISION (1) makes her first outing and has drawn to advantage. Expected to feature on debut. SOILY (2) returned a better run last time, finishing in the money (30.45) at Albion Park behind Seriously in a Maiden. Has the early speed to land on the pace and can stick on. Will give a great sight again. CRAB POT (4) cannot be overlooked following a recent top-three finish."
    ),
    venueId = "a70506ee-3dd5-4741-baa1-cac6160badbc",
    venueName = "Ipswich",
    venueState = "QLD",
    venueCountry = "AUS"
)