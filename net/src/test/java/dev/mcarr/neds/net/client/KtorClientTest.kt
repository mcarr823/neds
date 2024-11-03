package dev.mcarr.neds.net.client

import dev.mcarr.neds.common.enums.http.EventType
import dev.mcarr.neds.common.enums.racing.RacingMethod
import dev.mcarr.neds.net.uri.NedsUri
import io.ktor.http.HttpStatusCode
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Unit tests for the KtorClient HTTP client class.
 *
 * Performs generic HTTP operations and checks if they succeed or fail.
 *
 * Note that these tests do NOT cover more advanced criteria or use cases,
 * such as casting the responses or validating the results.
 *
 * Those kinds of tests are already performed by other classes which
 * utilize the HTTP client, such as in the DataSource class tests.
 *
 * This class should only contain generic HTTP tests, such as performing
 * GET or POST requests and checking status codes.
 * */
@RunWith(RobolectricTestRunner::class)
class KtorClientTest {

    /**
     * Perform an invalid HTTP GET request and confirm that the HTTP
     * response indicates an error.
     * */
    @Test
    fun invalidGetRequestIsPerformed_errorResponseIsReceived(){
        runTest{
            val uri = NedsUri.Builder()
                .setEventType(EventType.RACING)
                .build()
            val response = KtorClient.get(uri)
            assert(response.status != HttpStatusCode.OK)
        }
    }

    /**
     * Perform a valid HTTP GET request and confirm that the HTTP
     * response indicates a success.
     * */
    @Test
    fun validGetRequestIsPerformed_successResponseIsReceived(){
        runTest{
            val uri = NedsUri.Builder()
                .setEventType(EventType.RACING)
                .setMethod(RacingMethod.NEXT_RACES.value)
                .setCount(1)
                .build()
            val response = KtorClient.get(uri)
            assertEquals(HttpStatusCode.OK, response.status)
        }
    }

}