package dev.mcarr.neds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.mcarr.neds.app.screens.MainActivityScreen
import dev.mcarr.neds.ui.theme.NedsTheme

/**
 * Main (and only) activity of the app.
 *
 * This class is fairly empty.
 * Navigation and display are handled by the MainActivityScreen composable
 * instead.
 *
 * @see MainActivityScreen
 * */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NedsTheme {
                MainActivityScreen()
            }
        }
    }
}