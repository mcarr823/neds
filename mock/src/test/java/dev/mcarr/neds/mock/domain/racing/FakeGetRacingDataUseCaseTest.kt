package dev.mcarr.neds.mock.domain.racing

import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Test

/**
 * Series of tests for the FakeGetRacingDataUseCase class.
 * */
@OptIn(ExperimentalCoroutinesApi::class)
class FakeGetRacingDataUseCaseTest {

    /**
     * Create a UseCase class with fake data from the mock repository.
     * */
    val useCase = FakeGetRacingDataUseCase()

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