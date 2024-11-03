package dev.mcarr.neds.ui.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNull
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.TestCoroutineScheduler
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

/**
 * Unit tests for the NextToGoViewModel class.
 * */
@RunWith(RobolectricTestRunner::class)
@Config(manifest=Config.NONE)
class NextToGoViewModelTest {

    lateinit var model: NextToGoViewModel
    lateinit var state: MutableState<NextToGoScreenUiState>
    val scheduler = TestCoroutineScheduler()
    lateinit var dispatcher: TestDispatcher

    /**
     * Sets up the model for testing.
     *
     * This stage is very important due to the way that dispatchers
     * and states are handled when testing with coroutines and flows.
     *
     * The current setup method makes sure that everything is running
     * within the context of our test scheduler and test dispatcher.
     * */
    @OptIn(ExperimentalCoroutinesApi::class)
    @Before
    fun setup() {

        dispatcher = UnconfinedTestDispatcher(scheduler)
        Dispatchers.setMain(dispatcher)

        model = NextToGoViewModel()
        state = mutableStateOf(model.uiState.value)

    }

    /**
     * Check the default values of the viewmodel
     * */
    @Test
    fun nothingHasHappenedYet_checkDefaultValues(){
        assert(model.categories.value.isEmpty())
        assertEquals(0L, model.timeTick.value)
        assertEquals(0L, model.lastDownloadMillis)
        assertNull(model.eventLoop)

        val state = model.uiState.value
        assert(state.category.isEmpty())
        assert(state.loadingState is RacingUseCaseOutcome.Success)
        assert(state.races.isEmpty())
    }

    /**
     * Tests the resetState() function of the viewmodel by manually
     * changing the values which it resets, then running the function
     * and checking if the values have been reset.
     *
     * Note that this test also checks for values set by the
     * updateViews() function, since resetState() calls that function
     * at the end.
     * */
    @Test
    fun resetStateFunctionIsCalled_variablesAreReset() = runTest {

        // Collect the state of the flow
        backgroundScope.launch(dispatcher) {
            model.uiState.collectLatest {
                state.value = it
            }
        }

        // Manually change the two variables which should be reset.
        // Note that the second variable is actually being set on
        // model.source instead of model directly.
        // This is because the variable in model is collected from
        // the source variable, and we want to test if that collection
        // is functioning correctly.
        model.lastDownloadMillis = 100L
        model.source.lastOutcome.value = RacingUseCaseOutcome.Progress()

        // Confirm that the values have been set.
        // Note that the second test is for the local variable, rather than
        // the variable on scope.
        // If the flow collection is working correctly, then the local value
        // should reflect the other variable.
        assertEquals(100L, model.lastDownloadMillis)
        assert(state.value.loadingState is RacingUseCaseOutcome.Progress)

        // Also confirm that the event loop is null.
        // This is set by the updateViews() function, which is called by
        // the resetState() function.
        // It should be null until either of those two functions are called.
        assertNull(model.eventLoop)

        // Reset both variables
        model.resetState()

        // Confirm that they've been reset
        assertEquals(0L, model.lastDownloadMillis)
        assert(state.value.loadingState is RacingUseCaseOutcome.Success)
        assert(model.eventLoop != null)

    }

}