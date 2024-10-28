package dev.mcarr.neds.mock.data.datasources

import dev.mcarr.neds.common.enums.racing.RacingCategory
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

/**
 * Unit tests for the FakeRacingDataSource class.
 *
 * These tests should match the RacingDataSource tests,
 * since that's the class which FakeRacingDataSource is mocking.
 *
 * The two should behave exactly the same, except that the
 * fake version doesn't perform any network requests.
 * */
@RunWith(RobolectricTestRunner::class)
class FakeRacingDataSourceTest {

    /**
     * Mock data source from which to retrieve racing data.
     * */
    val source = FakeRacingDataSource()

    /**
     * Requests information on a single race from the data source,
     * then confirms that exactly 1 race has been received.
     * */
    @Test
    fun oneRaceIsRequested_verifyTheSize(){
        runTest{
            val resp = source.getNextRace(1)
            assertEquals(200, resp.status)
            assertEquals(1, resp.data.raceSummaries.size)
            assertEquals("Next 1 races from each category", resp.message)
        }
    }

    /**
     * Requests information on two races from the data source,
     * then confirms that exactly 2 races have been received.
     * */
    @Test
    fun twoRacesAreRequested_verifyTheSize(){
        runTest{
            val resp = source.getNextRace(2)
            assertEquals(200, resp.status)
            assertEquals(2, resp.data.raceSummaries.size)
            assertEquals("Next 2 races from each category", resp.message)
        }
    }

    /**
     * Requests information on several races from the data source,
     * then confirms that the requested number of races have been received.
     *
     * Also checks the categories of each race to make sure they are
     * valid racing categories.
     * */
    @Test
    fun multipleRacesAreRequested_verifyTheSizeAndCategories(){
        runTest{
            val resp = source.getNextRace(10)
            assertEquals(200, resp.status)
            assertEquals(10, resp.data.raceSummaries.size)
            assertEquals("Next 10 races from each category", resp.message)

            val categoryIds = RacingCategory.entries
                .filterNot { it == RacingCategory.ALL }
                .map { it.uuid }

            resp.data.raceSummaries.values.forEach { summary ->
                assert(summary.categoryId in categoryIds)
            }
        }
    }

}