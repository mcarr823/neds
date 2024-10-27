package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace23() = RaceSummary(
    raceId = "eaa39759-e58c-498c-9b72-87ba0ff14041",
    raceName = "Tabtouch Supports Collie Racing Mdn",
    raceNumber = 4,
    meetingId = "359dd1f0-62bc-4617-8aa0-8085bd5ae7c8",
    meetingName = "Collie",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927920
    ),
    raceForm = RaceForm(
        distance = 1400,
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
        raceComment = "LE GRAND JEU (1) has done everything but win a race and has been runner-up in his last 2 starts in similar company. He has not missed a cheque in 3 starts over the trip and from a good draw with the inform Mollie Clark in the irons, he could have his day in the sun. JATS (2) fought on well enough to finish third at Moora 3 weeks ago and will appreciate the extra furlong on offer here. He has 2kg less to carry this time and another top 3 finish is likely. WHAT SHOUT (9) has been mixing her form but does show a lot of pace which can be an advantage around this circuit. A wide draw will make things tougher but she is still worth each-way consideration in a field like this. ROO LORD (3) will find this easier than his last start at Northam and having Jerry Noske in the saddle around this circuit is a big advantage. Don't drop him.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Collie\",\"state\":\"WA\",\"country\":\"AUS\",\"number\":4,\"raceName\":\"Tabtouch Supports Collie Racing Mdn\",\"time\":\"2024-10-26T07:32:00Z\",\"class\":\"MDN\",\"start_type\":\"\",\"prizemonies\":{\"1st\":8470,\"2nd\":2884,\"3rd\":1330,\"4th\":616,\"5th\":420,\"total_value\":14000),\"localised_prizemonies\":{\"AUD\":{\"1st\":8470,\"2nd\":2884,\"3rd\":1330,\"4th\":616,\"5th\":420,\"total_value\":14000),\"NZD\":{\"1st\":9232,\"2nd\":3144,\"3rd\":1450,\"4th\":671,\"5th\":458,\"total_value\":15260}),\"rail_position\":\"True.\",\"track_direction\":\"Left\",\"track_surface\":\"Dirt\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "LE GRAND JEU (1) has done everything but win a race and has been runner-up in his last 2 starts in similar company. He has not missed a cheque in 3 starts over the trip and from a good draw with the inform Mollie Clark in the irons, he could have his day in the sun. JATS (2) fought on well enough to finish third at Moora 3 weeks ago and will appreciate the extra furlong on offer here. He has 2kg less to carry this time and another top 3 finish is likely. WHAT SHOUT (9) has been mixing her form but does show a lot of pace which can be an advantage around this circuit. A wide draw will make things tougher but she is still worth each-way consideration in a field like this. ROO LORD (3) will find this easier than his last start at Northam and having Jerry Noske in the saddle around this circuit is a big advantage. Don't drop him."
    ),
    venueId = "eb0c989b-71d8-4c29-bc2c-fa27b1dfa652",
    venueName = "Collie",
    venueState = "WA",
    venueCountry = "AUS"
)