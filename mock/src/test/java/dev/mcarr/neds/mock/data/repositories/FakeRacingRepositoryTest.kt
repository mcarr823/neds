package dev.mcarr.neds.mock.data.repositories

import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

/**
 * Unit tests for the FakeRacingRepository class.
 *
 * These tests should match the RacingRepositoryTest tests,
 * since the FakeRacingRepository class is a mock implementation of the
 * RacingRepository class used in those tests.
 * */
class FakeRacingRepositoryTest {

    /**
     * Mock data source from which to retrieve racing data.
     * */
    val repo = FakeRacingRepository()

    /**
     * Requests information on a single race from the repository,
     * then confirms that exactly 1 race has been received.
     * */
    @Test
    fun oneRaceIsRequested_verifyTheSize(){
        runTest{
            repo.getNextRace(1)
            assert(repo.nextRaces.value is RacingNetworkRequestOutcome.Success)
            val outcome = repo.nextRaces.value as RacingNetworkRequestOutcome.Success
            assertEquals(1, outcome.response.getRaceSummaries().size)
        }
    }

    /**
     * Requests information on two races from the repository,
     * then confirms that exactly 2 races have been received.
     * */
    @Test
    fun twoRacesAreRequested_verifyTheSize(){
        runTest{
            repo.getNextRace(2)
            assert(repo.nextRaces.value is RacingNetworkRequestOutcome.Success)
            val outcome = repo.nextRaces.value as RacingNetworkRequestOutcome.Success
            assertEquals(2, outcome.response.getRaceSummaries().size)
        }
    }

    /**
     * Requests information on several races from the repository,
     * then confirms that the requested number of races have been received.
     *
     * Also checks the categories of each race to make sure they are
     * valid racing categories.
     * */
    @Test
    fun multipleRacesAreRequested_verifyTheSizeAndCategories(){
        runTest{
            repo.getNextRace(10)
            assert(repo.nextRaces.value is RacingNetworkRequestOutcome.Success)
            val outcome = repo.nextRaces.value as RacingNetworkRequestOutcome.Success
            assertEquals(10, outcome.response.getRaceSummaries().size)

            val categoryIds = RacingCategory.entries
                .filterNot { it == RacingCategory.ALL }
                .map { it.uuid }

            outcome.response.getRaceSummaries().forEach { summary ->
                assert(summary.categoryId in categoryIds)
            }
        }
    }

}