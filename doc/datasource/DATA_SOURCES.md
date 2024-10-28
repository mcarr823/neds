# DataSource classes

DataSource classes should be used when interfacing with a data provider of some description.

For example, a database or a network API.

URLs and the HTTP client should not be used directly from other modules.

Instead, the net module should define API classes in the `dev.mcarr.neds.net.api` package which offer that functionality.

A new API class should be created for each endpoint.

For example, the RacingNetworkApi class provides functions which query the "racing/" endpoint.

Each function in that class should be called statically, and there should be one function per defined method.

For example:

```kotlin
object FakeNetworkApi {
    suspend fun getRacetrackData(
        count: Int = 10,
        category: Category = Category.RANDWICK_RACETRACK
    ): RacingNetworkResponse {
        val uri = NedsUri.Builder()
            .setEventType(EventType.FAKE)
            .setMethod(Method.RaceTrack)
            .setCount(count)
            .setCategory(category)
            .build()
        return KtorClient.get(uri).body()
    }
}
```

In this example, the class is defined as an object, so all of its functions are static.

There's a single function for retrieving Racetrack data, and changes to the queried data are made by changing the function arguments.

The Racetrack data could then be queried by running `FakeNetworkApi.getRacetrackData()` from other modules.
