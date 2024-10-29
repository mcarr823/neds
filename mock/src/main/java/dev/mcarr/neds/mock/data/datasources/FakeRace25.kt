package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace25() = RaceSummary(
    raceId = "f279b386-954f-48e6-90ed-4999a7b59e8d",
    raceName = "Mpc Kinetic Hcp (C1)",
    raceNumber = 1,
    meetingId = "3f9ed94f-43e6-4567-9e0d-2b5e499b4d73",
    meetingName = "Toowoomba",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729925100
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
        raceComment = "READY AND LUCKY (2) showed a lot of speed fresh up at Ipswich nearly 3 weeks ago over 1200m before folding up and finishing near the rear. She is better placed second up over 1050m and it is not often that the Tony Gollan-trained runners leave this track without picking up some of the main prize money. On top. SURREAL ASCOT (3) made steady progress last season and will be a lot stronger this time in work. She will eventually want more ground but with a 3kg claimer engaged to ride, she could well spring a surprise fresh up. HOKUSAI (6) just peaked on her run late over 800m at Warwick last time out after working too hard early on from a wide gate. She cops another nasty draw but with a change of luck, she can figure in the finish. COLTMAN (5) followed up a good run for fourth in his penultimate start at Grafton with a big maiden win here by 4 lengths 3 weeks ago. He has the pole position again and can take the next step immediately.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Toowoomba\",\"state\":\"QLD\",\"country\":\"AUS\",\"number\":1,\"raceName\":\"Mpc Kinetic Hcp (C1)\",\"time\":\"2024-10-26T06:45:00Z\",\"class\":\"CL1\",\"start_type\":\"\",\"prizemonies\":{\"10th\":420,\"1st\":12500,\"2nd\":3950,\"3rd\":2150,\"4th\":1050,\"5th\":750,\"6th\":420,\"7th\":420,\"8th\":420,\"9th\":420,\"total_value\":22500),\"localised_prizemonies\":{\"AUD\":{\"10th\":420,\"1st\":12500,\"2nd\":3950,\"3rd\":2150,\"4th\":1050,\"5th\":750,\"6th\":420,\"7th\":420,\"8th\":420,\"9th\":420,\"total_value\":22500),\"NZD\":{\"10th\":458,\"1st\":13625,\"2nd\":4306,\"3rd\":2344,\"4th\":1144,\"5th\":818,\"6th\":458,\"7th\":458,\"8th\":458,\"9th\":458,\"total_value\":24525}),\"rail_position\":\"+1m Entire. (Pent: 5.90)\",\"track_direction\":\"Right\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1760}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "READY AND LUCKY (2) showed a lot of speed fresh up at Ipswich nearly 3 weeks ago over 1200m before folding up and finishing near the rear. She is better placed second up over 1050m and it is not often that the Tony Gollan-trained runners leave this track without picking up some of the main prize money. On top. SURREAL ASCOT (3) made steady progress last season and will be a lot stronger this time in work. She will eventually want more ground but with a 3kg claimer engaged to ride, she could well spring a surprise fresh up. HOKUSAI (6) just peaked on her run late over 800m at Warwick last time out after working too hard early on from a wide gate. She cops another nasty draw but with a change of luck, she can figure in the finish. COLTMAN (5) followed up a good run for fourth in his penultimate start at Grafton with a big maiden win here by 4 lengths 3 weeks ago. He has the pole position again and can take the next step immediately."
    ),
    venueId = "37047790-893c-4f53-8c2b-d8f42419d6c3",
    venueName = "Toowoomba",
    venueState = "QLD",
    venueCountry = "AUS"
)