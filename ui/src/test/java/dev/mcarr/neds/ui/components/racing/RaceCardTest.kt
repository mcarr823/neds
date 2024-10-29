package dev.mcarr.neds.ui.components.racing

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.performClick
import dev.mcarr.neds.mock.data.datasources.fakeRace1
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
    val summary = fakeRace1().toRaceCardData()

    // Number of times the card has been tapped
    val clicked = mutableStateOf<Int>(0)

    /**
     * Performs the layout.
     * */
    @Before
    fun setup(){

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

        onNodeWithText(summary.startsIn)
            .assertExists()
            .assertIsDisplayed()

        onNodeWithText(summary.raceNumber)
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