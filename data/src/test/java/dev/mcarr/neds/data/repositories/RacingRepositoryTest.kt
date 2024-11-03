package dev.mcarr.neds.data.repositories

import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.sealed.racing.RacingNetworkRequestOutcome
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Unit tests for the RacingRepository class.
 *
 * These tests should roughly match the RacingDataSource tests,
 * since the data from the repository class is derived from the
 * data source class.
 *
 * Note that these unit tests perform real HTTP requests
 * to a live server. So they may fail due to external
 * factors, such as networking issues.
 * */
@RunWith(RobolectricTestRunner::class)
@Config(manifest=Config.NONE)
class RacingRepositoryTest {

    /**
     * HTTP data source from which to retrieve racing data.
     * */
    val repo = RacingRepository()

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