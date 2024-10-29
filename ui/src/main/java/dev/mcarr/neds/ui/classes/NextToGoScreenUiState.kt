package dev.mcarr.neds.ui.classes

import dev.mcarr.neds.common.classes.racing.RaceCardData
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome

/**
 * Data class containing the state of the user interface
 * for the NextToGo screen.
 *
 * @param category Applied category filters
 * @param loadingState Current state of the UseCase
 * @param races Races to display
 *
 * @see dev.mcarr.neds.ui.screens.NextToGoScreen
 * @see dev.mcarr.neds.ui.viewmodels.NextToGoViewModel
 * */
data class NextToGoScreenUiState(
    val category: List<RacingCategory>,
    val loadingState: RacingUseCaseOutcome,
    val races: List<RaceCardData>
)