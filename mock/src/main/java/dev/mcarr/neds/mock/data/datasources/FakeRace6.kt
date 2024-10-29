package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace6() = RaceSummary(
    raceId = "3938baf4-d746-47af-9809-0f5becc00617",
    raceName = "Ridley (Bm58)",
    raceNumber = 8,
    meetingId = "a65c17eb-cdba-40fe-b179-9b2b3bb7f109",
    meetingName = "St Arnaud",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729924560
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
        raceComment = "DANTOOINE (2) brings strong improving form to resumption and just missed his only fresh outing. Gets in well with the 2kg claim but has to manage the outside barrier. The betting will be key with him. VERBOSITY (1) resumes with a tidy effort and has more to give. Has a 1.5kg claim and can make the finish.  BRAZEN BRANDO (6) has an awkward barrier but will race forward and his best form would see him a chance. CHIQ MAGNET (3) resumes and Meech is reunited. Maps for the run of the race and has placed 2/4 first-up. In the mix as well. KOYUGA BREEZE (4) resumes and deserves a look.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"St Arnaud\",\"state\":\"VIC\",\"country\":\"AUS\",\"number\":8,\"raceName\":\"Ridley (Bm58)\",\"time\":\"2024-10-26T06:36:00Z\",\"class\":\"BM58\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":20000),\"localised_prizemonies\":{\"AUD\":{\"10th\":500,\"1st\":11000,\"2nd\":3400,\"3rd\":1700,\"4th\":900,\"5th\":500,\"6th\":500,\"7th\":500,\"8th\":500,\"9th\":500,\"total_value\":20000),\"NZD\":{\"10th\":545,\"1st\":11990,\"2nd\":3706,\"3rd\":1853,\"4th\":981,\"5th\":545,\"6th\":545,\"7th\":545,\"8th\":545,\"9th\":545,\"total_value\":21800}),\"rail_position\":\"True Entire Circuit. (Pent: 5.29)\",\"track_direction\":\"Left\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":1600}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "DANTOOINE (2) brings strong improving form to resumption and just missed his only fresh outing. Gets in well with the 2kg claim but has to manage the outside barrier. The betting will be key with him. VERBOSITY (1) resumes with a tidy effort and has more to give. Has a 1.5kg claim and can make the finish.  BRAZEN BRANDO (6) has an awkward barrier but will race forward and his best form would see him a chance. CHIQ MAGNET (3) resumes and Meech is reunited. Maps for the run of the race and has placed 2/4 first-up. In the mix as well. KOYUGA BREEZE (4) resumes and deserves a look."
    ),
    venueId = "381c55bd-cf64-4974-a4f0-a2df2b61b774",
    venueName = "St Arnaud",
    venueState = "VIC",
    venueCountry = "AUS"
)