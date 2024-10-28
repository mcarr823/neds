package dev.mcarr.neds.ui.components.base

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.performClick
import dev.mcarr.neds.ui.AbstractUiUnitTest
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit tests for the FilterButtonListSingle class.
 *
 * @see FilterButtonListSingle
 * */
class FilterButtonListSingleTest : AbstractUiUnitTest() {

    // Variable for monitoring changes to the user selection
    val selectedChoice = mutableStateOf("")

    // Hard-coded list of test choices
    val choices = listOf(
        "1" to "choice 1",
        "2" to "choice 2",
        "3" to "choice 3",
        "4" to "choice 4"
    )

    /**
     * Performs the layout and binds the mutable state variable.
     * */
    @Before
    fun setup(){
        setContent {
            var choice by remember { selectedChoice }
            FilterButtonListSingle(
                choices = choices,
                currentChoice = choice,
                selectChoice = { choice = it }
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
    fun buttonListIsComposed_checkIfItIsDisplayedProperly(){

        onNodeWithTag("FilterButtonListSingle")
            .assertExists()
            .assertIsDisplayed()

        choices.indices.forEach {
            onNodeWithTag("FilterButtonListSingleButton_$it")
                .assertExists()
                .assertIsDisplayed()
        }

    }

    /**
     * Checks if the selected choice is updated whenever a button
     * on the UI element is pressed.
     * */
    @Test
    fun buttonListItemIsChecked_checkIfChoiceIsUpdated(){

        assertEquals("", selectedChoice.value)

        onNodeWithTag("FilterButtonListSingleButton_0")
            .performClick()

        assertEquals(choices[0].second, selectedChoice.value)

        onNodeWithTag("FilterButtonListSingleButton_1")
            .performClick()

        assertEquals(choices[1].second, selectedChoice.value)

    }

}