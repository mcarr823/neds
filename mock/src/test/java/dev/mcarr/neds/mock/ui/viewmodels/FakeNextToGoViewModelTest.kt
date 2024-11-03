package dev.mcarr.neds.mock.ui.viewmodels

import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * Series of unit tests for the FakeNextToGoViewModel class.
 *
 * These tests largely overlap with the tests for NextToGoScreen,
 * since the viewmodel is always used with the screen component.
 *
 * These tests are somewhat redundant, since the mock implementation's
 * functions are already tested with NextToGoScreen, since the screen
 * needs a viewmodel for testing purposes.
 *
 * But at least this way we can be sure that it works independently of
 * the screen.
 * */
class FakeNextToGoViewModelTest {

    var categoryChangedCount = 0
    var resetCallbackCount = 0
    var pauseCallbackCount = 0

    val model = FakeNextToGoViewModel(
        exactNumberOfResultsToDisplay = 1,
        state = NextToGoScreenUiState(
            category = listOf(),
            loadingState = RacingUseCaseOutcome.Progress(),
            races = listOf()
        ),
        setCategoryCallback = { categoryChangedCount++ },
        resetStateCallback = { resetCallbackCount++ },
        pauseCallback = { pauseCallbackCount++ }
    )

    @Test
    fun nothingHasHappenedYet_checkDefaultValues(){
        assertEquals(1, model.exactNumberOfResultsToDisplay)
        assertEquals(0, categoryChangedCount)
        assertEquals(0, resetCallbackCount)
        assertEquals(0, pauseCallbackCount)

        val state = model.uiState.value
        assert(state.category.isEmpty())
        assert(state.loadingState is RacingUseCaseOutcome.Progress)
        assert(state.races.isEmpty())
    }

    @Test
    fun categoryIsSelected_callbackIsInvoked(){
        assertEquals(0, categoryChangedCount)
        model.setCategory(listOf())
        assertEquals(1, categoryChangedCount)
        model.setCategory(listOf())
        assertEquals(2, categoryChangedCount)
    }

    @Test
    fun resetStateFunctionIsCalled_callbackIsInvoked(){
        assertEquals(0, resetCallbackCount)
        model.resetState()
        assertEquals(1, resetCallbackCount)
        model.resetState()
        assertEquals(2, resetCallbackCount)
    }

    @Test
    fun pauseFunctionIsCalled_callbackIsInvoked(){
        assertEquals(0, pauseCallbackCount)
        model.pause()
        assertEquals(1, pauseCallbackCount)
        model.pause()
        assertEquals(2, pauseCallbackCount)
    }

}