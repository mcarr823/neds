package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace29() = RaceSummary(
    raceId = "fdffb1ea-e828-422e-8f87-8e366c0be332",
    raceName = "Sportsbet Green Ticks (325+ Rank)",
    raceNumber = 1,
    meetingId = "7e9e709f-ad47-4aba-a20a-7252e30ba2c4",
    meetingName = "Bendigo",
    categoryId = "9daef0d7-bf3c-4f50-921d-8e818c60fe61",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729926060
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
        raceComment = "ATLAS AMAZON (8) flew the lids with a fast early split last time, hitting the frame with a 0.8 lengths second (24.28) over 425m at this track and making it two placings on end. Capable of going well again. JAZZY HOPE (1) has been in the placings at her last two runs, most recently when third (23.10) in a Maiden over 400m at Geelong. Expected to bounce back to best. ASTON JOSIE (2) crossed over from out wide last start before finishing second (23.11) at Warrnambool in a Maiden over 390m. Expected to feature again. CRACKERJACK COOK (5) is right in the mix.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Bendigo\",\"state\":\"VIC\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Sportsbet Green Ticks (325+ Rank)\",\"time\":\"2024-10-26T07:01:00Z\",\"class\":\"Maiden\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":1530),\"localised_prizemonies\":{\"AUD\":{\"1st\":1000,\"2nd\":320,\"3rd\":160,\"4th\":50,\"total_value\":1530),\"NZD\":{\"1st\":1090,\"2nd\":349,\"3rd\":174,\"4th\":55,\"total_value\":1668}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "ATLAS AMAZON (8) flew the lids with a fast early split last time, hitting the frame with a 0.8 lengths second (24.28) over 425m at this track and making it two placings on end. Capable of going well again. JAZZY HOPE (1) has been in the placings at her last two runs, most recently when third (23.10) in a Maiden over 400m at Geelong. Expected to bounce back to best. ASTON JOSIE (2) crossed over from out wide last start before finishing second (23.11) at Warrnambool in a Maiden over 390m. Expected to feature again. CRACKERJACK COOK (5) is right in the mix."
    ),
    venueId = "ab57e842-c2b1-4508-b1c8-dfa908a2db54",
    venueName = "Bendigo",
    venueState = "VIC",
    venueCountry = "AUS"
)