package dev.mcarr.neds.ui.components.base

import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.mcarr.neds.ui.theme.NedsTheme

/**
 * Generic multi-selection button list component.
 *
 * This component provides a basic implementation of a segmented button row
 * which other, more specific components should build upon.
 *
 * It takes a list of values which the user can choose from, provided as
 * a list of key-value pairs.
 *
 * The keys are displayed as text on the individual buttons, and the values
 * are provided to the callback when one of the buttons is pressed.
 *
 * @param choices List of pairs, with the String value being displayed on the
 * user interface, and the generic T value representing the underlying data.
 * @param currentChoices The currently selected choices out of the `choices`
 * list.
 * @param selectChoices Callback to invoke when one of the buttons is pressed.
 * Provides the selected choices via the callback.
 * */
@Composable
fun <T> FilterButtonListMulti(
    choices: List<Pair<String, T>>,
    currentChoices: List<T>,
    selectChoices: (List<T>) -> Unit
) {

    MultiChoiceSegmentedButtonRow {
        choices.forEachIndexed { index, choice ->
            SegmentedButton(
                checked = choice.second in currentChoices,
                onCheckedChange = { checked ->

                    // Add or remove the current selection from the list
                    // based on whether it is checked or not.
                    val newChoices =
                        if (checked){
                            currentChoices.filter { it != choice }
                        }else{
                            currentChoices + choice.second
                        }

                    selectChoices(newChoices)

                },
                label = { Text(choice.first) },
                shape = SegmentedButtonDefaults.itemShape(index = index, count = choices.size)
            )
        }
    }

}

/**
 * Preview of a FilterButtonListMulti component in light mode.
 * */
@Preview
@Composable
fun PreviewFilterButtonListMulti(){
    val choices = listOf(
        "1" to "choice1",
        "2" to "choice2",
        "3" to "choice3",
        "4" to "choice4"
    )
    NedsTheme {
        FilterButtonListMulti(
            choices = choices,
            currentChoices = listOf(choices[0].second, choices[2].second),
            selectChoices = {}
        )
    }
}

/**
 * Preview of a FilterButtonListMulti component in dark mode.
 * */
@Preview
@Composable
fun PreviewFilterButtonListMultiDark(){
    val choices = listOf(
        "1" to "choice1",
        "2" to "choice2",
        "3" to "choice3",
        "4" to "choice4"
    )
    NedsTheme(
        darkTheme = true
    ) {
        FilterButtonListMulti(
            choices = choices,
            currentChoices = listOf(choices[0].second, choices[2].second),
            selectChoices = {}
        )
    }
}