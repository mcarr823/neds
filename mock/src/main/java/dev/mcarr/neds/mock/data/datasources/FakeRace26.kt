package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace26() = RaceSummary(
    raceId = "f59a9157-9dd5-4a8c-bb7d-fa0f0599b632",
    raceName = "Alabar Nmw Pace",
    raceNumber = 1,
    meetingId = "4f33d6e4-d9e4-4414-8a1e-8e0653572a31",
    meetingName = "Melton",
    categoryId = "161d9be2-e909-4326-8c2c-35ed71fb460b",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729928100
    ),
    raceForm = RaceForm(
        distance = 2240,
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
        raceComment = "ROCKNALLOVERTHEWORLD (11) put the writing on the wall with a close-up placing here two back then delivered last start, racing wide early before finding the front and going on to score by 4.7 metres at Geelong. Tricky draw but is race fit now and steps up to a distance where he owns a good record. ANOTHER NIEN (10) has been racing well and deserved his victory last start, scoring by 2.5 metres at Charlton. No favours expected from this draw but with even luck could go back-to-back. WOTDIDUSAAAY (12) raced wide when midfield last start but has claims off a win from a wide barrier two back at Cranbourne. SPORTS WRACK (2) found winning form last start and the good draw gives him every chance to go on with it.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Melton\",\"state\":\"VIC\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Alabar Nmw Pace\",\"time\":\"2024-10-26T07:35:00Z\",\"class\":\"0W/15\",\"start_type\":\"Mobile\",\"prizemonies\":{\"total_value\":15000),\"localised_prizemonies\":{\"AUD\":{\"10th\":300,\"1st\":8550,\"2nd\":2250,\"3rd\":1500,\"4th\":750,\"5th\":450,\"6th\":300,\"7th\":300,\"8th\":300,\"9th\":300,\"total_value\":15000),\"NZD\":{\"10th\":327,\"1st\":9320,\"2nd\":2452,\"3rd\":1635,\"4th\":818,\"5th\":491,\"6th\":327,\"7th\":327,\"8th\":327,\"9th\":327,\"total_value\":16350}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"P\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "ROCKNALLOVERTHEWORLD (11) put the writing on the wall with a close-up placing here two back then delivered last start, racing wide early before finding the front and going on to score by 4.7 metres at Geelong. Tricky draw but is race fit now and steps up to a distance where he owns a good record. ANOTHER NIEN (10) has been racing well and deserved his victory last start, scoring by 2.5 metres at Charlton. No favours expected from this draw but with even luck could go back-to-back. WOTDIDUSAAAY (12) raced wide when midfield last start but has claims off a win from a wide barrier two back at Cranbourne. SPORTS WRACK (2) found winning form last start and the good draw gives him every chance to go on with it."
    ),
    venueId = "1107e83a-d8d4-497a-b7d8-cee52851f9b0",
    venueName = "Melton",
    venueState = "VIC",
    venueCountry = "AUS"
)