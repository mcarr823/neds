package dev.mcarr.neds.mock.ui.viewmodels

import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.interfaces.viewmodels.INextToGoViewModel
import kotlinx.coroutines.flow.MutableStateFlow

/**
 * Fake viewmodel made specifically for previewing purposes.
 *
 * This viewmodel fakes the NextToGoViewModel class by implementing
 * the INextToGoViewModel interface.
 *
 * It should be used when previewing screens which normally use
 * the NextToGoViewModel class.
 *
 * @param exactNumberOfResultsToDisplay Number of results the UI should display
 * @param state UI state variable containing the data to display
 * @param setCategoryCallback Callback to invoke when the setCategory function
 * is triggered.
 * @param resetStateCallback Callback to invoke when the resetState function
 * is triggered.
 * @param pauseCallback Callback to invoke when the pause function is
 * triggered.
 *
 * @see INextToGoViewModel
 * */
class FakeNextToGoViewModel(
    override val exactNumberOfResultsToDisplay: Int,
    state: NextToGoScreenUiState,
    private val setCategoryCallback: (category: List<RacingCategory>) -> Unit = {},
    private val resetStateCallback: () -> Unit = {},
    private val pauseCallback: () -> Unit = {},
) : INextToGoViewModel{

    override val uiState = MutableStateFlow(state)

    override fun setCategory(category: List<RacingCategory>){
        setCategoryCallback(category)
    }

    override fun resetState(){
        resetStateCallback()
    }

    override fun pause(){
        pauseCallback()
    }

}