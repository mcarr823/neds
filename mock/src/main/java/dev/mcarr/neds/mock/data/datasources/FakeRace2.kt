package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace2() = RaceSummary(
    raceId = "07cde0ca-8fa5-450a-81e3-4a17982d318f",
    raceName = "Sportsbet Same Race Multi Hcp (72)",
    raceNumber = 9,
    meetingId = "5a72ebfb-c95e-4bfd-a604-eb40aa652531",
    meetingName = "Morphettville",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729926180
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
        raceComment = "ROCKSTAR MEGGSY (9) chased gamely into the frame when resuming two weeks ago at Murray Bridge, running good time. Steps out to a winning trip second-up but will just need some luck from the draw. Watch for her climbing over their backs late. THE MANSMAN (13) bounced back stylishly to the winner's circle last start. Not drawn as kindly this time as he drops back in trip. Is another that will be charging hard at the business end. ANNIE'S ROSE (14) has been freshened with a 42-day. Has kept the legs ticking over with a trial win and keeps the blinkers on. Expect her to be more prominent from the better draw. Win won't shock. SURPRISE COMING (4) strips fitter third-up on the short turnaround. Loves this trip and gets in well at the weights with the 2kg claimer sticking. Right in this. DELIGHTFUL SHECKY (3) was in terrific form last campaign and will take some stopping if he returns in that form.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Morphettville\",\"state\":\"SA\",\"country\":\"AUS\",\"number\":9,\"raceName\":\"Sportsbet Same Race Multi Hcp (72)\",\"time\":\"2024-10-26T07:03:00Z\",\"class\":\"BM0-72\",\"start_type\":\"\",\"prizemonies\":{\"10th\":1100,\"1st\":30000,\"2nd\":9800,\"3rd\":4900,\"4th\":2750,\"5th\":2050,\"6th\":1100,\"7th\":1100,\"8th\":1100,\"9th\":1100,\"total_value\":55000),\"localised_prizemonies\":{\"AUD\":{\"10th\":1100,\"1st\":30000,\"2nd\":9800,\"3rd\":4900,\"4th\":2750,\"5th\":2050,\"6th\":1100,\"7th\":1100,\"8th\":1100,\"9th\":1100,\"total_value\":55000),\"NZD\":{\"10th\":1199,\"1st\":32700,\"2nd\":10682,\"3rd\":5341,\"4th\":2998,\"5th\":2234,\"6th\":1199,\"6th-10th\":1200,\"7th\":1199,\"8th\":1199,\"9th\":1199,\"total_value\":59950}),\"rail_position\":\"+6m 1200m-W/Post, +3m Remainder; Sectional 608m. (Pent: 5.15)\",\"track_direction\":\"Left\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":2307}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "ROCKSTAR MEGGSY (9) chased gamely into the frame when resuming two weeks ago at Murray Bridge, running good time. Steps out to a winning trip second-up but will just need some luck from the draw. Watch for her climbing over their backs late. THE MANSMAN (13) bounced back stylishly to the winner's circle last start. Not drawn as kindly this time as he drops back in trip. Is another that will be charging hard at the business end. ANNIE'S ROSE (14) has been freshened with a 42-day. Has kept the legs ticking over with a trial win and keeps the blinkers on. Expect her to be more prominent from the better draw. Win won't shock. SURPRISE COMING (4) strips fitter third-up on the short turnaround. Loves this trip and gets in well at the weights with the 2kg claimer sticking. Right in this. DELIGHTFUL SHECKY (3) was in terrific form last campaign and will take some stopping if he returns in that form."
    ),
    venueId = "e9f5f48d-18c0-4279-bc83-c2e4bdb67a0d",
    venueName = "Morphettville",
    venueState = "SA",
    venueCountry = "AUS"
)