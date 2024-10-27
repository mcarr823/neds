package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace8() = RaceSummary(
    raceId = "4acd9ef7-2935-4cf9-8f80-f3ac6fa123d7",
    raceName = "Bendigo Advertiser (325+ Rank)",
    raceNumber = 2,
    meetingId = "7e9e709f-ad47-4aba-a20a-7252e30ba2c4",
    meetingName = "Bendigo",
    categoryId = "9daef0d7-bf3c-4f50-921d-8e818c60fe61",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927500
    ),
    raceForm = RaceForm(
        distance = 425,
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
            id = "5ba75165-3cec-11eb-88bb-36fbfdf5d97f",
            name = "OCAST",
            shortName = "ocast",
            iconUri = "OCAST"
        ),
        weatherId = "5ba75165-3cec-11eb-88bb-36fbfdf5d97f",
        raceComment = "BENGAL BEAST (1) is struggling to break through but racing consistently, finishing in the minors three starts on end. Last time out flew the lids with a fast early sectional but gathered in and finished in the minors when second (30.22) at Sandown over 515m. Makes plenty of appeal. TAKE NOTICE (6) was safely held last time out, finishing fifth at Ballarat over 390m behind Winter Goes (23.31) in a Maiden. Placed at his previous run. Form from his last run is proving strong. Likely to play a prominent role. OUT THE WINDOW (7) stalked the lead from a middle draw and boxed on well to finish 3.5 lengths back in third (24.48) at this track in a Maiden over 425m. Expecting another good run. ASTON NAXXAR (8) is worth including.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Bendigo\",\"state\":\"VIC\",\"country\":\"AUS\",\"number\":2,\"raceName\":\"Bendigo Advertiser (325+ Rank)\",\"time\":\"2024-10-26T07:25:00Z\",\"class\":\"Maiden\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":1530),\"localised_prizemonies\":{\"AUD\":{\"1st\":1000,\"2nd\":320,\"3rd\":160,\"4th\":50,\"total_value\":1530),\"NZD\":{\"1st\":1090,\"2nd\":349,\"3rd\":174,\"4th\":55,\"total_value\":1668}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "BENGAL BEAST (1) is struggling to break through but racing consistently, finishing in the minors three starts on end. Last time out flew the lids with a fast early sectional but gathered in and finished in the minors when second (30.22) at Sandown over 515m. Makes plenty of appeal. TAKE NOTICE (6) was safely held last time out, finishing fifth at Ballarat over 390m behind Winter Goes (23.31) in a Maiden. Placed at his previous run. Form from his last run is proving strong. Likely to play a prominent role. OUT THE WINDOW (7) stalked the lead from a middle draw and boxed on well to finish 3.5 lengths back in third (24.48) at this track in a Maiden over 425m. Expecting another good run. ASTON NAXXAR (8) is worth including."
    ),
    venueId = "ab57e842-c2b1-4508-b1c8-dfa908a2db54",
    venueName = "Bendigo",
    venueState = "VIC",
    venueCountry = "AUS"
)