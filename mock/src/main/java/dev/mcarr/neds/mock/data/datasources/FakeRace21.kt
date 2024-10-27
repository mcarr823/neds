package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace21() = RaceSummary(
    raceId = "ca48c302-9b4c-49eb-97a3-ccfca8ca573c",
    raceName = "Ycjac - Darby Mccarthy Cup (C3)",
    raceNumber = 2,
    meetingId = "3f9ed94f-43e6-4567-9e0d-2b5e499b4d73",
    meetingName = "Toowoomba",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927320
    ),
    raceForm = RaceForm(
        distance = 1000,
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
        raceComment = "TEN TRINITY SQUARE (5) was given plenty of time to mature before winning here as expected on debut by over 4 lengths. He has not been seen since then but must be worth waiting for. A 3kg claim means that he will carry 5.5kg less this time and he could well be too good again. ADALIE (3) has changed stables since finishing fifth on the Gold Coast 3 weeks ago. If he can find the form that he showed earlier in his career, then he could be very hard to beat. A market watch is advised. ELECTRIC ARROW (8) made it 2 wins from his last 5 starts when scoring by over a length at Gatton 25 days ago. She is proving to be hard to catch but she lands her best draw in a while and can go back to back. POINT BREAK (7) is much better than his form suggests and if he is in the right mood, he can figure in the top 3. Include in all combinations.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Toowoomba\",\"state\":\"QLD\",\"country\":\"AUS\",\"number\":2,\"raceName\":\"Ycjac - Darby Mccarthy Cup (C3)\",\"time\":\"2024-10-26T07:22:00Z\",\"class\":\"CL3\",\"start_type\":\"\",\"prizemonies\":{\"10th\":420,\"1st\":12500,\"2nd\":3950,\"3rd\":2150,\"4th\":1050,\"5th\":750,\"6th\":420,\"7th\":420,\"8th\":420,\"9th\":420,\"total_value\":22500),\"localised_prizemonies\":{\"AUD\":{\"10th\":420,\"1st\":12500,\"2nd\":3950,\"3rd\":2150,\"4th\":1050,\"5th\":750,\"6th\":420,\"7th\":420,\"8th\":420,\"9th\":420,\"total_value\":22500),\"NZD\":{\"10th\":458,\"1st\":13625,\"2nd\":4306,\"3rd\":2344,\"4th\":1144,\"5th\":818,\"6th\":458,\"7th\":458,\"8th\":458,\"9th\":458,\"total_value\":24525}),\"rail_position\":\"+1m Entire. (Pent: 5.90)\",\"track_direction\":\"Right\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1760}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "TEN TRINITY SQUARE (5) was given plenty of time to mature before winning here as expected on debut by over 4 lengths. He has not been seen since then but must be worth waiting for. A 3kg claim means that he will carry 5.5kg less this time and he could well be too good again. ADALIE (3) has changed stables since finishing fifth on the Gold Coast 3 weeks ago. If he can find the form that he showed earlier in his career, then he could be very hard to beat. A market watch is advised. ELECTRIC ARROW (8) made it 2 wins from his last 5 starts when scoring by over a length at Gatton 25 days ago. She is proving to be hard to catch but she lands her best draw in a while and can go back to back. POINT BREAK (7) is much better than his form suggests and if he is in the right mood, he can figure in the top 3. Include in all combinations."
    ),
    venueId = "37047790-893c-4f53-8c2b-d8f42419d6c3",
    venueName = "Toowoomba",
    venueState = "QLD",
    venueCountry = "AUS"
)