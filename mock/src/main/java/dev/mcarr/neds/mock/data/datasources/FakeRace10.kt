package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.classes.common.DistanceType
import dev.mcarr.neds.common.classes.common.TrackCondition
import dev.mcarr.neds.common.classes.common.Weather
import dev.mcarr.neds.common.classes.racing.RaceAdvertisedStart
import dev.mcarr.neds.common.classes.racing.RaceForm
import dev.mcarr.neds.common.classes.racing.RaceSummary

fun FakeRace10() = RaceSummary(
    raceId = "4cb95d87-8b18-4ec7-aafe-c204a6570bf6",
    raceName = "7F Hcap",
    raceNumber = 8,
    meetingId = "adee98eb-8973-4bf2-a726-0e01d9bed190",
    meetingName = "Seoul",
    categoryId = "4a2788f8-e825-4d36-9894-efd4baf1cfae",
    advertisedStart = RaceAdvertisedStart(
        seconds = 1729926300
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
            id = "906cd562-a37c-11e7-a5c6-0ab32e6ac8d2",
            name = "Soft",
            shortName = "soft"
        ),
        trackConditionId = "906cd562-a37c-11e7-a5c6-0ab32e6ac8d2",
        weather = Weather(
            id = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
            name = "Fine",
            shortName = "fine",
            iconUri = "Fine"
        ),
        weatherId = "01994c9e-3b74-11e8-a5eb-06a5c6d9a756",
        raceComment = "SPARK THUNDER (10) went forward last start and proved too strong, getting home by half a length over 1700m at this track. Should be prominent in the run despite the wide draw. This looks a sterner test than last time but on her best form she is good enough to take this out. STUNNING SKY (1) did little and finished 8 lengths from the winner in ninth over 1200m at this track last start, a less impressive effort than his fourth at this track the run before. Has the class to figure prominently. VIKING HEART (8) made progress last time out, finishing 4 lengths from the winner in second when he worked home well at the end of 1200m at this track. Looks well placed so expect another big run. HANGANG HERO (3) has not appeared since she finished third over 1200m at this track on January 28. Worth plenty of thought.",
        additionalData = "{\"revealed_race_info\":{\"track_name\":\"Seoul\",\"state\":\"KOR\",\"country\":\"KOR\",\"number\":8,\"raceName\":\"7F Hcap\",\"time\":\"2024-10-26T07:05:00Z\",\"class\":\"HCP, C3\",\"start_type\":\"\",\"prizemonies\":{\"total_value\":82502),\"localised_prizemonies\":{\"AUD\":{\"1st\":45376,\"2nd\":18150,\"3rd\":11550,\"4th\":4125,\"5th\":3300,\"total_value\":82502),\"NZD\":{\"1st\":49460,\"2nd\":19784,\"3rd\":12590,\"4th\":4496,\"5th\":3597,\"total_value\":89927}),\"rail_position\":\"\",\"track_direction\":\"Left\",\"track_surface\":\"Sand\",\"group\":\"\",\"gait\":\"Gallop\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
        generated = 1,
        silkBaseUrl = "drr38safykj6s.cloudfront.net",
        raceCommentAlternative = "SPARK THUNDER (10) went forward last start and proved too strong, getting home by half a length over 1700m at this track. Should be prominent in the run despite the wide draw. This looks a sterner test than last time but on her best form she is good enough to take this out. STUNNING SKY (1) did little and finished 8 lengths from the winner in ninth over 1200m at this track last start, a less impressive effort than his fourth at this track the run before. Has the class to figure prominently. VIKING HEART (8) made progress last time out, finishing 4 lengths from the winner in second when he worked home well at the end of 1200m at this track. Looks well placed so expect another big run. HANGANG HERO (3) has not appeared since she finished third over 1200m at this track on January 28. Worth plenty of thought."
    ),
    venueId = "098f424e-c75e-4983-8032-c82cec0d76ad",
    venueName = "Seoul",
    venueState = "KOR",
    venueCountry = "KOR"
)