package dev.mcarr.neds.net.uri

import android.net.Uri
import dev.mcarr.neds.common.enums.http.ApiHost
import dev.mcarr.neds.common.enums.http.ApiType
import dev.mcarr.neds.common.enums.http.ApiVersion
import dev.mcarr.neds.common.enums.http.EventType
import dev.mcarr.neds.common.enums.http.HttpScheme

/**
 * Represents a URI which adheres to the Neds schema.
 *
 * A Neds URI must specify:
 * - the API type. eg. a REST api
 * - the API version. eg. v1
 * - the type of event being queried. eg. racing
 *
 * When constructed, the NedsUri object can be converted
 * into a URL string by using its toString() function,
 * which will result in a URL such as:
 * https://api.neds.com.au/rest/v1/racing/?method=nextraces&count=10
 *
 * NedsUri objects must be created by using the internal Builder
 * class.
 * @see Builder
 * */
class NedsUri {

    /**
     * URL scheme. eg. https, http, ftp, etc.
     * */
    private var scheme: HttpScheme

    /**
     * The API endpoint's host or domain.
     * eg. api.neds.com.au
     * */
    private var host: ApiHost

    /**
     * The type of API we're querying.
     * eg. a REST API.
     * */
    private var apiType: ApiType

    /**
     * The version of the API we're querying.
     * eg. v1, v2, etc.
     * */
    private var version: ApiVersion

    /**
     * The type of event we are querying.
     * eg. racing.
     * */
    private var eventType: EventType

    /**
     * The query we want to run on the API endpoint.
     * eg. the "nextraces" function.
     * */
    private var method: String

    /**
     * The number of results to return from the API endpoint,
     * if supported.
     * */
    private var count: Int

    private constructor(
        scheme: HttpScheme,
        host: ApiHost,
        apiType: ApiType,
        version: ApiVersion,
        eventType: EventType,
        method: String,
        count: Int
    ){
        this.scheme = scheme
        this.host = host
        this.apiType = apiType
        this.version = version
        this.eventType = eventType
        this.method = method
        this.count = count
    }

    /**
     * Converts the NedsUri object into a URL string.
     *
     * @return Constructed URI as a string
     * */
    override fun toString(): String {

        val builder = Uri.Builder()
            .scheme(scheme.value)
            .authority(host.value)
            .appendPath(apiType.value)
            .appendPath(version.value)
            .appendPath(eventType.value)

        // Append a blank path on the end.
        // This ensures that there is a trailing slash at the end
        // of the URL (before the query parameters).
        builder.appendPath("")

        if (count >= 0)
            builder.appendQueryParameter("count", count.toString())

        if (method.isNotEmpty())
            builder.appendQueryParameter("method", method)

        return builder.build().toString()

    }

    /**
     * Internal builder class for NedsUri objects.
     *
     * Follows the same format as the Uri.Builder() class,
     * including the manner in which functions are chained together.
     * However, this class restricts user input to only allow known
     * parameters of a Neds API URL.
     *
     * Most parameters are either optional, or have default values.
     *
     * The only field requiring mandatory input is the `eventType`
     * field, set by the .setEventType() function.
     *
     * Example usage:
     *
     * val nedsUri = NedsUri.Builder()
     *             .setEventType(EventType.RACING)
     *             .setMethod(RacingMethod.NEXT_RACES.value)
     *             .setCount(10)
     *             .build()
     * */
    class Builder() {

        private var scheme: HttpScheme = HttpScheme.HTTPS
        private var host: ApiHost = ApiHost.NEDS_AU_API
        private var apiType: ApiType = ApiType.REST
        private var version: ApiVersion = ApiVersion.V1
        private var eventType: EventType = EventType.UNSPECIFIED
        private var method: String = ""
        private var count: Int = -1

        /**
         * Sets the scheme of the URL.
         * eg. http, https, ftp, etc.
         *
         * This field is optional and defaults to HttpScheme.HTTPS.
         *
         * @param scheme Scheme for the URL
         * @return This instance of the Builder class
         * @see HttpScheme
         * */
        fun setScheme(scheme: HttpScheme) = this.apply {
            this.scheme = scheme
        }

        /**
         * Sets the host of the URL.
         * eg. api.neds.com.au
         *
         * This field is optional and defaults to ApiHost.NEDS_AU_API.
         *
         * @param host Host for the URL
         * @return This instance of the Builder class
         * @see ApiHost
         * */
        fun setHost(host: ApiHost) = this.apply {
            this.host = host
        }

        /**
         * Sets the type of API endpoint which we are querying.
         * eg. a REST API endpoint.
         *
         * Note that this does not change the nature of the request
         * or return data within the app. It only influences the
         * constructed URL.
         *
         * The API type becomes the first path segment in the URL.
         * eg. In the case of https://api.neds.com.au/rest/v1/racing/
         * the API type is "rest".
         *
         * This field is optional and defaults to ApiType.REST.
         *
         * @param apiType Type of API to query
         * @return This instance of the Builder class
         * @see ApiType
         * */
        fun setApiType(apiType: ApiType) = this.apply {
            this.apiType = apiType
        }

        /**
         * Specifies the version of the API endpoint which we are targeting.
         * eg. v1, v2, etc.
         *
         * The version number becomes the second path segment in the URL.
         * eg. In the case of https://api.neds.com.au/rest/v1/racing/
         * the version is "v1".
         *
         * This field is optional and defaults to ApiVersion.V1.
         *
         * @param version API version to target
         * @return This instance of the Builder class
         * @see ApiVersion
         * */
        fun setVersion(version: ApiVersion) = this.apply {
            this.version = version
        }

        /**
         * Specifies the type of event we are querying.
         * eg. "racing"
         *
         * The event type becomes the third path segment in the URL.
         * eg. In the case of https://api.neds.com.au/rest/v1/racing/
         * the event type is "racing".
         *
         * This field is mandatory and must be specified on every request.
         *
         * @param eventType Type of event to query
         * @return This instance of the Builder class
         * @see EventType
         * */
        fun setEventType(eventType: EventType) = this.apply {
            this.eventType = eventType
        }

        /**
         * Specifies the number of results which the request should return
         * by setting the `count` query parameter of a HTTP request.
         *
         * This field is optional and will be omitted unless specified.
         *
         * @param count Number of results which the query should return
         * @return This instance of the Builder class
         * */
        fun setCount(count: Int) = this.apply {
            this.count = count
        }

        /**
         * Specifies the type of function we want the server to perform.
         * eg. the "nextraces" method asks the server to generate and provide
         * a list of upcoming races.
         *
         * Setting this value will specify a `method` query  parameter of a
         * HTTP request.
         *
         * This field is optional and will be omitted unless specified.
         *
         * @param method Function for the server to perform
         * @return This instance of the Builder class
         * */
        fun setMethod(method: String) = this.apply {
            this.method = method
        }

        /**
         * Constructs a NedsUri object from the parameters which
         * have been provided to the Builder object.
         *
         * @throws Exception if the NedsUri cannot be built.
         * eg. If a mandatory parameter hasn't been provided.
         * */
        fun build(): NedsUri {

            if (eventType == EventType.UNSPECIFIED){
                throw Exception("You have not specified an event type")
            }

            return NedsUri(
                scheme = scheme,
                host = host,
                apiType = apiType,
                version = version,
                eventType = eventType,
                method = method,
                count = count
            )

        }

    }

}