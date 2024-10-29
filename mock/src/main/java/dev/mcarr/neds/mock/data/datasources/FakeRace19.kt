package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace19() = RaceSummary(
    raceId = "c4a95850-b6e1-410c-a2c5-87d27f109cc7",
    raceName = "2024 Sa Square Trotters Association Legends Trot (Final) (Sky 2)",
    raceNumber = 3,
    meetingId = "6107b434-f38f-401a-822c-a7d59a567214",
    meetingName = "Globe Derby",
    categoryId = "161d9be2-e909-4326-8c2c-35ed71fb460b",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729928280
    ),
    raceForm = RaceForm(
        distance = 2230,
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
        raceComment = "RAKERO BLAZE (12) added to the strong form last start when she came from the 20m mark and scored by 2.2 metres at Gawler, giving her two wins and a second from her last three outings. Goes back another 10m in the handicap but she is up to the challenge. CONFISCATED (13) had this same handicap when second last start at Gawler, giving him two wins and two placings from four starts this campaign. Owns a good record at this circuit and distance. Big chance. PIESRIDINGSHOTGUN (3) comes right into contention after making it two wins in a row by scoring last start by more than 6 metres at Gawler. THE CLIPPER (1) must be respected having added to a string of wins and placings when second to Rakero Blaze last time at Gawler.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Globe Derby\",\"state\":\"SA\",\"country\":\"AUS\",\"number\":3,\"raceName\":\"2024 Sa Square Trotters Association Legends Trot (Final) (Sky 2)\",\"time\":\"2024-10-26T07:38:00Z\",\"class\":\"NR up to 56\",\"start_type\":\"Standing\",\"prizemonies\":{\"total_value\":9999),\"localised_prizemonies\":{\"AUD\":{\"10th\":142,\"1st\":6047,\"2nd\":1370,\"3rd\":850,\"4th\":283,\"5th\":189,\"6th\":142,\"7th\":142,\"8th\":142,\"9th\":142,\"total_value\":9999),\"NZD\":{\"10th\":155,\"1st\":6591,\"2nd\":1493,\"3rd\":927,\"4th\":308,\"5th\":206,\"6th\":155,\"7th\":155,\"8th\":155,\"9th\":155,\"total_value\":10899}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"T\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "RAKERO BLAZE (12) added to the strong form last start when she came from the 20m mark and scored by 2.2 metres at Gawler, giving her two wins and a second from her last three outings. Goes back another 10m in the handicap but she is up to the challenge. CONFISCATED (13) had this same handicap when second last start at Gawler, giving him two wins and two placings from four starts this campaign. Owns a good record at this circuit and distance. Big chance. PIESRIDINGSHOTGUN (3) comes right into contention after making it two wins in a row by scoring last start by more than 6 metres at Gawler. THE CLIPPER (1) must be respected having added to a string of wins and placings when second to Rakero Blaze last time at Gawler."
    ),
    venueId = "48a43944-90c3-42a3-855b-bb5b6112b551",
    venueName = "Globe Derby",
    venueState = "SA",
    venueCountry = "AUS"
)