package dev.mcarr.neds.domain.racing

import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import dev.mcarr.neds.mock.domain.racing.FakeGetRacingDataUseCase
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Series of tests for the GetRacingDataUseCase class.
 * */
@RunWith(RobolectricTestRunner::class)
class GetRacingDataUseCaseTest {

    /**
     * Create a UseCase class which pulls real data from a live server via
     * HTTP.
     * */
    val useCase = GetRacingDataUseCase()

    /**
     * Checks the default values of the UseCase class's variables.
     * */
    @Test
    fun useCaseIsInDefaultState_checkDefaultValues(){
        assertEquals(0, useCase.cachedRaces.value.size)
        assert(useCase.lastOutcome.value is RacingUseCaseOutcome.Progress)
    }

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
     * Requests one race, then confirms that the outcome variable is updated
     * to a Success state.
     * */
    @Test
    fun oneRaceRequested_outcomeIsSuccess(){
        runTest{
            useCase.getMoreRaces(1)
            assert(useCase.lastOutcome.value is RacingUseCaseOutcome.Success)
        }
    }

}