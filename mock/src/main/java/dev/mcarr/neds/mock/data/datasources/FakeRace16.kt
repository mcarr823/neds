package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace16() = RaceSummary(
    raceId = "8286d263-904b-442b-bf69-32c311380a2c",
    raceName = "Robrick Lodge Filante Hcp",
    raceNumber = 10,
    meetingId = "8681ee11-6db5-4ac6-ab01-970b4db8635f",
    meetingName = "Randwick",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729926600
    ),
    raceForm = RaceForm(
        distance = 1600,
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
        raceComment = "RIYAZAN (10) tough old gelding with his hoof on the till. Collared late when a narrow third to St Lawrence over 1600m here in BM94 grade on October 5. Sits on the limit with 52kg and is ready to win now. KINTYRE (5) set to peak fourth up after racing in much stronger grade this time in. Far from disgraced when ninth over 1600m in the G1 Epsom Handicap here on October 5. Senior rider is back on now and no excuses in this contest. Goes close. SOUNDS OF HEAVEN (9) backs up quickly third up after plugging late when 10th over 1600m in the G3 Angst at this track last Saturday. Blinkers go on and and she can take a hand in the finish with the 52kg. COMMUNIST (4) next best.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Randwick\",\"state\":\"NSW\",\"country\":\"AUS\",\"number\":10,\"raceName\":\"Robrick Lodge Filante Hcp\",\"time\":\"2024-10-26T07:10:00Z\",\"class\":\"Qlty\",\"start_type\":\"\",\"prizemonies\":{\"10th\":3500,\"1st\":82500,\"2nd\":29200,\"3rd\":14000,\"4th\":7100,\"5th\":5200,\"6th\":4000,\"7th\":3500,\"8th\":3500,\"9th\":3500,\"total_value\":160000),\"localised_prizemonies\":{\"AUD\":{\"10th\":3500,\"1st\":82500,\"2nd\":29200,\"3rd\":14000,\"4th\":7100,\"5th\":5200,\"6th\":4000,\"7th\":3500,\"8th\":3500,\"9th\":3500,\"total_value\":160000),\"NZD\":{\"10th\":3815,\"1st\":89925,\"2nd\":31828,\"3rd\":15260,\"4th\":7739,\"5th\":5668,\"6th\":4360,\"7th\":3815,\"7th-10th\":3800,\"8th\":3815,\"9th\":3815,\"total_value\":174400}),\"rail_position\":\"+5m 1600m-W/Post, +3m Remainder.\",\"track_direction\":\"Right\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":2224}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "RIYAZAN (10) tough old gelding with his hoof on the till. Collared late when a narrow third to St Lawrence over 1600m here in BM94 grade on October 5. Sits on the limit with 52kg and is ready to win now. KINTYRE (5) set to peak fourth up after racing in much stronger grade this time in. Far from disgraced when ninth over 1600m in the G1 Epsom Handicap here on October 5. Senior rider is back on now and no excuses in this contest. Goes close. SOUNDS OF HEAVEN (9) backs up quickly third up after plugging late when 10th over 1600m in the G3 Angst at this track last Saturday. Blinkers go on and and she can take a hand in the finish with the 52kg. COMMUNIST (4) next best."
    ),
    venueId = "fd9eab1e-03a5-4565-98c4-6eaf4f18da66",
    venueName = "Randwick",
    venueState = "NSW",
    venueCountry = "AUS"
)