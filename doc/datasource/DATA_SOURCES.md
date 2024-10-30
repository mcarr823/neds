# DataSource classes

* `:data` module
* `dev.mcarr.neds.data.datasources` package

DataSource classes should be used when interfacing with a data provider of some description.

You may have one or multiple DataSource classes for a given data type.

For example, you could have both a database-backed data source and a network-backed data source, both providing the same information.

The data source should then be accessed through a Repository class, which will talk to one or more data sources and provide that data to the rest of the app.

For example:

- OfflineRacingDataSource
- OnlineRacingDataSource
- RacingRepository

In this example, OfflineRacingDataSource is a database-backed data source, and OnlineRacingDataSource is a network-backed data source.

RacingRepository is a class which holds an instance of each of those data sources.

The rest of the app would query the repository class, and the repository would manage the logic for deciding which of the two data sources to pull data from.

## Example

```kotlin
class OnlineRacingDataSource {

    suspend fun getNextRace(
        count: Int
    ): RacingNetworkResponse {
        val uri = NedsUri.Builder()
            .setEventType(EventType.RACING)
            .setMethod(RacingMethod.NEXT_RACES.value)
            .setCount(count)
            .build()

        return KtorClient.get(uri).body()
    }

}
```