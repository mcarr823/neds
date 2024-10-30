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
 *
 * @see INextToGoViewModel
 * */
class FakeNextToGoViewModel(
    override val exactNumberOfResultsToDisplay: Int,
    state: NextToGoScreenUiState
) : INextToGoViewModel{

    override val uiState = MutableStateFlow(state)

    /**
     * Leave this unimplemented for now.
     * It isn't necessary for previewing purposes, but it might be
     * useful later if the model gets used for unit tests.
     * */
    override fun setCategory(category: List<RacingCategory>) = Unit

    /**
     * Leave this unimplemented for now.
     * It isn't necessary for previewing purposes, but it might be
     * useful later if the model gets used for unit tests.
     * */
    override fun resetState() = Unit

    /**
     * Leave this unimplemented for now.
     * It isn't necessary for previewing purposes, but it might be
     * useful later if the model gets used for unit tests.
     * */
    override fun pause() = Unit

}