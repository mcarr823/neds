package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace4() = RaceSummary(
    raceId = "1dd4a93f-a603-461c-a2c0-778a86a5289d",
    raceName = "Happy 90Th Birthday Norma Mcnally Hrnsw Rising Stars (Penalty Exempt Event)",
    raceNumber = 1,
    meetingId = "6bd98ff0-bc66-42f4-b6d8-71397c6c4f30",
    meetingName = "Menangle",
    categoryId = "161d9be2-e909-4326-8c2c-35ed71fb460b",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927620
    ),
    raceForm = RaceForm(
        distance = 1609,
        distanceType = DistanceType(
            id = "570775ae-09ec-42d5-989d-7c8f06366aa7",
            name = "Metres",
            shortName = "m"
        ),
        distanceTypeId = "570775ae-09ec-42d5-989d-7c8f06366aa7",
        trackCondition = TrackCondition(
            id = "1db9cab0-b747-11ea-80cf-6a390f79827e",
            name = "Fast",
            shortName = "fast"
        ),
        trackConditionId = "1db9cab0-b747-11ea-80cf-6a390f79827e",
        weather = Weather(
            id = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
            name = "Fine",
            shortName = "fine",
            iconUri = "Fine"
        ),
        weatherId = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
        raceComment = "A low draw looks the key to the chances of REGAZZO DI TILLY (2). He hasn't been far away from wider barriers in the last two outings and recorded back-to-back seconds before that, one of them from this barrier. Gets his chance. WHISKEY CAVALIER NZ (8) is going well having scored here two back before placing in the last outing. Draws a little wider but has the gate speed to get across into a prominent spot. CRAFTMANS CHARLIE (1) drew the extreme outside when midfield in a Breeders Challenge race last week and had been racing well from wider barriers before that. The inside draw brings him right into contention. DOUBLE ACT (7) is a first-four player off the last-start placing.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Menangle\",\"state\":\"NSW\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Happy 90Th Birthday Norma Mcnally Hrnsw Rising Stars (Penalty Exempt Event)\",\"time\":\"2024-10-26T07:27:00Z\",\"class\":\"NR up to 95\",\"start_type\":\"Mobile\",\"prizemonies\":{\"1st\":10800,\"2nd\":3400,\"3rd\":2200,\"4th\":1200,\"5th\":800,\"total_value\":20400),\"localised_prizemonies\":{\"AUD\":{\"10th\":400,\"1st\":10800,\"2nd\":3400,\"3rd\":2200,\"4th\":1200,\"5th\":800,\"6th\":400,\"7th\":400,\"8th\":400,\"9th\":400,\"total_value\":20400),\"NZD\":{\"10th\":436,\"1st\":11772,\"2nd\":3706,\"3rd\":2398,\"4th\":1308,\"5th\":872,\"6th\":436,\"7th\":436,\"8th\":436,\"9th\":436,\"total_value\":22236}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"P\",\"track_home_straight_metres\":0,\"track_circumference\":1400}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "A low draw looks the key to the chances of REGAZZO DI TILLY (2). He hasn't been far away from wider barriers in the last two outings and recorded back-to-back seconds before that, one of them from this barrier. Gets his chance. WHISKEY CAVALIER NZ (8) is going well having scored here two back before placing in the last outing. Draws a little wider but has the gate speed to get across into a prominent spot. CRAFTMANS CHARLIE (1) drew the extreme outside when midfield in a Breeders Challenge race last week and had been racing well from wider barriers before that. The inside draw brings him right into contention. DOUBLE ACT (7) is a first-four player off the last-start placing."
    ),
    venueId = "3c765f4e-4517-44ad-b83c-7cdc41cbf9a3",
    venueName = "Menangle",
    venueState = "NSW",
    venueCountry = "AUS"
)