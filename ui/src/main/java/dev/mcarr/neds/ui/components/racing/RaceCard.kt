package dev.mcarr.neds.ui.components.racing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.mcarr.neds.common.classes.racing.RaceCardData
import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.mock.data.datasources.FakeRacingDataSource
import dev.mcarr.neds.ui.theme.NedsTheme

/**
 * A card depicting a single racing event.
 *
 * Per the specification, each card displays the race number, meeting name,
 * and a countdown until the advertised starting time.
 *
 * @param summary Summary of the racing event to depict
 * @param onClick Optional onClick callback to invoke when tapped
 * */
@Composable
fun RaceCard(
    summary: RaceCardData,
    onClick: () -> Unit = {}
) {

    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
            .testTag("RaceCard_${summary.raceId}")
    ){
        Column(
            modifier = Modifier.padding(8.dp)
        ){
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(summary.raceNumber)
                Text(summary.startsIn)
            }
            Text(summary.meetingName)
        }
    }

}

/**
 * Preview of a single RaceCard component in light mode.
 * */
@Preview
@Composable
fun PreviewRaceCardSingle(){
    val source = FakeRacingDataSource()
    val summary = source.getRaceSummary()
    NedsTheme(
        darkTheme = false
    ){
        RaceCard(
            summary = summary.toRaceCardData()
        )
    }
}

/**
 * Preview of a single RaceCard component in dark mode.
 * */
@Preview
@Composable
fun PreviewRaceCardSingleDark(){
    val source = FakeRacingDataSource()
    val summary = source.getRaceSummary()
    NedsTheme(
        darkTheme = true
    ){
        RaceCard(
            summary = summary.toRaceCardData()
        )
    }
}

/**
 * Preview of multiple RaceCard components.
 *
 * NOTE When displaying multiple RaceCard components, you should probably
 * use the RaceCardList component instead.
 * This preview doesn't do that since it is intended to preview the card
 * component, not the list component.
 * But when actually implementing the RaceCard component, consider using the
 * list component instead.
 *
 * @see RaceCardList
 * */
@Preview
@Composable
fun PreviewRaceCardMulti(){
    val source = FakeRacingDataSource()
    val summaries = source.getRaceSummaries()
        .map(RaceSummary::toRaceCardData)
    NedsTheme{
        LazyColumn {
            items(summaries){
                Spacer(modifier = Modifier.height(8.dp))
                RaceCard(
                    summary = it
                )
            }
        }
    }
}