package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace1() = RaceSummary(
    raceId = "0046d79f-2a35-449b-91a5-ab714bc7674c",
    raceName = "Ladbrokes Live Betting Hcp (58)",
    raceNumber = 3,
    meetingId = "c4ac9429-f865-4491-899d-00358afe048e",
    meetingName = "Darwin",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729925220
    ),
    raceForm = RaceForm(
        distance = 1100,
        distanceType = DistanceType(
            id = "570775ae-09ec-42d5-989d-7c8f06366aa7",
            name = "Metres",
            shortName = "m"
        ),
        distanceTypeId = "570775ae-09ec-42d5-989d-7c8f06366aa7",
        trackCondition = TrackCondition(
            id = "10a14653-a33d-11e7-810d-0a1a4ae29bd2",
            name = "Good",
            shortName = "good"
        ),
        trackConditionId = "10a14653-a33d-11e7-810d-0a1a4ae29bd2",
        weather = Weather(
            id = "08e5f78c-1a36-11eb-9269-cef03e67f1a3",
            name = "FINE",
            shortName = "fine",
            iconUri = "FINE"
        ),
        weatherId = "08e5f78c-1a36-11eb-9269-cef03e67f1a3",
        raceComment = "HOTIM ENGLISH (1) won as expected here 3 weeks ago but maybe not by 8-lengths. He won't find this any harder and looks headed for better things this season. On top. SCUDETTO (3) changed stables at the end of last season and resumed on a high with a tough win by a head here 5 weeks ago when racing handy to the pace. He can make full use of the pole position and should give the top pick plenty to think about. NY KEE (5) was nearly a month between starts when running on strongly to finish fifth here last week over 1000m. She will be a lot sharper this time and will relish the extra 100m to travel. A 4kg claim will see her right in the finish this time. HACHIMAN (7) has needed all 3 of his local starts since making the move from Victoria with travelling trainer Neil Dyer. He has a good draw and is poised to put his best hoof forward.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Darwin\",\"state\":\"NT\",\"country\":\"AUS\",\"number\":3,\"raceName\":\"Ladbrokes Live Betting Hcp (58)\",\"time\":\"2024-10-26T06:47:00Z\",\"class\":\"BM0-58\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":19500),\"localised_prizemonies\":{\"AUD\":{\"1st\":12675,\"2nd\":3900,\"3rd\":2925,\"total_value\":19500),\"NZD\":{\"1st\":13816,\"2nd\":4251,\"3rd\":3188,\"total_value\":21255}),\"rail_position\":\"True.\",\"track_direction\":\"Left\",\"track_surface\":\"Sand\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1780}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "HOTIM ENGLISH (1) won as expected here 3 weeks ago but maybe not by 8-lengths. He won't find this any harder and looks headed for better things this season. On top. SCUDETTO (3) changed stables at the end of last season and resumed on a high with a tough win by a head here 5 weeks ago when racing handy to the pace. He can make full use of the pole position and should give the top pick plenty to think about. NY KEE (5) was nearly a month between starts when running on strongly to finish fifth here last week over 1000m. She will be a lot sharper this time and will relish the extra 100m to travel. A 4kg claim will see her right in the finish this time. HACHIMAN (7) has needed all 3 of his local starts since making the move from Victoria with travelling trainer Neil Dyer. He has a good draw and is poised to put his best hoof forward."
    ),
    venueId = "c75b36a5-19f6-435a-b3e8-96b3e74d6f96",
    venueName = "Darwin",
    venueState = "NT",
    venueCountry = "AUS"
)