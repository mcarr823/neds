package dev.mcarr.neds.ui.screens

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.performClick
import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import dev.mcarr.neds.mock.data.datasources.FakeRacingDataSource
import dev.mcarr.neds.mock.ui.viewmodels.FakeNextToGoViewModel
import dev.mcarr.neds.ui.AbstractUiUnitTest
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit tests for the NextToGoScreen component.
 *
 * Some of the components here are tested in more detail in their own
 * separate unit tests.
 * eg. The race cards and the category filter have their own unit test
 * classes for their own components.
 *
 * @see NextToGoScreen
 * */
class NextToGoScreenTest : AbstractUiUnitTest() {

    /**
     * Most recently selected category filter
     * */
    private val selectedChoice = mutableStateOf<List<RacingCategory>>(emptyList())

    /**
     * How many times the Try Again button has been pressed.
     *
     * NOTE This value automatically increments by 1, since the screen has
     * an Effect which calls this once.
     * */
    private val resetStateButtonClicked = mutableStateOf(0)

    /**
     * Fake viewmodel which contains our mock data and function implementations.
     * */
    private val model = FakeNextToGoViewModel(
        exactNumberOfResultsToDisplay = 5,
        state = NextToGoScreenUiState(
            category = listOf(),
            loadingState = RacingUseCaseOutcome.Success(),
            races = FakeRacingDataSource().getRaceSummaries().map { it.toRaceCardData() }
        ),
        setCategoryCallback = {
            selectedChoice.value = it
        },
        resetStateCallback = {
            resetStateButtonClicked.value++
        },
        pauseCallback = {
            // TODO can we mock lifecycle events to trigger this?
        }
    )

    /**
     * Sets up the screen content before each test begins
     * */
    @Before
    fun setup(){
        setContent {
            NextToGoScreen(
                model = model
            )
        }
    }

    /**
     * Checks the default value of each variable, before any screen
     * events (button clicks and such) have been performed.
     * */
    @Test
    fun setupIsComplete_checkDefaultValues(){

        assert(selectedChoice.value.isEmpty())

        // Variable starts at 0, but the Effect from the screen
        // triggers a reset on launch, so the value gets updated
        // to 1.
        assertEquals(1, resetStateButtonClicked.value)

        val state = model.uiState.value
        assert(state.loadingState is RacingUseCaseOutcome.Success)
        assert(state.races.isNotEmpty())
        assert(state.category.isEmpty())

    }

    /**
     * Checks if the category list is displaying correctly.
     *
     * The category list is always shown, regardless of the UI
     * loadingState.
     * */
    @Test
    fun setupIsComplete_checkIfCategoryListIsShown(){

        onNodeWithTag("FilterButtonListMulti")
            .assertExists()
            .assertIsDisplayed()

        // The component should show all categories except for ALL.
        // So check for (size - 1) number of filters
        val choicesSize = RacingCategory.entries.size - 1
        (0 until choicesSize).forEach {
            onNodeWithTag("FilterButtonListMultiButton_$it")
                .assertExists()
                .assertIsDisplayed()
        }

    }

    /**
     * Checks if the selected choice is updated whenever a button
     * on the UI element is pressed.
     *
     * Whenever a new button is pressed, the item in the mutable
     * state variable is changed.
     *
     * NOTE This test is different than the test of the FilterButtonList*
     * classes of the same name.
     * Unlike those tests, this one checks the value of the most recently
     * selected filter.
     * It does NOT remember previously selected values, and does not
     * check if multiple filters can be selected at once.
     * Those are tested by the FilterButtonList* unit tests already.
     * */
    @Test
    fun buttonListItemIsChecked_checkIfChoiceIsUpdated(){

        assertEquals(0, selectedChoice.value.size)

        onNodeWithTag("FilterButtonListMultiButton_0")
            .performClick()

        assertEquals(1, selectedChoice.value.size)
        assertEquals(RacingCategory.GREYHOUND_RACING, selectedChoice.value.first())

        onNodeWithTag("FilterButtonListMultiButton_1")
            .performClick()

        assertEquals(1, selectedChoice.value.size)
        assertEquals(RacingCategory.HORSE_RACING, selectedChoice.value.first())

        onNodeWithTag("FilterButtonListMultiButton_2")
            .performClick()

        assertEquals(1, selectedChoice.value.size)
        assertEquals(RacingCategory.HARNESS_RACING, selectedChoice.value.first())

    }

    /**
     * Checks which components are visible when the screen is in
     * a Success loadingState.
     * */
    @Test
    fun loadingStateIsSuccess_expectedUiElementsAreShown(){

        onNodeWithTag("RaceCardList")
            .assertExists()
            .assertIsDisplayed()

        onNodeWithTag("NextToGoScreenInProgressText")
            .assertDoesNotExist()

        onNodeWithTag("NextToGoScreenTryAgainButton")
            .assertDoesNotExist()

    }

    /**
     * Checks which components are visible when the screen is in
     * a Failure loadingState.
     *
     * Also confirms that the Try Again button works by pressing
     * it and checking that the callback is invoked.
     * */
    @Test
    fun loadingStateIsFailure_expectedUiElementsAreShown(){

        model.uiState.value = model.uiState.value.copy(
            loadingState = RacingUseCaseOutcome.Failure(Exception())
        )

        onNodeWithTag("RaceCardList")
            .assertDoesNotExist()

        onNodeWithTag("NextToGoScreenInProgressText")
            .assertDoesNotExist()

        onNodeWithTag("NextToGoScreenTryAgainButton")
            .assertExists()
            .assertIsDisplayed()
            .performClick()

        assertEquals(2, resetStateButtonClicked.value)

    }

    /**
     * Checks which components are visible when the screen is in
     * a Progress loadingState.
     * */
    @Test
    fun loadingStateIsProgress_expectedUiElementsAreShown(){

        model.uiState.value = model.uiState.value.copy(
            loadingState = RacingUseCaseOutcome.Progress()
        )

        onNodeWithTag("RaceCardList")
            .assertDoesNotExist()

        onNodeWithTag("NextToGoScreenTryAgainButton")
            .assertDoesNotExist()

        onNodeWithTag("NextToGoScreenInProgressText")
            .assertExists()
            .assertIsDisplayed()
            .performClick()

    }

}