package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace22() = RaceSummary(
    raceId = "e4f9ea21-17ef-42a9-8f51-c301512b03d1",
    raceName = "Ray White Shellharbour (Bm64)",
    raceNumber = 8,
    meetingId = "93522ff2-7bd3-4195-960f-e59d5aa77dcd",
    meetingName = "Kembla Grange",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729925700
    ),
    raceForm = RaceForm(
        distance = 1200,
        distanceType = DistanceType(
            id = "570775ae-09ec-42d5-989d-7c8f06366aa7",
            name = "Metres",
            shortName = "m"
        ),
        distanceTypeId = "570775ae-09ec-42d5-989d-7c8f06366aa7",
        trackCondition = TrackCondition(
            id = "908a410f-ab10-11e7-85e3-0641c90711b8",
            name = "Good3",
            shortName = "good3"
        ),
        trackConditionId = "908a410f-ab10-11e7-85e3-0641c90711b8",
        weather = Weather(
            id = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
            name = "Fine",
            shortName = "fine",
            iconUri = "Fine"
        ),
        weatherId = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
        raceComment = "MAGIC SHADOW (9) comes through the right type of races into this but will drift back early from a shadowy draw. Nicely weighted with the claim and is a must for quaddie players. ALL MACHIAVELLIAN (4) ran well in strong races last campaign and is always capable of a knockout result early in her campaign. Trialling well into this and ideally drawn. UP THE FRONT (10) tried hard in similar grade last start clocking good closing sectionals along the way. Progressive type up to this trip for the first time. Each-way now. SETON HALL (2) resumes and looks to have come back in good order. Has his share of ability and is expected to feature prominently.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Kembla Grange\",\"state\":\"NSW\",\"country\":\"AUS\",\"number\":8,\"raceName\":\"Ray White Shellharbour (Bm64)\",\"time\":\"2024-10-26T06:55:00Z\",\"class\":\"BM64\",\"start_type\":\"\",\"prizemonies\":{\"10th\":1050,\"1st\":20550,\"2nd\":7450,\"3rd\":3900,\"4th\":2300,\"5th\":1400,\"6th\":1150,\"7th\":1050,\"8th\":1050,\"9th\":1050,\"total_value\":42000),\"localised_prizemonies\":{\"AUD\":{\"10th\":1050,\"1st\":20550,\"2nd\":7450,\"3rd\":3900,\"4th\":2300,\"5th\":1400,\"6th\":1150,\"7th\":1050,\"8th\":1050,\"9th\":1050,\"total_value\":42000),\"NZD\":{\"10th\":1144,\"1st\":22400,\"2nd\":8121,\"3rd\":4251,\"4th\":2507,\"5th\":1526,\"6th\":1254,\"7th\":1144,\"7th-10th\":1140,\"8th\":1144,\"9th\":1144,\"total_value\":45780}),\"rail_position\":\"True.\",\"track_direction\":\"Right\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":2200}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "MAGIC SHADOW (9) comes through the right type of races into this but will drift back early from a shadowy draw. Nicely weighted with the claim and is a must for quaddie players. ALL MACHIAVELLIAN (4) ran well in strong races last campaign and is always capable of a knockout result early in her campaign. Trialling well into this and ideally drawn. UP THE FRONT (10) tried hard in similar grade last start clocking good closing sectionals along the way. Progressive type up to this trip for the first time. Each-way now. SETON HALL (2) resumes and looks to have come back in good order. Has his share of ability and is expected to feature prominently."
    ),
    venueId = "6932eba9-6acb-4f6e-ba81-c384e845d146",
    venueName = "Kembla Grange",
    venueState = "NSW",
    venueCountry = "AUS"
)