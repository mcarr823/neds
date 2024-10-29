package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace18() = RaceSummary(
    raceId = "a1a9f25c-3ed7-48fb-b2d0-f4e125efc2f6",
    raceName = "Kevin & Kay Seymour Pace (Sky 2)",
    raceNumber = 1,
    meetingId = "6107b434-f38f-401a-822c-a7d59a567214",
    meetingName = "Globe Derby",
    categoryId = "161d9be2-e909-4326-8c2c-35ed71fb460b",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729924800
    ),
    raceForm = RaceForm(
        distance = 1800,
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
        raceComment = "ADAPT (7) makes his return having raced just once last campaign for a thumping win by 25m at Launceston in June. Hails from a top yard and was readied with an easy trial win at Melton. Hard to stop. SUGARPOVA (5) continued a string of wins and placings from last campaign when a resuming third most recently at Port Pirie. Three from three at this circuit and distance so must be included. Last-start winner MALACHITE ROCK (6) is next in line.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Globe Derby\",\"state\":\"SA\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Kevin \\u0026 Kay Seymour Pace (Sky 2)\",\"time\":\"2024-10-26T06:40:00Z\",\"class\":\"NR 52 to 59\",\"start_type\":\"Mobile\",\"prizemonies\":{\"total_value\":14500),\"localised_prizemonies\":{\"AUD\":{\"10th\":209,\"1st\":8928,\"2nd\":2023,\"3rd\":1256,\"4th\":419,\"5th\":279,\"6th\":209,\"7th\":209,\"8th\":209,\"9th\":209,\"total_value\":14500),\"NZD\":{\"10th\":228,\"1st\":9732,\"2nd\":2205,\"3rd\":1369,\"4th\":457,\"5th\":304,\"6th\":228,\"7th\":228,\"8th\":228,\"9th\":228,\"total_value\":15805}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"P\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "ADAPT (7) makes his return having raced just once last campaign for a thumping win by 25m at Launceston in June. Hails from a top yard and was readied with an easy trial win at Melton. Hard to stop. SUGARPOVA (5) continued a string of wins and placings from last campaign when a resuming third most recently at Port Pirie. Three from three at this circuit and distance so must be included. Last-start winner MALACHITE ROCK (6) is next in line."
    ),
    venueId = "48a43944-90c3-42a3-855b-bb5b6112b551",
    venueName = "Globe Derby",
    venueState = "SA",
    venueCountry = "AUS"
)