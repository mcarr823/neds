# Repository classes

* `:data` module
* `dev.mcarr.neds.data.repositories` package

Repository classes should be used to interact with one (or multiple) DataSource classes.

The Repository class acts as an intermediary between DataSource classes and other parts of the app.

If part of the app wants to retrieve data, it will talk to the repository, and the repository will then query the appropriate data source.

Think of repository classes as APIs. When someone uses a repository, they don't need to know the specifics of how the data is received, or from where. They just want to receive the data.

## Example

```kotlin
class RacingRepository(
    private val onlineSource: OnlineRacingDataSource,
    private val offlineSource: OfflineRacingDataSource
){
    
    var hasInternetConnection: Boolean = true
    
    suspend fun getNextRace(
        count: Int
    ): RacingNetworkResponse {
        if (hasInternetConnection)
            return onlineSource.getNextRace(count)
        else
            return offline.getNextRace(count)
    }
    
}
```

In this example, the repository provides data from either an online source or an offline source, depending on whether the app has an internet connection or not.

The rest of the app would get the same type of data from the repository either way, unaware of its origin.