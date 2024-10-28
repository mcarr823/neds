package dev.mcarr.neds.ui.components.racing

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.performClick
import dev.mcarr.neds.mock.data.datasources.FakeRace1
import dev.mcarr.neds.ui.AbstractUiUnitTest
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit tests for the RaceCard class.
 *
 * @see RaceCard
 * */
class RaceCardTest : AbstractUiUnitTest() {

    // Race summary to display
    val summary = FakeRace1()

    // Text for the "race starts in..." value derived from the summary
    var startedText = ""

    // Number of times the card has been tapped
    val clicked = mutableStateOf<Int>(0)

    /**
     * Performs the layout.
     * */
    @Before
    fun setup(){

        // This is set here because the return value of the function
        // changes every second. So it's important to save the value
        // as soon as the summary object is composed.
        startedText = summary.startsInDisplayText()

        setContent {
            var clickCount by remember { clicked }
            RaceCard(
                summary = summary,
                onClick = { clickCount++ }
            )
        }
    }

    /**
     * Checks if the UI element is composed properly, it exists, and
     * it can be seen.
     *
     * Also checks each of its children.
     * */
    @Test
    fun cardIsComposed_checkIfItIsDisplayedProperly(){

        onNodeWithTag("RaceCard_${summary.raceId}")
            .assertExists()
            .assertIsDisplayed()

        onNodeWithText(startedText)
            .assertExists()
            .assertIsDisplayed()

        onNodeWithText(summary.getRaceNumberDisplayText())
            .assertExists()
            .assertIsDisplayed()

    }

    @Test
    fun cardIsTapped_checkIfCallbackIsInvoked(){

        assertEquals(0, clicked.value)

        onNodeWithTag("RaceCard_${summary.raceId}")
            .performClick()

        assertEquals(1, clicked.value)

        onNodeWithTag("RaceCard_${summary.raceId}")
            .performClick()

        assertEquals(2, clicked.value)

    }

}