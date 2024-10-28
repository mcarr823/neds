package dev.mcarr.neds.ui.components.racing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.mcarr.neds.ui.theme.NedsTheme

/**
 * A card depicting a loading message while waiting for a racing event to load.
 *
 * This is used as a placeholder for RaceCard when the race hasn't loaded yet.
 *
 * @param onClick Optional onClick callback to invoke when tapped
 *
 * @see RaceCard
 * */
@Composable
fun RaceCardLoading(
    onClick: () -> Unit = {}
) {

    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text("Loading race...")
            CircularProgressIndicator()
        }
    }

}

/**
 * Preview of a single RaceCardLoading component in light mode.
 * */
@Preview
@Composable
fun PreviewRaceCardLoadingSingle(){
    NedsTheme(
        darkTheme = false
    ){
        RaceCardLoading()
    }
}

/**
 * Preview of a single RaceCardLoading component in dark mode.
 * */
@Preview
@Composable
fun PreviewRaceCardLoadingSingleDark(){
    NedsTheme(
        darkTheme = true
    ){
        RaceCardLoading()
    }
}

/**
 * Preview of multiple RaceCardLoading components.
 *
 * NOTE When displaying multiple RaceCardLoading components, you should probably
 * use the RaceCardList component instead.
 * This preview doesn't do that since it is intended to preview the card
 * component, not the list component.
 * But when actually implementing the RaceCardLoading component, consider using the
 * list component instead.
 *
 * @see RaceCardList
 * */
@Preview
@Composable
fun PreviewRaceCardLoadingMulti(){
    NedsTheme{
        LazyColumn {
            items(5){
                Spacer(modifier = Modifier.height(8.dp))
                RaceCardLoading()
            }
        }
    }
}