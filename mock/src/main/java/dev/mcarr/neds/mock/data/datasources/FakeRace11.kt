package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace11() = RaceSummary(
    raceId = "4d94f0b8-ddc9-4dde-83f0-c6ad8db7958a",
    raceName = "Ladbrokes Romantic Warrior 2023 (Bm85)",
    raceNumber = 10,
    meetingId = "0a055946-3c14-475b-aaa7-aaae1e7f0065",
    meetingName = "Doomben",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927080
    ),
    raceForm = RaceForm(
        distance = 1350,
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
        raceComment = "BETTCHA THE CROWN (9) raced handy and looked a chance all the way down the running but missed out narrowly when resuming over this course and distance three weeks ago. Up in class but gets some weight relief. Only needs a bit of luck from the sticky gate to be right in the finish again. Genuine gelding BLAKMAX (4) led but was collared late in a Class 6 over 1400m at Eagle Farm a fortnight ago. Draws his best barrier for some time. Track and distance specialist who is a huge threat. SHA OF GOMER (5) continues to thrive in Queensland for Waller. Battled on bravely again under a big weight at Eagle Farm last time but was edged out at the end of 1400m. Expecting more of the same. NED'S GULLY (1) has been thereabouts all prep in better races than this. Very fit and gets his chance. I AM ARTIE (6) has won each of his five races since coming back from a 14-month spell for new trainer Paul Jenkins. Steps up another level today but a sixth straight win is a real possibility.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Doomben\",\"state\":\"QLD\",\"country\":\"AUS\",\"number\":10,\"raceName\":\"Ladbrokes Romantic Warrior 2023 (Bm85)\",\"time\":\"2024-10-26T07:18:00Z\",\"class\":\"BM85\",\"start_type\":\"\",\"prizemonies\":{\"10th\":1000,\"1st\":48800,\"2nd\":16400,\"3rd\":8400,\"4th\":4000,\"5th\":2400,\"6th\":1000,\"7th\":1000,\"8th\":1000,\"9th\":1000,\"total_value\":85000),\"localised_prizemonies\":{\"AUD\":{\"10th\":1000,\"1st\":48800,\"2nd\":16400,\"3rd\":8400,\"4th\":4000,\"5th\":2400,\"6th\":1000,\"7th\":1000,\"8th\":1000,\"9th\":1000,\"total_value\":85000),\"NZD\":{\"10th\":1090,\"1st\":53192,\"2nd\":17876,\"3rd\":9156,\"4th\":4360,\"5th\":2616,\"6th\":1090,\"7th\":1090,\"8th\":1090,\"9th\":1090,\"total_value\":92650}),\"rail_position\":\"+0.5m Entire. (Pent: 6.25)\",\"track_direction\":\"Right\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1750}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "BETTCHA THE CROWN (9) raced handy and looked a chance all the way down the running but missed out narrowly when resuming over this course and distance three weeks ago. Up in class but gets some weight relief. Only needs a bit of luck from the sticky gate to be right in the finish again. Genuine gelding BLAKMAX (4) led but was collared late in a Class 6 over 1400m at Eagle Farm a fortnight ago. Draws his best barrier for some time. Track and distance specialist who is a huge threat. SHA OF GOMER (5) continues to thrive in Queensland for Waller. Battled on bravely again under a big weight at Eagle Farm last time but was edged out at the end of 1400m. Expecting more of the same. NED'S GULLY (1) has been thereabouts all prep in better races than this. Very fit and gets his chance. I AM ARTIE (6) has won each of his five races since coming back from a 14-month spell for new trainer Paul Jenkins. Steps up another level today but a sixth straight win is a real possibility."
    ),
    venueId = "fd49470f-c5ab-4c85-8db8-b93ba4c62cf8",
    venueName = "Doomben",
    venueState = "QLD",
    venueCountry = "AUS"
)