package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace27() = RaceSummary(
    raceId = "f7e7b8cd-4b8a-445f-9cee-cd96fb282c5c",
    raceName = "Jim Enright Celebrating 80Th Birthday (Bm48+)",
    raceNumber = 3,
    meetingId = "359dd1f0-62bc-4617-8aa0-8085bd5ae7c8",
    meetingName = "Collie",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729925820
    ),
    raceForm = RaceForm(
        distance = 1100,
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
        raceComment = "CRYSTALIST (1) changed his tactics in his penultimate start at Toodyay and led all the way for a soft win before settling back last time out at York and failing to run on. He is down in class and is expected to be ridden more positively early on around this circuit. Stick with him. Can win. GOT YA (5) will be closing in on his peak fitness third up and is well placed after a 2kg claim. She has been placed in her only run on this track and from a good draw, she is poised to put her best hoof forward. HERE NO CASH (2) has changed stables since his last run at Carnarvon in early June. He showed a lot of promise earlier in his career and maybe a change of scenery can bring about a change of luck. Each-way value. SOARING SOLO (8) has turned a corner recently with his form and his fourth at Northam 9 days ago is good enough form for a race like this.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Collie\",\"state\":\"WA\",\"country\":\"AUS\",\"number\":3,\"raceName\":\"Jim Enright Celebrating 80Th Birthday (Bm48+)\",\"time\":\"2024-10-26T06:57:00Z\",\"class\":\"BM48+\",\"start_type\":\"\",\"prizemonies\":{\"1st\":8470,\"2nd\":2884,\"3rd\":1330,\"4th\":616,\"5th\":420,\"total_value\":14000),\"localised_prizemonies\":{\"AUD\":{\"1st\":8470,\"2nd\":2884,\"3rd\":1330,\"4th\":616,\"5th\":420,\"total_value\":14000),\"NZD\":{\"1st\":9232,\"2nd\":3144,\"3rd\":1450,\"4th\":671,\"5th\":458,\"total_value\":15260}),\"rail_position\":\"True.\",\"track_direction\":\"Left\",\"track_surface\":\"Dirt\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "CRYSTALIST (1) changed his tactics in his penultimate start at Toodyay and led all the way for a soft win before settling back last time out at York and failing to run on. He is down in class and is expected to be ridden more positively early on around this circuit. Stick with him. Can win. GOT YA (5) will be closing in on his peak fitness third up and is well placed after a 2kg claim. She has been placed in her only run on this track and from a good draw, she is poised to put her best hoof forward. HERE NO CASH (2) has changed stables since his last run at Carnarvon in early June. He showed a lot of promise earlier in his career and maybe a change of scenery can bring about a change of luck. Each-way value. SOARING SOLO (8) has turned a corner recently with his form and his fourth at Northam 9 days ago is good enough form for a race like this."
    ),
    venueId = "eb0c989b-71d8-4c29-bc2c-fa27b1dfa652",
    venueName = "Collie",
    venueState = "WA",
    venueCountry = "AUS"
)