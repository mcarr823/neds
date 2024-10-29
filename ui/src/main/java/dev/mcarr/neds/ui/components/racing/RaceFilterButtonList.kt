package dev.mcarr.neds.ui.components.racing

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.ui.components.base.FilterButtonListMulti
import dev.mcarr.neds.ui.theme.NedsTheme

/**
 * Button list containing the different categories of racing which a user
 * can select to filter the results of a list of races.
 *
 * This composable builds upon the generic FilterButtonListMulti component and
 * provides racing-specific values to display.
 *
 * @param currentChoices Currently selected racing categories
 * @param selectChoices Callback to invoke when selecting a racing category
 *
 * @see RacingCategory
 * @see FilterButtonListMulti
 * */
@Composable
fun RaceFilterButtonList(
    currentChoices: List<RacingCategory>,
    selectChoices: (List<RacingCategory>) -> Unit
) {

    val choices = remember {
        listOf(
            "Greyhound" to RacingCategory.GREYHOUND_RACING,
            "Horse" to RacingCategory.HORSE_RACING,
            "Harness" to RacingCategory.HARNESS_RACING
        )
    }

    FilterButtonListMulti(
        choices = choices,
        currentChoices = currentChoices,
        selectChoices = selectChoices
    )

}

/**
 * Preview of a RaceFilterButtonList component with a single selection in light mode.
 * */
@Preview
@Composable
fun PreviewRaceFilterButtonList(){
    NedsTheme(
        darkTheme = false
    ) {
        Column {
            RacingCategory.entries.forEach {
                RaceFilterButtonList(
                    currentChoices = listOf(it),
                    selectChoices = {}
                )
            }
        }
    }
}

/**
 * Preview of a RaceFilterButtonList component with a single selection in dark mode.
 * */
@Preview
@Composable
fun PreviewRaceFilterButtonListDark(){
    NedsTheme(
        darkTheme = true
    ) {
        Column {
            RacingCategory.entries.forEach {
                RaceFilterButtonList(
                    currentChoices = listOf(it),
                    selectChoices = {}
                )
            }
        }
    }
}

/**
 * Preview of a RaceFilterButtonList component with multiple selections in light mode
 * with a large font.
 * */
@Preview(fontScale = 2f)
@Composable
fun PreviewRaceFilterButtonListLargeFont(){
    val currentChoices = listOf(RacingCategory.HARNESS_RACING, RacingCategory.HORSE_RACING)
    NedsTheme(
        darkTheme = false
    ) {
        Column {
            RaceFilterButtonList(
                currentChoices = currentChoices,
                selectChoices = {}
            )
        }
    }
}

/**
 * Preview of a RaceFilterButtonList component with multiple selections in light mode.
 * */
@Preview
@Composable
fun PreviewRaceFilterButtonListMulti(){
    val currentChoices = listOf(RacingCategory.HARNESS_RACING, RacingCategory.HORSE_RACING)
    NedsTheme(
        darkTheme = false
    ) {
        Column {
            RaceFilterButtonList(
                currentChoices = currentChoices,
                selectChoices = {}
            )
        }
    }
}

/**
 * Preview of a RaceFilterButtonList component with multiple selections in dark mode.
 * */
@Preview
@Composable
fun PreviewRaceFilterButtonListMultiDark(){
    val currentChoices = listOf(RacingCategory.HARNESS_RACING, RacingCategory.HORSE_RACING)
    NedsTheme(
        darkTheme = true
    ) {
        Column {
            RaceFilterButtonList(
                currentChoices = currentChoices,
                selectChoices = {}
            )
        }
    }
}