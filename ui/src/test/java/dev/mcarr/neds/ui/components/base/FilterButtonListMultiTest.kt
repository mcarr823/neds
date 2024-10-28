package dev.mcarr.neds.ui.components.base

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.performClick
import dev.mcarr.neds.ui.AbstractUiUnitTest
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit tests for the FilterButtonListMulti class.
 *
 * @see FilterButtonListMulti
 * */
class FilterButtonListMultiTest : AbstractUiUnitTest() {

    // Variable for monitoring changes to the user selection
    val selectedChoice = mutableStateOf<List<String>>(emptyList())

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
            FilterButtonListMulti(
                choices = choices,
                currentChoices = choice,
                selectChoices = { choice = it }
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

        onNodeWithTag("FilterButtonListMulti")
            .assertExists()
            .assertIsDisplayed()

        choices.indices.forEach {
            onNodeWithTag("FilterButtonListMultiButton_$it")
                .assertExists()
                .assertIsDisplayed()
        }

    }

    /**
     * Checks if the selected choice is updated whenever a button
     * on the UI element is pressed.
     *
     * Whenever a new button is pressed, the number of items in
     * the mutable state variable should increase.
     *
     * Unless that item is already in the variable. In which case,
     * it should be removed instead.
     * */
    @Test
    fun buttonListItemIsChecked_checkIfChoiceIsUpdated(){

        assertEquals(0, selectedChoice.value.size)

        onNodeWithTag("FilterButtonListMultiButton_0")
            .performClick()

        assertEquals(1, selectedChoice.value.size)

        onNodeWithTag("FilterButtonListMultiButton_1")
            .performClick()

        assertEquals(2, selectedChoice.value.size)

        onNodeWithTag("FilterButtonListMultiButton_1")
            .performClick()

        // Note that the value goes down here because we pressed
        // Button_1 a second time, effectively de-selecting it.
        assertEquals(1, selectedChoice.value.size)

    }

}