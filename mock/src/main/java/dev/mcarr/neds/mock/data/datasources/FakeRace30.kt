package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace30() = RaceSummary(
    raceId ="fe2571a1-c796-436e-90f8-8e0394141cb7",
    raceName ="Northside Trophies Pace (Sky 2)",
    raceNumber =2,
    meetingId ="6107b434-f38f-401a-822c-a7d59a567214",
    meetingName ="Globe Derby",
    categoryId ="161d9be2-e909-4326-8c2c-35ed71fb460b",
    advertisedStart = RaceAdvertisedStart(
        seconds =1729926300
    ),
    raceForm = RaceForm(
        distance =2230,
        distanceType = DistanceType(
            id ="570775ae-09ec-42d5-989d-7c8f06366aa7",
            name ="Metres",
            shortName ="m"
        ),
        distanceTypeId ="570775ae-09ec-42d5-989d-7c8f06366aa7",
        trackCondition = TrackCondition(
            id ="10a14653-a33d-11e7-810d-0a1a4ae29bd2",
            name ="Good",
            shortName ="good"
        ),
        trackConditionId ="10a14653-a33d-11e7-810d-0a1a4ae29bd2",
        weather = Weather(
            id ="08e5f78c-1a36-11eb-9269-cef03e67f1a3",
            name ="FINE",
            shortName ="fine",
            iconUri ="FINE"
        ),
        weatherId ="08e5f78c-1a36-11eb-9269-cef03e67f1a3",
        raceComment ="DELIGHTFUL MAJOR (1) led from a wider barrier and stuck on well for a 1.9m second at Gawler last time. Led to score at that same venue last month so has the gate speed to take advantage of the ace draw. AINTSOBAD (2) has been excellent of late and made it two wins in a row when successful at his latest appearance at Gawler, getting home by 2.5 metres. Led there and draws to be prominent again. Leading hope. LETHAL LOUIE (6) has a strong fresh record with two wins and a placing from three attempts and will be ready to go off two trial wins. MOHS EM DOWN (8) has taken on decent opposition in the last two outings and was racing well before that. Respect.",
        additionalData ="{\"revealed_race_info\":{\"track_name\":\"Globe Derby\",\"state\":\"SA\",\"country\":\"AUS\",\"number\":2,\"raceName\":\"Northside Trophies Pace (Sky 2)\",\"time\":\"2024-10-26T07:05:00Z\",\"class\":\"NR 60 to 69\",\"start_type\":\"Mobile\",\"prizemonies\":{\"total_value\":9999),\"localised_prizemonies\":{\"AUD\":{\"10th\":142,\"1st\":6047,\"2nd\":1370,\"3rd\":850,\"4th\":283,\"5th\":189,\"6th\":142,\"7th\":142,\"8th\":142,\"9th\":142,\"total_value\":9999),\"NZD\":{\"10th\":155,\"1st\":6591,\"2nd\":1493,\"3rd\":927,\"4th\":308,\"5th\":206,\"6th\":155,\"7th\":155,\"8th\":155,\"9th\":155,\"total_value\":10899}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"P\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated =1,
        silkBaseUrl ="drr38safykj6s.cloudfront.net",
        raceCommentAlternative ="DELIGHTFUL MAJOR (1) led from a wider barrier and stuck on well for a 1.9m second at Gawler last time. Led to score at that same venue last month so has the gate speed to take advantage of the ace draw. AINTSOBAD (2) has been excellent of late and made it two wins in a row when successful at his latest appearance at Gawler, getting home by 2.5 metres. Led there and draws to be prominent again. Leading hope. LETHAL LOUIE (6) has a strong fresh record with two wins and a placing from three attempts and will be ready to go off two trial wins. MOHS EM DOWN (8) has taken on decent opposition in the last two outings and was racing well before that. Respect."
    ),
    venueId ="48a43944-90c3-42a3-855b-bb5b6112b551",
    venueName ="Globe Derby",
    venueState ="SA",
    venueCountry ="AUS"
)