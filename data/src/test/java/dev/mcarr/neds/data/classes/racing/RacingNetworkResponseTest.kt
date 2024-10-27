package dev.mcarr.neds.data.classes.racing

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import kotlinx.serialization.json.Json
import org.junit.Test

/**
 * Unit tests for the decoding of a RacingNetworkResponse data class.
 *
 * This class uses hard-coded data, since we're testing the decoding
 * of a RacingNetworkResponse class in isolation, completely
 * separate from the networking and other parts.
 * (Those are tested in different unit tests)
 * */
class RacingNetworkResponseTest {

    /**
     * A simple decoder with only one default value overridden.
     *
     * `explicitNulls` is set to false because our test data can
     * (and does) omit some nullable fields.
     * */
    val decoder = Json{
        explicitNulls = false
    }

    /**
     * Hard-coded test data.
     *
     * TODO Move this into a separate mock/fake data class later.
     * */
    val testResponse = """
        {
          "status":200,
          "data":{
            "next_to_go_ids":["7d157c1c-52b0-4454-a4c2-9ddd1d7ffddd"],
            "race_summaries":{
              "7d157c1c-52b0-4454-a4c2-9ddd1d7ffddd":{
                "race_id":"7d157c1c-52b0-4454-a4c2-9ddd1d7ffddd",
                "race_name":"Race 2 - 1609M",
                "race_number":2,
                "meeting_id":"caa12c33-859b-4b96-a90f-923179186975",
                "meeting_name":"Western Fair Raceway",
                "category_id":"161d9be2-e909-4326-8c2c-35ed71fb460b",
                "advertised_start":{
                  "seconds":1729894380
                },
                "race_form":{
                  "distance":1609,
                  "distance_type":{
                    "id":"570775ae-09ec-42d5-989d-7c8f06366aa7",
                    "name":"Metres",
                    "short_name":"m"
                  },
                  "distance_type_id":"570775ae-09ec-42d5-989d-7c8f06366aa7",
                  "track_condition":{
                    "id":"10a14653-a33d-11e7-810d-0a1a4ae29bd2",
                    "name":"Good",
                    "short_name":"good"
                  },
                  "track_condition_id":"10a14653-a33d-11e7-810d-0a1a4ae29bd2",
                  "race_comment":"BEETHREEPO (3) has been racing very well and kept it up last time out with a strong win at Flamboro Downs over 1609m. Sure to enjoy an economical run from this draw. Won't find this any harder and she can get the job done. MVP KAMALA (7) has been excellent of late. Finished third at her latest appearance over 1609m at this track, beaten by 9 metres. Must overcome a very wide draw. Finds a nice race and can again visit the winners' stall. SILVERCLAYSPECIAL (5) is in the mix following a respectable third at her most recent appearance over 1609m at Flamboro Downs. CARSONS PLAYER (4) must be considered after she finished third over 1609m at this track a week ago. Something for the Multiples: COME SEE COME SAW (8)",
                  "additional_data":"{\"revealed_race_info\":{\"track_name\":\"Western Fair Raceway\",\"state\":\"ON\",\"country\":\"CA\",\"number\":2,\"race_name\":\"Race 2 - 1609M\",\"time\":\"2024-10-25T22:13:00Z\",\"class\":\"\",\"start_type\":\"Mobile\",\"prizemonies\":{\"total_value\":5342},\"localised_prizemonies\":{\"AUD\":{\"total_value\":5342},\"NZD\":{\"total_value\":5823}},\"rail_position\":\"\",\"track_direction\":\"Right\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"P\",\"track_home_straight_metres\":0,\"track_circumference\":0}}",
                  "generated":1,
                  "silk_base_url":"drr38safykj6s.cloudfront.net",
                  "race_comment_alternative":"BEETHREEPO (3) has been racing very well and kept it up last time out with a strong win at Flamboro Downs over 1609m. Sure to enjoy an economical run from this draw. Won't find this any harder and she can get the job done. MVP KAMALA (7) has been excellent of late. Finished third at her latest appearance over 1609m at this track, beaten by 9 metres. Must overcome a very wide draw. Finds a nice race and can again visit the winners' stall. SILVERCLAYSPECIAL (5) is in the mix following a respectable third at her most recent appearance over 1609m at Flamboro Downs. CARSONS PLAYER (4) must be considered after she finished third over 1609m at this track a week ago. Something for the Multiples: COME SEE COME SAW (8)"
                },
                "venue_id":"9f90b14e-580d-4106-94fb-f29363df4a4b",
                "venue_name":"Western Fair Raceway",
                "venue_state":"ON",
                "venue_country":"CA"
              }
            }
          },
          "message":"Next 1 races from each category"
        }
    """.trimIndent()

    /**
     * Attempts to decode what should be a valid response to a nextraces
     * request.
     * Test will fail if it cannot be decoded successfully.
     * */
    @Test
    fun aValidResponseIsReceived_successfullyDecodeIt(){
        val threwException =
            try {
                decoder.decodeFromString<RacingNetworkResponse>(testResponse)
                false
            }catch (e: Exception){
                e.printStackTrace()
                true
            }
        assert(!threwException)

    }

    /**
     * Attempts to decode what should be a valid response to a nextraces
     * request, then checks all of its fields individually to ensure that
     * they were parsed correctly.
     * */
    @Test
    fun aValidResponseIsReceived_checkEveryIndividualField(){

        val response = decoder.decodeFromString<RacingNetworkResponse>(testResponse)

        assertEquals(200, response.status)
        assertEquals("Next 1 races from each category", response.message)

        val data = response.data
        val expectedId = "7d157c1c-52b0-4454-a4c2-9ddd1d7ffddd"
        assertEquals(1, data.nextToGoIds.size)
        assertEquals(expectedId, data.nextToGoIds[0])
        assertEquals(1, data.raceSummaries.size)
        assert(data.raceSummaries.containsKey(expectedId))

        val raceSummary = data.raceSummaries[expectedId]
        assertNotNull(raceSummary)
        val summary = raceSummary!!

        assertEquals(expectedId, summary.raceId)
        assertEquals("Race 2 - 1609M", summary.raceName)
        assertEquals(2, summary.raceNumber)
        assertEquals("caa12c33-859b-4b96-a90f-923179186975", summary.meetingId)
        assertEquals("Western Fair Raceway", summary.meetingName)
        assertEquals("161d9be2-e909-4326-8c2c-35ed71fb460b", summary.categoryId)
        assertEquals(1729894380, summary.advertisedStart.seconds)
        assertEquals("9f90b14e-580d-4106-94fb-f29363df4a4b", summary.venueId)
        assertEquals("Western Fair Raceway", summary.venueName)
        assertEquals("ON", summary.venueState)
        assertEquals("CA", summary.venueCountry)

        val form = summary.raceForm
        assertEquals(1, form.generated)
        assertEquals("drr38safykj6s.cloudfront.net", form.silkBaseUrl)

        val distanceTypeId = "570775ae-09ec-42d5-989d-7c8f06366aa7"
        assertEquals(1609, form.distance)
        assertEquals(distanceTypeId, form.distanceTypeId)
        assertEquals(distanceTypeId, form.distanceType.id)
        assertEquals("Metres", form.distanceType.name)
        assertEquals("m", form.distanceType.shortName)

        val trackConditionId = "10a14653-a33d-11e7-810d-0a1a4ae29bd2"
        assertEquals(trackConditionId, form.trackConditionId)
        assertEquals(trackConditionId, form.trackCondition?.id)
        assertEquals("Good", form.trackCondition?.name)
        assertEquals("good", form.trackCondition?.shortName)

        val raceComment = "BEETHREEPO (3) has been racing very well and kept it up last time out with a strong win at Flamboro Downs over 1609m. Sure to enjoy an economical run from this draw. Won't find this any harder and she can get the job done. MVP KAMALA (7) has been excellent of late. Finished third at her latest appearance over 1609m at this track, beaten by 9 metres. Must overcome a very wide draw. Finds a nice race and can again visit the winners' stall. SILVERCLAYSPECIAL (5) is in the mix following a respectable third at her most recent appearance over 1609m at Flamboro Downs. CARSONS PLAYER (4) must be considered after she finished third over 1609m at this track a week ago. Something for the Multiples: COME SEE COME SAW (8)"
        assertEquals(raceComment, form.raceComment)
        assertEquals(raceComment, form.raceCommentAlternative)

        val additionalData = "{\"revealed_race_info\":{\"track_name\":\"Western Fair Raceway\",\"state\":\"ON\",\"country\":\"CA\",\"number\":2,\"race_name\":\"Race 2 - 1609M\",\"time\":\"2024-10-25T22:13:00Z\",\"class\":\"\",\"start_type\":\"Mobile\",\"prizemonies\":{\"total_value\":5342},\"localised_prizemonies\":{\"AUD\":{\"total_value\":5342},\"NZD\":{\"total_value\":5823}},\"rail_position\":\"\",\"track_direction\":\"Right\",\"track_surface\":\"All Weather\",\"group\":\"\",\"gait\":\"P\",\"track_home_straight_metres\":0,\"track_circumference\":0}}"
        assertEquals(additionalData, form.additionalData)

    }

}