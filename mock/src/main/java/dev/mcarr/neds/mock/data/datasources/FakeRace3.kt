package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace3() = RaceSummary(
    raceId = "10af6c65-cd58-4f57-b566-ad4b60a436ba",
    raceName = "Coastal Tipper Hire Hcp (C1)",
    raceNumber = 7,
    meetingId = "5099c3e7-5853-47a2-a8da-e5ed1e76ce9b",
    meetingName = "Gold Coast Poly",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729925940
    ),
    raceForm = RaceForm(
        distance = 1050,
        distanceType = DistanceType(
            id = "570775ae-09ec-42d5-989d-7c8f06366aa7",
            name = "Metres",
            shortName = "m"
        ),
        distanceTypeId = "570775ae-09ec-42d5-989d-7c8f06366aa7",
        trackCondition = TrackCondition(
            id = "9d03760c-88d2-4c89-9611-ae6eb7cdb76c",
            name = "Synthetic",
            shortName = "synthetic"
        ),
        trackConditionId = "9d03760c-88d2-4c89-9611-ae6eb7cdb76c",
        weather = Weather(
            id = "08e5f78c-1a36-11eb-9269-cef03e67f1a3",
            name = "FINE",
            shortName = "fine",
            iconUri = "FINE"
        ),
        weatherId = "08e5f78c-1a36-11eb-9269-cef03e67f1a3",
        raceComment = "SAMBUCA (3) resumes for the Freedman yard and is proven fresh. Was spelled of a Sunshine Coast Maiden win and didn't have the best of it in Open 2s last preparation. Has the ability and the betting will be key. MADAME PEARL'S (6) led and just found one better at Ipswich in stronger. Peaks now and won her Maiden here first up. Will get every chance from the soft gate. ROCK MELODY (8) switched freshened from a Victorian yard and didn't have much luck here well supported. Has the rail today and has pieces of form good enough. SOUTH BOAMBEE (5) resumed at Grafton and ran into a place. He has more up his sleeve and should be around the mark.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Gold Coast Poly\",\"state\":\"QLD\",\"country\":\"AUS\",\"number\":7,\"raceName\":\"Coastal Tipper Hire Hcp (C1)\",\"time\":\"2024-10-26T06:59:00Z\",\"class\":\"CL1\",\"start_type\":\"\",\"prizemonies\":{\"10th\":500,\"1st\":15600,\"2nd\":4800,\"3rd\":2650,\"4th\":1450,\"5th\":1000,\"6th\":500,\"7th\":500,\"8th\":500,\"9th\":500,\"total_value\":28000),\"localised_prizemonies\":{\"AUD\":{\"10th\":500,\"1st\":15600,\"2nd\":4800,\"3rd\":2650,\"4th\":1450,\"5th\":1000,\"6th\":500,\"7th\":500,\"8th\":500,\"9th\":500,\"total_value\":28000),\"NZD\":{\"10th\":545,\"1st\":17004,\"2nd\":5232,\"3rd\":2888,\"4th\":1581,\"5th\":1090,\"6th\":545,\"7th\":545,\"8th\":545,\"9th\":545,\"total_value\":30520}),\"rail_position\":\"True.\",\"track_direction\":\"Right\",\"track_surface\":\"Synthetic\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "SAMBUCA (3) resumes for the Freedman yard and is proven fresh. Was spelled of a Sunshine Coast Maiden win and didn't have the best of it in Open 2s last preparation. Has the ability and the betting will be key. MADAME PEARL'S (6) led and just found one better at Ipswich in stronger. Peaks now and won her Maiden here first up. Will get every chance from the soft gate. ROCK MELODY (8) switched freshened from a Victorian yard and didn't have much luck here well supported. Has the rail today and has pieces of form good enough. SOUTH BOAMBEE (5) resumed at Grafton and ran into a place. He has more up his sleeve and should be around the mark."
    ),
    venueId = "298980bd-8e29-4ea5-9936-e14cd8c64a78",
    venueName = "Gold Coast Poly",
    venueState = "QLD",
    venueCountry = "AUS"
)