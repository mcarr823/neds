package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace9() = RaceSummary(
    raceId = "4bf787f6-cc48-4c15-b84d-06226f57bd5a",
    raceName = "Ladbrokes Cox Plate Raceday Hcp",
    raceNumber = 9,
    meetingId = "0a055946-3c14-475b-aaa7-aaae1e7f0065",
    meetingName = "Doomben",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729924680
    ),
    raceForm = RaceForm(
        distance = 1110,
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
        raceComment = "XPRESSO (8) returned in good style over 1000m at Eagle Farm last start, stoking up late to be beaten under a length in a BM80. Tackling a better race today but drops sharply in the weights and gets to his pet distance. The one to beat in a tricky little race. SALTAIRE (7) is a major threat first-up from a 23-week spell for new trainer Tony Gollan. Ran on well to finish third behind Estriella in the Group 3 Sunlight Classic over 1100m at Flemington when resuming last prep. Thrown in at the weights. TIGER SHARK (4) raced handy but was no match for Wanda Rox in the closing stages when fresh from a spell recently. Steps up to a more suitable trip today and her Doomben form is excellent. Right in contention. RUBIQUITOUS (1) edged TIGER SHARK out of second spot at Eagle Farm last start to continue his resurgent form. Hasn't won for a while but cannot be underestimated. GOLDSBOROUGH (2) is another who has forgotten how to win but is one for the wider exotics.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Doomben\",\"state\":\"QLD\",\"country\":\"AUS\",\"number\":9,\"raceName\":\"Ladbrokes Cox Plate Raceday Hcp\",\"time\":\"2024-10-26T06:38:00Z\",\"class\":\"OPEN\",\"start_type\":\"\",\"prizemonies\":{\"10th\":1000,\"1st\":48800,\"2nd\":16400,\"3rd\":8400,\"4th\":4000,\"5th\":2400,\"6th\":1000,\"7th\":1000,\"8th\":1000,\"9th\":1000,\"total_value\":85000),\"localised_prizemonies\":{\"AUD\":{\"10th\":1000,\"1st\":48800,\"2nd\":16400,\"3rd\":8400,\"4th\":4000,\"5th\":2400,\"6th\":1000,\"7th\":1000,\"8th\":1000,\"9th\":1000,\"total_value\":85000),\"NZD\":{\"10th\":1090,\"1st\":53192,\"2nd\":17876,\"3rd\":9156,\"4th\":4360,\"5th\":2616,\"6th\":1090,\"7th\":1090,\"8th\":1090,\"9th\":1090,\"total_value\":92650}),\"rail_position\":\"+0.5m Entire. (Pent: 6.25)\",\"track_direction\":\"Right\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1750}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "XPRESSO (8) returned in good style over 1000m at Eagle Farm last start, stoking up late to be beaten under a length in a BM80. Tackling a better race today but drops sharply in the weights and gets to his pet distance. The one to beat in a tricky little race. SALTAIRE (7) is a major threat first-up from a 23-week spell for new trainer Tony Gollan. Ran on well to finish third behind Estriella in the Group 3 Sunlight Classic over 1100m at Flemington when resuming last prep. Thrown in at the weights. TIGER SHARK (4) raced handy but was no match for Wanda Rox in the closing stages when fresh from a spell recently. Steps up to a more suitable trip today and her Doomben form is excellent. Right in contention. RUBIQUITOUS (1) edged TIGER SHARK out of second spot at Eagle Farm last start to continue his resurgent form. Hasn't won for a while but cannot be underestimated. GOLDSBOROUGH (2) is another who has forgotten how to win but is one for the wider exotics."
    ),
    venueId = "fd49470f-c5ab-4c85-8db8-b93ba4c62cf8",
    venueName = "Doomben",
    venueState = "QLD",
    venueCountry = "AUS"
)