package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace28() = RaceSummary(
    raceId = "f8ff3bdb-a730-4feb-ab00-ea8957403f57",
    raceName = "5 1/2F Hcap",
    raceNumber = 4,
    meetingId = "2267bb31-bb7c-4eaf-9f9c-89ddeb312b47",
    meetingName = "Selangor",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729926900
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
        raceComment = "SUPER MANJUNG (4) was in contention all the way and fought on for third last start over 1200m at this track, making it two minor placings in a row. Finds a suitable race and can play a major role. TIPPING POINT (6) started at ${'$'}4.60 last time and ran below expectations, finishing fifth and beaten 4.5 lengths at this track over 1200m after being prominent at the corner. Looks well placed so expect a big run this time. TERMS OF REFERENCE (9) came home strongly last start to finish third, beaten a head, over 1150m at this track. Will drift back but wind up late. One to consider. SAHM (8) didn't make an impact at his last run before going for a spell on August 11 finishing seventh and beaten 8 lengths over 1500m at this track. Has found a suitable race and is worth including.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Selangor\",\"state\":\"MYS\",\"country\":\"MYS\",\"number\":4,\"raceName\":\"5 1/2F Hcap\",\"time\":\"2024-10-26T07:15:00Z\",\"class\":\"CL4, RBH44-61\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":10526),\"localised_prizemonies\":{\"AUD\":{\"total_value\":10526),\"NZD\":{\"total_value\":11473}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "SUPER MANJUNG (4) was in contention all the way and fought on for third last start over 1200m at this track, making it two minor placings in a row. Finds a suitable race and can play a major role. TIPPING POINT (6) started at ${'$'}4.60 last time and ran below expectations, finishing fifth and beaten 4.5 lengths at this track over 1200m after being prominent at the corner. Looks well placed so expect a big run this time. TERMS OF REFERENCE (9) came home strongly last start to finish third, beaten a head, over 1150m at this track. Will drift back but wind up late. One to consider. SAHM (8) didn't make an impact at his last run before going for a spell on August 11 finishing seventh and beaten 8 lengths over 1500m at this track. Has found a suitable race and is worth including."
    ),
    venueId = "d39fd66a-e0fe-4fab-88ae-023834ba177e",
    venueName = "Selangor",
    venueState = "MYS",
    venueCountry = "MYS"
)