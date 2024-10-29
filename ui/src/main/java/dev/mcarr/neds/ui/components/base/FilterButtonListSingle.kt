package dev.mcarr.neds.ui.components.base

import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import dev.mcarr.neds.ui.theme.NedsTheme

/**
 * Generic single-selection button list component.
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
 * @param currentChoice The currently selected choice out of the `choices`
 * list.
 * @param selectChoice Callback to invoke when one of the buttons is pressed.
 * Provides the selected choice via the callback.
 * */
@Composable
fun <T> FilterButtonListSingle(
    choices: List<Pair<String, T>>,
    currentChoice: T,
    selectChoice: (T) -> Unit
) {

    SingleChoiceSegmentedButtonRow(
        modifier = Modifier.testTag("FilterButtonListSingle")
    ) {
        choices.forEachIndexed { index, choice ->
            SegmentedButton(
                selected = currentChoice == choice.second,
                onClick = { selectChoice(choice.second) },
                label = {
                    Text(
                        text = choice.first,
                        softWrap = false,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                shape = SegmentedButtonDefaults.itemShape(index = index, count = choices.size),
                modifier = Modifier.testTag("FilterButtonListSingleButton_$index")
            )
        }
    }

}

/**
 * Preview of a FilterButtonListSingle component in light mode.
 * */
@Preview
@Composable
fun PreviewFilterButtonListSingle(){
    val choices = listOf(
        "1" to "choice1",
        "2" to "choice2",
        "3" to "choice3",
        "4" to "choice4"
    )
    NedsTheme {
        FilterButtonListSingle(
            choices = choices,
            currentChoice = choices[0].second,
            selectChoice = {}
        )
    }
}

/**
 * Preview of a FilterButtonListSingle component in dark mode.
 * */
@Preview
@Composable
fun PreviewFilterButtonListSingleDark(){
    val choices = listOf(
        "1" to "choice1",
        "2" to "choice2",
        "3" to "choice3",
        "4" to "choice4"
    )
    NedsTheme(
        darkTheme = true
    ) {
        FilterButtonListSingle(
            choices = choices,
            currentChoice = choices[0].second,
            selectChoice = {}
        )
    }
}

/**
 * Preview of a FilterButtonListSingle component in light mode
 * with a large font.
 * */
@Preview(fontScale = 2f)
@Composable
fun PreviewFilterButtonListSingleLargeFont(){
    val choices = listOf(
        "1" to "choice1",
        "2" to "choice2",
        "3" to "choice3",
        "4" to "choice4"
    )
    NedsTheme {
        FilterButtonListSingle(
            choices = choices,
            currentChoice = choices[0].second,
            selectChoice = {}
        )
    }
}