package dev.mcarr.neds.net.uri

import dev.mcarr.neds.common.enums.http.EventType
import dev.mcarr.neds.common.enums.racing.RacingMethod
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Unit tests for the NedsUri and NedsUri.Builder() classes.
 *
 * Note that RobolectricTestRunner is necessary because the underlying
 * Uri.Builder() class being utilized by NedsUri isn't mocked in JUnit.
 *
 * @see NedsUri
 * @see NedsUri.Builder
 * */
@RunWith(RobolectricTestRunner::class)
class NedsUriTest {

    /**
     * Attempts to use the NedsUri.Builder() class to build
     * a NedsUri object.
     *
     * The builder should throw an exception, since the builder
     * requires that the `eventType` parameter must be set.
     * */
    @Test
    fun requiredValuesAreMissing_throwAnException(){

        val threwAnException =
            try {
                NedsUri.Builder()
                    .build()
                false
            }catch (_: Exception){
                true
            }
        assert(threwAnException)

    }

    /**
     * Attempts to use the NedsUri.Builder() class to build
     * a NedsUri object.
     *
     * The builder shouldn't throw an exception, since the
     * minimum required values have been set.
     * */
    @Test
    fun requiredValuesAreProvided_noExceptionIsThrown(){

        val threwAnException =
            try {
                NedsUri.Builder()
                    .setEventType(EventType.RACING)
                    .build()
                false
            }catch (_: Exception){
                true
            }
        assert(!threwAnException)

    }

    /**
     * Builds a URL with only the minimum required value and checks that the
     * constructed URL matches the expected format.
     * */
    @Test
    fun eventTypeIsSet_constructedUriMatchesExpectedFormat(){

        val uri = NedsUri.Builder()
            .setEventType(EventType.RACING)
            .build()
            .toString()
        assertEquals("https://api.neds.com.au/rest/v1/racing/", uri)

    }

    /**
     * Builds a URL with the event type (mandatory) and method (optional) both
     * provided, then ensures the constructed URL matches the expected format.
     * */
    @Test
    fun eventTypeAndMethodAreSet_constructedUriMatchesExpectedFormat(){

        val uri = NedsUri.Builder()
            .setEventType(EventType.RACING)
            .setMethod(RacingMethod.NEXT_RACES.value)
            .build()
            .toString()
        assertEquals("https://api.neds.com.au/rest/v1/racing/?method=nextraces", uri)

    }

    /**
     * Builds a URL with the event type (mandatory) and count (optional) both
     * provided, then ensures the constructed URL matches the expected format.
     * */
    @Test
    fun eventTypeAndCountAreSet_constructedUriMatchesExpectedFormat(){

        val uri = NedsUri.Builder()
            .setEventType(EventType.RACING)
            .setCount(10)
            .build()
            .toString()
        assertEquals("https://api.neds.com.au/rest/v1/racing/?count=10", uri)

    }

    /**
     * Builds a URL with the event type (mandatory) and multiple optional
     * arguments, then ensures the constructed URL matches the expected format.
     * */
    @Test
    fun eventTypeAndMethodAndCountAreSet_constructedUriMatchesExpectedFormat(){

        val uri = NedsUri.Builder()
            .setEventType(EventType.RACING)
            .setMethod(RacingMethod.NEXT_RACES.value)
            .setCount(10)
            .build()
            .toString()
        assertEquals("https://api.neds.com.au/rest/v1/racing/?count=10&method=nextraces", uri)

    }

    /**
     * Builds a URL by providing invalid arguments to the builder.
     *
     * Tests if the invalid arguments are omitted from the constructed URL.
     * */
    @Test
    fun invalidArgumentsAreProvided_theArgumentsAreOmitted(){

        val uri = NedsUri.Builder()
            .setEventType(EventType.RACING)
            .setCount(-1)
            .setMethod(RacingMethod.UNSPECIFIED.value)
            .build()
            .toString()
        assertEquals("https://api.neds.com.au/rest/v1/racing/", uri)

    }

}