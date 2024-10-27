package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace15() = RaceSummary(
    raceId = "7ba2eedd-1a17-404d-8475-afc0fa6d20b4",
    raceName = "Amron Boy @ Stud (1-3 Wins)",
    raceNumber = 1,
    meetingId = "b823e8b5-9c03-4682-b143-1d287439b72a",
    meetingName = "The Meadows",
    categoryId = "9daef0d7-bf3c-4f50-921d-8e818c60fe61",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927920
    ),
    raceForm = RaceForm(
        distance = 600,
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
        raceComment = "DROP OF INK (8) ran below best last time finishing fourth (30.90) over 525m at this track from Box 4. Has claims if she runs up to expectations. VIRAT (6) wasn't far away at the finish when 4th and beaten only 4.5 lengths (34.75) at Sandown. Should be in this for a long way. GRACE BURGESS (5) is super consistent overall, having placed seven of 15 career runs. Finished second (34.54) at Sandown latest and might be close to finding winning form again. Solid record at the distance winning two races. Although beaten ran one of the quickest times on the card last start. Expected to feature. PSYCHO BUDDY (7) placed last time and is worth some thought.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"The Meadows\",\"state\":\"VIC\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Amron Boy @ Stud (1-3 Wins)\",\"time\":\"2024-10-26T07:32:00Z\",\"class\":\"Restricted Win\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":10095),\"localised_prizemonies\":{\"AUD\":{\"1st\":6800,\"2nd\":2095,\"3rd\":1050,\"4th\":150,\"total_value\":10095),\"NZD\":{\"1st\":7412,\"2nd\":2284,\"3rd\":1144,\"4th\":164,\"total_value\":11004}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "DROP OF INK (8) ran below best last time finishing fourth (30.90) over 525m at this track from Box 4. Has claims if she runs up to expectations. VIRAT (6) wasn't far away at the finish when 4th and beaten only 4.5 lengths (34.75) at Sandown. Should be in this for a long way. GRACE BURGESS (5) is super consistent overall, having placed seven of 15 career runs. Finished second (34.54) at Sandown latest and might be close to finding winning form again. Solid record at the distance winning two races. Although beaten ran one of the quickest times on the card last start. Expected to feature. PSYCHO BUDDY (7) placed last time and is worth some thought."
    ),
    venueId = "0cf981d5-327c-4fe2-ba13-576abf0622d2",
    venueName = "The Meadows",
    venueState = "VIC",
    venueCountry = "AUS"
)