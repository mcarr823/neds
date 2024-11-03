package dev.mcarr.neds.common.interfaces.viewmodels

import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.interfaces.domain.racing.IGetRacingDataUseCase
import kotlinx.coroutines.flow.StateFlow

/**
 * Interface from which the NextToGoViewModel class, and any
 * models which fake or mock that class, should inherit.
 *
 * See the NextToGoViewModel class for documentation on what
 * the individual variables and functions do.
 * */
interface INextToGoViewModel {

    /**
     * :domain layer class for applying business logic to the network data
     * before exposing it to this viewmodel.
     * */
    val source: IGetRacingDataUseCase

    /**
     * The exact number of races we want to display at all times.
     *
     * This number is used by both the UI (to show that exact number of results)
     * and by the viewmodel (to download more data if it doesn't meet this required number).
     * */
    val exactNumberOfResultsToDisplay: Int

    /**
     * Flow which updates the UiState object exposed to the user interface.
     * */
    val uiState: StateFlow<NextToGoScreenUiState>

    /**
     * Apply a list of categories by which to filter the race data.
     *
     * @param category List of categories by which to filter
     * */
    fun setCategory(category: List<RacingCategory>)

    /**
     * Reset the state of the viewmodel.
     *
     * This should be performed when a screen starts using this viewmodel.
     * eg. In a LaunchedEffect which runs once.
     *
     * It can also be run to restart the flow of events when something goes
     * wrong.
     * eg. An error is encountered while downloading data.
     *
     * Note that this doesn't reset all variables.
     * It only resets variables which are pertinent to the viewmodel providing
     * an ongoing data feed to the UI.
     * */
    fun resetState()

    /**
     * Stops the viewmodel's UI state variable from updating until resetState
     * is next called.
     * */
    fun pause()

}