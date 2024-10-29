package dev.mcarr.neds.ui.screens

import FakeNextToGoViewModel
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import dev.mcarr.neds.common.classes.racing.NextToGoScreenUiState
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.common.interfaces.viewmodels.INextToGoViewModel
import dev.mcarr.neds.common.sealed.racing.RacingUseCaseOutcome
import dev.mcarr.neds.data.repositories.RacingRepository
import dev.mcarr.neds.domain.racing.GetRacingDataUseCase
import dev.mcarr.neds.mock.data.datasources.FakeRacingDataSource
import dev.mcarr.neds.ui.components.racing.RaceCardList
import dev.mcarr.neds.ui.components.racing.RaceFilterButtonList
import dev.mcarr.neds.ui.theme.NedsTheme
import dev.mcarr.neds.ui.theme.Typography
import dev.mcarr.neds.ui.viewmodels.NextToGoViewModel

/**
 * Component for displaying the NextToGo screen of the Neds app.
 *
 * This screen displays:
 * - a filter for which type of races to display
 * - a list of upcoming or recently finished races
 *
 * @param model Viewmodel responsible for filtering, downloading data, etc.
 * */
@Composable
fun NextToGoScreen(
    model: INextToGoViewModel
) {

    // Hard-coded value per spec
    val exactNumberOfResultsToDisplay = model.exactNumberOfResultsToDisplay

    // State of the UI, held within the viewmodel
    val uiState by model.uiState.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier.fillMaxSize().padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Next To Go",
            style = Typography.headlineLarge,
            modifier = Modifier.padding(8.dp)
        )

        // Category filter
        RaceFilterButtonList(
            uiState.category,
            selectChoices = model::setCategory
        )

        Spacer(modifier = Modifier.height(8.dp))

        when(uiState.loadingState){

            // If the data failed to load, display an error message
            // and a Retry button
            is RacingUseCaseOutcome.Failure -> {

                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Failed to load",
                    style = Typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextButton(
                    onClick = model::resetState
                ) {
                    Text(
                        text = "Try Again",
                        style = Typography.headlineSmall
                    )
                }

            }

            // If the data was retrieved successfully, display the races
            is RacingUseCaseOutcome.Success -> {

                RaceCardList(
                    numberToDisplay = exactNumberOfResultsToDisplay,
                    summaries = uiState.races
                )

            }

            // If there is a data request in progress, display a loading message
            is RacingUseCaseOutcome.Progress -> {

                Spacer(modifier = Modifier.height(8.dp))
                CircularProgressIndicator()
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Loading...",
                    style = Typography.headlineMedium
                )

            }
        }

    }

    LaunchedEffect(Unit) {
        // When the screen launches, start the activity loop in the viewmodel
        model.resetState()
    }

}

/**
 * Preview of the NextToGoScreen composable in its Success state.
 *
 * NOTE This preview doesn't always display correctly due to the nature
 * of the viewmodel.
 * A mock viewmodel with fake data needs to be created to resolve this.
 * */
@Preview
@Composable
fun PreviewNextToGoScreen(){
    val source = FakeRacingDataSource()
    NedsTheme {
        NextToGoScreen(
            model = FakeNextToGoViewModel(
                exactNumberOfResultsToDisplay = 5,
                state = NextToGoScreenUiState(
                    category = listOf(),
                    loadingState = RacingUseCaseOutcome.Success(),
                    races = source.getRaceSummaries().map { it.toRaceCardData() }
                )
            )
        )
    }
}

/**
 * Preview of the NextToGoScreen composable in its Failure state.
 * */
@Preview
@Composable
fun PreviewNextToGoFailed(){
    NedsTheme {
        NextToGoScreen(
            model = FakeNextToGoViewModel(
                exactNumberOfResultsToDisplay = 5,
                state = NextToGoScreenUiState(
                    category = listOf(RacingCategory.HARNESS_RACING),
                    loadingState = RacingUseCaseOutcome.Failure(Exception()),
                    races = listOf()
                )
            )
        )
    }
}

/**
 * Preview of the NextToGoScreen composable in its Progress state.
 * */
@Preview
@Composable
fun PreviewNextToGoInProgress(){
    NedsTheme {
        NextToGoScreen(
            model = FakeNextToGoViewModel(exactNumberOfResultsToDisplay = 5, state = NextToGoScreenUiState(
                    listOf(RacingCategory.HORSE_RACING, RacingCategory.GREYHOUND_RACING),
                    RacingUseCaseOutcome.Progress(),
                    listOf()
                ))
        )
    }
}