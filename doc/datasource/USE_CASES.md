# UseCase classes

* `:domain` module
* `dev.mcarr.neds.domain` package

UseCase classes should be used as an intermediary between ViewModel classes and Repository classes.

They extract data from a repository, perform business logic on the data, then return the result to a viewmodel.

## Example

```kotlin
class RacingDataUseCase(
    private val repo: RacingRepository
){
    
    private val races = MutableStateFlow<List<RaceSummary>>(listOf())
    private val enableSorting = MutableStateFlow<Boolean>(false)
    
    val sortedRaces = combine(enableSorting, races) { shouldSort, newRaces ->
        if (shouldSort)
            newRaces.sortedBy { it.advertisedStart.seconds }
        else
            newRaces
    }
    
    suspend fun getNextRace(count: Int) {
        races.value = repo.getNextRace(count)
    }
    
    fun sortRaces(enable: Boolean) {
        enableSorting.value = enable
    }
    
}
```

In this example, the use case contains two private flows. One holds a list of racing events, the other dictates whether sorting is enabled or not.

It also has one public flow. The public flow provides a list of races from the repository, optionally applying some business logic (sorting, in this case) on the results.

New races can be downloaded through the repository by using the getNextRace function, and sorting can be toggled with the sortRaces function.

Whenever new races are downloaded, or sorting is toggled, the sortedRaces flow is updated automatically.

Like so, the use case provides data from a repository, applies business logic to the data, then exposes the data via a flow for other parts of the app (viewmodels) to utilize.