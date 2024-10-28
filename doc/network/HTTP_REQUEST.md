# Performing HTTP requests

After defining the structure and parameters of the Neds URL, the compiled NedsUri object can be provided to a HTTP client class.

Like the URI builder, HTTP client classes exist in the :net module.

At this point in time there is only one HTTP client implementation: KtorClient

KtorClient exposes HTTP functions such as GET, and provides access to them in a static way.

For example:

```kotlin
val uri = NedsUri.Builder()
            .setEventType(EventType.FAKE)
            .setMethod(Method.RaceTrack)
            .setCount(count)
            .setCategory(category)
            .build()
val response = KtorClient.get(uri)
```

This will return a HttpResponse object.

In order to make that response more useful, see the [response data section](RESPONSE_DATA.md).
