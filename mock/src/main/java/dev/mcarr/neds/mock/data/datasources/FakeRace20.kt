package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace20() = RaceSummary(
    raceId = "c6ea054d-1df5-48a4-881b-d22057fd821a",
    raceName = "Johnny Fox's (Bm66+)",
    raceNumber = 4,
    meetingId = "4b9aaa09-0ccf-4dbe-9b4c-3246ab5c2a9d",
    meetingName = "Ascot",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729924440
    ),
    raceForm = RaceForm(
        distance = 2200,
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
        raceComment = "SIMPLY (1) has gone to another level this time in work, winning his past couple and putting up some good figures in the process. He sat close to the speed and won by 1.7L last start and this looks to set up similarly with Pike remaining in the saddle. Hard to see anyone turning the tables on him today. MANAVENDRA (2) was expected to improve over this course and distance last start but was only just fair behind SIMPLY. He's better than he showed last start and he'll be better for that run. CJP hops back in the saddle now and a much better effort is anticipated. RED CADILLAC (3) has been racing well in feature races in Kalgoorlie recently and put herself into the finish of the Kalgoorlie Cup most recently. Those figures stack up highly in this event and she should get her chance from the draw. Can go close again. RYEWOOD (6) won impressively in Kalgoorlie last start and has claims. STOP DREAMING (4) is racing well and is worth plenty of thought.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Ascot\",\"state\":\"WA\",\"country\":\"AUS\",\"number\":4,\"raceName\":\"Johnny Fox's (Bm66+)\",\"time\":\"2024-10-26T06:34:00Z\",\"class\":\"BM66+\",\"start_type\":\"\",\"prizemonies\":{\"10th\":1440,\"1st\":43840,\"2nd\":14880,\"3rd\":7040,\"4th\":3120,\"5th\":2320,\"6th\":1440,\"7th\":1440,\"8th\":1440,\"9th\":1440,\"total_value\":80000),\"localised_prizemonies\":{\"AUD\":{\"10th\":1440,\"1st\":43840,\"2nd\":14880,\"3rd\":7040,\"4th\":3120,\"5th\":2320,\"6th\":1440,\"7th\":1440,\"8th\":1440,\"9th\":1440,\"total_value\":80000),\"NZD\":{\"10th\":1570,\"1st\":47786,\"2nd\":16219,\"3rd\":7674,\"4th\":3401,\"5th\":2529,\"6th\":1570,\"7th\":1570,\"8th\":1570,\"9th\":1570,\"total_value\":87200}),\"rail_position\":\"+6m Entire.\",\"track_direction\":\"Left\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":2000}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "SIMPLY (1) has gone to another level this time in work, winning his past couple and putting up some good figures in the process. He sat close to the speed and won by 1.7L last start and this looks to set up similarly with Pike remaining in the saddle. Hard to see anyone turning the tables on him today. MANAVENDRA (2) was expected to improve over this course and distance last start but was only just fair behind SIMPLY. He's better than he showed last start and he'll be better for that run. CJP hops back in the saddle now and a much better effort is anticipated. RED CADILLAC (3) has been racing well in feature races in Kalgoorlie recently and put herself into the finish of the Kalgoorlie Cup most recently. Those figures stack up highly in this event and she should get her chance from the draw. Can go close again. RYEWOOD (6) won impressively in Kalgoorlie last start and has claims. STOP DREAMING (4) is racing well and is worth plenty of thought."
    ),
    venueId = "de377157-f1bb-4a56-89aa-1c8ed1e7390b",
    venueName = "Ascot",
    venueState = "WA",
    venueCountry = "AUS"
)