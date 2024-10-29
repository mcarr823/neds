package dev.mcarr.neds.common.interfaces.viewmodels

import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import dev.mcarr.neds.common.enums.racing.RacingCategory
import kotlinx.coroutines.flow.StateFlow

/**
 * Interface from which the NextToGoViewModel class, and any
 * models which fake or mock that class, should inherit.
 *
 * See the NextToGoViewModel class for documentation on what
 * the individual variables and functions do.
 * */
interface INextToGoViewModel {

    val exactNumberOfResultsToDisplay: Int

    val uiState: StateFlow<NextToGoScreenUiState>

    fun setCategory(category: List<RacingCategory>)

    fun resetState()

}