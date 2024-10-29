package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace5() = RaceSummary(
    raceId = "37f0f8ab-bee2-4cdc-b1d8-d68bb4ee26b6",
    raceName = "Johnsons Mme (Bm74)",
    raceNumber = 7,
    meetingId = "17e46d88-32d8-4643-b948-f5fb28776bf6",
    meetingName = "Albury",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729924920
    ),
    raceForm = RaceForm(
        distance = 1175,
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
        raceComment = "The speedy ARTHUR THE GREAT (5) was second-up from a long lay-off when a fighting second over this course and distance a fortnight ago. Strips fitter and although tackling a slightly better race today he looks ready to win. EAMONN'S MEMORY (1) backs up seven days after a modest sixth over 1300m at Wagga. Has raced twelve times at or around this distance with a better than 50% top-three strike rate. Well in after the claim so a better run is on the cards. EPAULLO CREED (4) won two on the bounce then failed when he went to Hawkesbury most recently. Boasts an outstanding record at this trip so back in his right grade he is a huge chance. The lightly raced DAZE OFF (10) struggled at Benalla last time. Gets some weight relief and the slightly longer trip is a plus. Distance specialist SOLVERE (6) has just missed at his two runs this prep. In the mix.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Albury\",\"state\":\"NSW\",\"country\":\"AUS\",\"number\":7,\"raceName\":\"Johnsons Mme (Bm74)\",\"time\":\"2024-10-26T06:42:00Z\",\"class\":\"BM74\",\"start_type\":\"\",\"prizemonies\":{\"10th\":500,\"1st\":13950,\"2nd\":5050,\"3rd\":2600,\"4th\":1300,\"5th\":825,\"6th\":600,\"7th\":500,\"8th\":500,\"9th\":500,\"total_value\":27000),\"localised_prizemonies\":{\"AUD\":{\"10th\":500,\"1st\":13950,\"2nd\":5050,\"3rd\":2600,\"4th\":1300,\"5th\":825,\"6th\":600,\"7th\":500,\"8th\":500,\"9th\":500,\"total_value\":27000),\"NZD\":{\"10th\":545,\"1st\":15206,\"2nd\":5504,\"3rd\":2834,\"4th\":1417,\"5th\":899,\"6th\":654,\"7th\":545,\"8th\":545,\"9th\":545,\"total_value\":29430}),\"rail_position\":\"True.\",\"track_direction\":\"Right\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":804}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "The speedy ARTHUR THE GREAT (5) was second-up from a long lay-off when a fighting second over this course and distance a fortnight ago. Strips fitter and although tackling a slightly better race today he looks ready to win. EAMONN'S MEMORY (1) backs up seven days after a modest sixth over 1300m at Wagga. Has raced twelve times at or around this distance with a better than 50% top-three strike rate. Well in after the claim so a better run is on the cards. EPAULLO CREED (4) won two on the bounce then failed when he went to Hawkesbury most recently. Boasts an outstanding record at this trip so back in his right grade he is a huge chance. The lightly raced DAZE OFF (10) struggled at Benalla last time. Gets some weight relief and the slightly longer trip is a plus. Distance specialist SOLVERE (6) has just missed at his two runs this prep. In the mix."
    ),
    venueId = "1c0cde59-2264-4c69-b896-7b908b9c8dce",
    venueName = "Albury",
    venueState = "NSW",
    venueCountry = "AUS"
)