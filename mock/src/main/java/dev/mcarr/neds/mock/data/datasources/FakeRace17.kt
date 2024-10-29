package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace17() = RaceSummary(
    raceId = "98bcae97-b748-40dd-96b9-19194c3b89a4",
    raceName = "Powerflo Solutions Tesio Stakes (G3)",
    raceNumber = 10,
    meetingId = "179b543e-c70f-4f0c-a883-f3bf4fb2ae59",
    meetingName = "Moonee Valley",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729925400
    ),
    raceForm = RaceForm(
        distance = 2040,
        distanceType = DistanceType(
            id = "570775ae-09ec-42d5-989d-7c8f06366aa7",
            name = "Metres",
            shortName = "m"
        ),
        distanceTypeId = "570775ae-09ec-42d5-989d-7c8f06366aa7",
        trackCondition = TrackCondition(
            id = "11d7e662-487a-11ea-9d54-4689356d4521",
            name = "Good4",
            shortName = "good4"
        ),
        trackConditionId = "11d7e662-487a-11ea-9d54-4689356d4521",
        weather = Weather(
            id = "08e5f78c-1a36-11eb-9269-cef03e67f1a3",
            name = "FINE",
            shortName = "fine",
            iconUri = "FINE"
        ),
        weatherId = "08e5f78c-1a36-11eb-9269-cef03e67f1a3",
        raceComment = "FIRESTORM (6) won her first two this time in, beating subsequent G1 placed Unusual Legacy two back before dropping in trip to the Epsom and running okay when 4.5 lengths off Ceolwulf. Like her getting back up in trip now from a perfect draw and D Lane on board. PRIVATE LEGACY (8) hit the line strongly second up at Caulfield over a mile and will be further improved up in trip. The inside draw could be a bit sticky. LITTLE MIX (5) wasn't beaten far fresh at Randwick over a mile and is suited up in trip. LADY JONES (7) is some query out to 2040m given she didn't really finish off over 1600m last time but she's racing well and must have some claims. MOLLY BLOOM (3) hasn't done much in two runs this time in but this is easier and she'll relish a rise in trip.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Moonee Valley\",\"state\":\"VIC\",\"country\":\"AUS\",\"number\":10,\"raceName\":\"Powerflo Solutions Tesio Stakes (G3)\",\"time\":\"2024-10-26T06:50:00Z\",\"class\":\"OPEN\",\"start_type\":\"\",\"prizemonies\":{\"1st\":180000,\"2nd\":54000,\"3rd\":27000,\"4th\":13500,\"5th\":7500,\"6th\":6000,\"7th\":6000,\"8th\":6000,\"total_value\":300000,\"trophy_total_value\":2000),\"localised_prizemonies\":{\"AUD\":{\"1st\":180000,\"2nd\":54000,\"3rd\":27000,\"4th\":13500,\"5th\":7500,\"6th\":6000,\"7th\":6000,\"8th\":6000,\"total_value\":300000),\"NZD\":{\"1st\":196200,\"2nd\":58860,\"3rd\":29430,\"4th\":14715,\"5th\":8175,\"6th\":6540,\"7th\":6540,\"8th\":6540,\"total_value\":327000}),\"rail_position\":\"True Entire Circuit.\",\"track_direction\":\"Left\",\"track_surface\":\"Turf\",\"group\":\"Group 3\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1805}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "FIRESTORM (6) won her first two this time in, beating subsequent G1 placed Unusual Legacy two back before dropping in trip to the Epsom and running okay when 4.5 lengths off Ceolwulf. Like her getting back up in trip now from a perfect draw and D Lane on board. PRIVATE LEGACY (8) hit the line strongly second up at Caulfield over a mile and will be further improved up in trip. The inside draw could be a bit sticky. LITTLE MIX (5) wasn't beaten far fresh at Randwick over a mile and is suited up in trip. LADY JONES (7) is some query out to 2040m given she didn't really finish off over 1600m last time but she's racing well and must have some claims. MOLLY BLOOM (3) hasn't done much in two runs this time in but this is easier and she'll relish a rise in trip."
    ),
    venueId = "e3fc9fca-d273-4dc6-9c75-2dc106e3709f",
    venueName = "Moonee Valley",
    venueState = "VIC",
    venueCountry = "AUS"
)