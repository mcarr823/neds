package dev.mcarr.neds.domain.racing

import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.data.repositories.RacingRepository
import dev.mcarr.neds.mock.data.datasources.FakeRacingDataSource
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Test

/**
 * Series of tests for the GetRacingDataUseCase class.
 * */
@OptIn(ExperimentalCoroutinesApi::class)
class GetRacingDataUseCaseTest {

    /**
     * Create a UseCase class with fake data from the mock repository.
     * */
    val useCase = GetRacingDataUseCase(
        repo = RacingRepository(
            racingDataSource = FakeRacingDataSource()
        )
    )

    /**
     * Requests races from the UseCase class, then confirms that the number
     * of races in the flow matches the number requested.
     * */
    @Test
    fun tenRacesRequested_tenRacesReceived(){
        runTest{
            useCase.getMoreRaces(10)
            assertEquals(10, useCase.cachedRaces.value.size)
        }
    }

    /**
     * Requests races from the UseCase class, then uses a flow to filter out
     * races which belong to different categories.
     *
     * This test checks if the flow is updated correctly when the category
     * changes.
     * */
    @Test
    fun categoryFilterIsApplied_resultsAreFiltered(){
        runTest{
            useCase.getMoreRaces(10)

            val values = mutableListOf<List<RaceSummary>>()
            backgroundScope.launch(UnconfinedTestDispatcher(testScheduler)){
                useCase.categorizedRaces.toList(values)
            }
            val countAllRaces = useCase.cachedRaces.value.size

            // Make sure there's at least one record first
            assert(countAllRaces > 0)

            var total = 0

            useCase.setCategory(listOf(RacingCategory.GREYHOUND_RACING))
            total += values.last().size

            useCase.setCategory(listOf(RacingCategory.HORSE_RACING))
            total += values.last().size

            useCase.setCategory(listOf(RacingCategory.HARNESS_RACING))
            total += values.last().size

            // Sum up the results of each category, then compare them to the
            // total number of races.
            // The numbers should match if
            // a) we make sure to test every category and
            // b) the flow is filtering by category correctly.
            assertEquals(countAllRaces, total)
        }
    }

}