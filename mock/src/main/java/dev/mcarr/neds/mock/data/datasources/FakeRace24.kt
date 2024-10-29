package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace24() = RaceSummary(
    raceId = "efb299ae-590d-4fdd-b979-1e1c650ab4a9",
    raceName = "Leyton Property Group (Rs1mw)",
    raceNumber = 5,
    meetingId = "4b9aaa09-0ccf-4dbe-9b4c-3246ab5c2a9d",
    meetingName = "Ascot",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729926840
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
            id = "11d7e662-487a-11ea-9d54-4689356d4521",
            name = "Good4",
            shortName = "good4"
        ),
        trackConditionId = "11d7e662-487a-11ea-9d54-4689356d4521",
        weather = Weather(
            id = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
            name = "Fine",
            shortName = "fine",
            iconUri = "Fine"
        ),
        weatherId = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
        raceComment = "FULL OF MERIT (9) led them up at Kalgoorlie last start and kicked away to win impressively, scoring by 2L. She has the speed to offset the wide alley and Pike remaining in the saddle is a big tick. Looks to be trending the right way and she can bring up back-to-back wins in this suitable race. SPEAK TO ME (1) comes into this third-up following a strong run over 1200m here last time out. He does improve getting out to this trip and while he may get back from the draw, he's run on strongly in previous efforts. Rates well and won't be far away. OLYMPIC PARK (12) was an impressive winner on debut at Bunbury 33 days ago and the form out of his maiden win was fantastic. He may get a long way back from the draw, but if he can improve on the fresh effort he's sure to be steaming home late. MAJOR MARIO (7) hardly puts in a bad run and is sure to be in the finish again. YARRALEA (5) can be thereabouts first-up with Chris Parnham in the saddle.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Ascot\",\"state\":\"WA\",\"country\":\"AUS\",\"number\":5,\"raceName\":\"Leyton Property Group (Rs1mw)\",\"time\":\"2024-10-26T07:14:00Z\",\"class\":\"1MW\",\"start_type\":\"\",\"prizemonies\":{\"10th\":1080,\"1st\":32880,\"2nd\":11160,\"3rd\":5280,\"4th\":2340,\"5th\":1740,\"6th\":1080,\"7th\":1080,\"8th\":1080,\"9th\":1080,\"total_value\":60000),\"localised_prizemonies\":{\"AUD\":{\"10th\":1080,\"1st\":32880,\"2nd\":11160,\"3rd\":5280,\"4th\":2340,\"5th\":1740,\"6th\":1080,\"7th\":1080,\"8th\":1080,\"9th\":1080,\"total_value\":60000),\"NZD\":{\"10th\":1177,\"1st\":35839,\"2nd\":12164,\"3rd\":5755,\"4th\":2551,\"5th\":1897,\"6th\":1177,\"7th\":1177,\"8th\":1177,\"9th\":1177,\"total_value\":65400}),\"rail_position\":\"+6m Entire.\",\"track_direction\":\"Left\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":2000}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "FULL OF MERIT (9) led them up at Kalgoorlie last start and kicked away to win impressively, scoring by 2L. She has the speed to offset the wide alley and Pike remaining in the saddle is a big tick. Looks to be trending the right way and she can bring up back-to-back wins in this suitable race. SPEAK TO ME (1) comes into this third-up following a strong run over 1200m here last time out. He does improve getting out to this trip and while he may get back from the draw, he's run on strongly in previous efforts. Rates well and won't be far away. OLYMPIC PARK (12) was an impressive winner on debut at Bunbury 33 days ago and the form out of his maiden win was fantastic. He may get a long way back from the draw, but if he can improve on the fresh effort he's sure to be steaming home late. MAJOR MARIO (7) hardly puts in a bad run and is sure to be in the finish again. YARRALEA (5) can be thereabouts first-up with Chris Parnham in the saddle."
    ),
    venueId = "de377157-f1bb-4a56-89aa-1c8ed1e7390b",
    venueName = "Ascot",
    venueState = "WA",
    venueCountry = "AUS"
)