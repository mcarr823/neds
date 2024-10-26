package dev.mcarr.neds.net.client

import android.util.Log
import dev.mcarr.neds.net.uri.NedsUri
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

/**
 * HTTP client object which exposes HTTP API methods via static functions.
 *
 * This class handles the actual HTTP requests being performed, as well as
 * content negotiation (where applicable).
 *
 * The only public functions should be standard HTTP verb operations,
 * such as GET, POST, DELETE, etc.
 * */
object KtorClient {

    /**
     * Tag name for logging purposes.
     * */
    private const val TAG = "KtorClient"

    /**
     * Provides a JSON handler for use with any content negotiators defined
     * by the HTTP client.
     *
     * This function currently provides the default handler, with only one
     * key (explicitNulls) being modified.
     *
     * `explicitNulls` is set to false because there are some endpoints
     * which omit data when it isn't available, rather than setting it to null.
     * eg. Weather data when querying upcoming races.
     * */
    private fun getJsonFormat() =
        Json {
            explicitNulls = false
        }

    /**
     * Provides access to a HttpClient instance via a callback.
     *
     * Access is provided in this manner to facilitate automatic
     * closing of the client after usage and avoid using up resources
     * unnecessarily.
     *
     * This may be better rewritten as a singleton with a retained
     * HttpClient instance, depending on how many HTTP requests are
     * performed and how often, considering the overhead of opening
     * and closing the HttpClient.
     * Per https://ktor.io/docs/client-create-and-configure.html#close-client
     *
     * For the time being, however, HTTP requests are not frequent enough
     * for this to be a concern. So freeing up resources when they are not
     * in use seems like the better approach.
     *
     * @param callback Callback function containing a reference to the
     * HttpClient object with which HTTP requests can be performed.
     * @return The result of the HTTP operation as a HttpResponse object.
     * */
    private suspend fun getClient(callback: suspend (HttpClient) -> HttpResponse) =
        HttpClient(CIO) {
            install(ContentNegotiation) {

                // Set up JSON interpreters for both the default JSON content-type
                // and also text/plain, since the Neds API returns JSON data with
                // a content-type of text/plain
                json(getJsonFormat())
                json(getJsonFormat(), contentType = ContentType.Text.Plain)

            }
        }.use{
            callback(it)
        }

    /**
     * Perform a GET request to the API endpoint specified by the
     * provided NedsUri object.
     *
     * @param nedsUri NedsUri object containing the URL, GET parameters,
     * etc. needed to perform the HTTP request.
     * @return HttpResponse containing the result of the GET request.
     * */
    suspend fun get(nedsUri: NedsUri): HttpResponse =
        getClient { client ->
            val uri = nedsUri.toString()
            Log.v(TAG, "GET $uri")
            client.get(uri)
        }

}