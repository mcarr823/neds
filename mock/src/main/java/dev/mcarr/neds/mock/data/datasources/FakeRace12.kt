package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun fakeRace12() = RaceSummary(
    raceId = "525ff517-4210-481a-b540-8cbf56b1b473",
    raceName = "6F Hcap",
    raceNumber = 3,
    meetingId = "2267bb31-bb7c-4eaf-9f9c-89ddeb312b47",
    meetingName = "Selangor",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729925100
    ),
    raceForm = RaceForm(
        distance = 1150,
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
        raceComment = "CHIEF OF ARMY (5) opened this prep last start with a third, beaten 3 lengths, over 1400m at this track. Will be hard to beat. SAFE JOURNEY (4) recorded a gutsy maiden victory last time out over 1150m at this track, scoring by 0.8 lengths. Breaks from a wide alley but he is one of the main chances. MIRACLE STAR (3) had been racing consistently with two minor placings on end prior to finishing fourth most recently over 1000m at Perak. Back to the track at which he finished third two runs back. Expecting significant improvement. RED DRAGONFLY (10) is a four-year-old import having his first run for the C C Ooi barn. Hasn't raced since he finished fifth over 1400m at Kranji Turf five months ago. Not seen at the trials but he shapes as a top-three chance on best Singapore figures.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Selangor\",\"state\":\"MYS\",\"country\":\"MYS\",\"number\":3,\"raceName\":\"6F Hcap\",\"time\":\"2024-10-26T06:45:00Z\",\"class\":\"CL5, RBH0-43\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":7018),\"localised_prizemonies\":{\"AUD\":{\"total_value\":7018),\"NZD\":{\"total_value\":7650}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"Turf\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        weather = null,
        weatherId = null,
        raceCommentAlternative = "CHIEF OF ARMY (5) opened this prep last start with a third, beaten 3 lengths, over 1400m at this track. Will be hard to beat. SAFE JOURNEY (4) recorded a gutsy maiden victory last time out over 1150m at this track, scoring by 0.8 lengths. Breaks from a wide alley but he is one of the main chances. MIRACLE STAR (3) had been racing consistently with two minor placings on end prior to finishing fourth most recently over 1000m at Perak. Back to the track at which he finished third two runs back. Expecting significant improvement. RED DRAGONFLY (10) is a four-year-old import having his first run for the C C Ooi barn. Hasn't raced since he finished fifth over 1400m at Kranji Turf five months ago. Not seen at the trials but he shapes as a top-three chance on best Singapore figures."
    ),
    venueId = "d39fd66a-e0fe-4fab-88ae-023834ba177e",
    venueName = "Selangor",
    venueState = "MYS",
    venueCountry = "MYS"
)