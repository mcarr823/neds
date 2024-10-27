package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace14() = RaceSummary(
    raceId = "70d9fd3c-c22f-46b5-8c15-0faab12fb7ad",
    raceName = "Ladbrokes Hub Hcp (64)",
    raceNumber = 4,
    meetingId = "c4ac9429-f865-4491-899d-00358afe048e",
    meetingName = "Darwin",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729927200
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
        raceComment = "PATRIOTIC KING (1) finished fifth in stronger company here 6 weeks ago and has the bar plates off for the first time. He is down in grade and with Jarrod Todd back in the saddle, he is the one to beat. MISS BLACK DIAMOND (4) has been racing consistently this season after making the move from Victoria. She has been freshened up since her last run at Kununurra 6 weeks ago and should make her presence felt in this. WILD BEAU (3) is resuming from a spell after winning twice in a 3-start campaign last season. He normally comes to hand quickly and a bold run is on the cards, especially in the small field. SEVEN SECRETS (2) showed ability when trained in South Australia and that form will hold up nicely in this. The blinkers are off fresh up and from a good draw, he can figure in the finish. A market watch is advised. STORY OF STELLA (5) has yet to fully hit her straps this season after leaving a Queensland stable. She has the pole position and has some place claims.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Darwin\",\"state\":\"NT\",\"country\":\"AUS\",\"number\":4,\"raceName\":\"Ladbrokes Hub Hcp (64)\",\"time\":\"2024-10-26T07:20:00Z\",\"class\":\"BM0-64\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":20500),\"localised_prizemonies\":{\"AUD\":{\"1st\":13325,\"2nd\":4100,\"3rd\":3075,\"total_value\":20500),\"NZD\":{\"1st\":14524,\"2nd\":4469,\"3rd\":3352,\"total_value\":22345}),\"rail_position\":\"True.\",\"track_direction\":\"Left\",\"track_surface\":\"Sand\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1780}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "PATRIOTIC KING (1) finished fifth in stronger company here 6 weeks ago and has the bar plates off for the first time. He is down in grade and with Jarrod Todd back in the saddle, he is the one to beat. MISS BLACK DIAMOND (4) has been racing consistently this season after making the move from Victoria. She has been freshened up since her last run at Kununurra 6 weeks ago and should make her presence felt in this. WILD BEAU (3) is resuming from a spell after winning twice in a 3-start campaign last season. He normally comes to hand quickly and a bold run is on the cards, especially in the small field. SEVEN SECRETS (2) showed ability when trained in South Australia and that form will hold up nicely in this. The blinkers are off fresh up and from a good draw, he can figure in the finish. A market watch is advised. STORY OF STELLA (5) has yet to fully hit her straps this season after leaving a Queensland stable. She has the pole position and has some place claims."
    ),
    venueId = "c75b36a5-19f6-435a-b3e8-96b3e74d6f96",
    venueName = "Darwin",
    venueState = "NT",
    venueCountry = "AUS"
)