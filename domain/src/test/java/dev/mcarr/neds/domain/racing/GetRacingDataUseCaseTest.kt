package dev.mcarr.neds.domain.racing

import dev.mcarr.neds.data.repositories.RacingRepository
import dev.mcarr.neds.mock.data.datasources.FakeRacingDataSource
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
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

}