package dev.mcarr.neds.ui.components.racing

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.performClick
import dev.mcarr.neds.common.enums.racing.RacingCategory
import dev.mcarr.neds.ui.AbstractUiUnitTest
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Unit tests for the RaceFilterButtonList class.
 *
 * These tests should largely overlap with FilterButtonListMultiTest,
 * since one component is based on the other.
 *
 * @see RaceFilterButtonList
 * @see dev.mcarr.neds.ui.components.base.FilterButtonListMultiTest
 * */
class RaceFilterButtonListTest : AbstractUiUnitTest() {

    // Variable for monitoring changes to the user selection
    val selectedChoice = mutableStateOf<List<RacingCategory>>(emptyList())

    /**
     * Performs the layout and binds the mutable state variable.
     * */
    @Before
    fun setup(){
        setContent {
            var choice by remember { selectedChoice }
            RaceFilterButtonList(
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

        // -1 is because we only display the actual categories, not
        // the ALL category.
        val size = RacingCategory.entries.size - 1

        (0 until size).forEach {
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

        assertEquals(1, selectedChoice.value.size)

    }

}