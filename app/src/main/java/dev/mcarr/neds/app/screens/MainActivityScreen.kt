package dev.mcarr.neds.app.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.mcarr.neds.app.navigation.NextToGoDestination
import dev.mcarr.neds.ui.screens.NextToGoScreen
import dev.mcarr.neds.ui.theme.NedsTheme
import dev.mcarr.neds.ui.viewmodels.NextToGoViewModel

/**
 * Composable which displays the contents of MainActivity.
 *
 * This composable has been split out from MainActivity for the sake of
 * making previews and testing more straightforward, and also to better
 * separate their responsibilities.
 *
 * This composable is intentionally NOT placed in the :ui module, since it
 * relies on functionality which doesn't belong in the :ui module (such as
 * navigation) and it only ever serves a purpose within the context of
 * MainActivity anyway.
 *
 * @see dev.mcarr.neds.MainActivity
 * */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainActivityScreen() {

    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text("Neds")
                },
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NextToGoDestination,
            modifier = Modifier.padding(innerPadding)
        ){

            composable<NextToGoDestination>{
                NextToGoScreen(
                    model = viewModel<NextToGoViewModel>()
                )
            }

        }
    }

}

/**
 * Preview of the MainActivityScreen when the NextToGo screen is active.
 * */
@Preview(showBackground = true)
@Composable
fun MainActivityScreenNextToGoPreview() {
    NedsTheme {
        // Defaults to the NextToGo screen, so no additional arguments
        // are required at this time.
        MainActivityScreen()
    }
}