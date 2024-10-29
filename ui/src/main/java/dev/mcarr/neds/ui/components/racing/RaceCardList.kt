package dev.mcarr.neds.ui.components.racing

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.mcarr.neds.common.classes.racing.RaceCardData
import dev.mcarr.neds.common.classes.racing.RaceSummary
import dev.mcarr.neds.mock.data.datasources.FakeRacingDataSource
import dev.mcarr.neds.ui.theme.NedsTheme

/**
 * A list of cards depicting several racing events.
 *
 * Each card in the list is a RaceCard.
 *
 * @param summaries Summaries of the racing events to depict
 *
 * @see RaceCard
 * @see RaceCardLoading
 * */
@Composable
fun RaceCardList(
    numberToDisplay: Int,
    summaries: List<RaceCardData>
) {

    LazyColumn {
        items(numberToDisplay){ i ->
            Spacer(modifier = Modifier.height(8.dp))
            if (i < summaries.size) {
                RaceCard(
                    summaries[i]
                )
            }else{
                RaceCardLoading()
            }
        }
    }

}

/**
 * Preview of a RaceCardList component in light mode.
 * */
@Preview
@Composable
fun PreviewRaceCardList(){
    val source = FakeRacingDataSource()
    val summaries = source.getRaceSummaries()
        .map(RaceSummary::toRaceCardData)
    NedsTheme(
        darkTheme = false
    ) {
        RaceCardList(
            numberToDisplay = 5,
            summaries = summaries
        )
    }
}

/**
 * Preview of a RaceCardList component in dark mode.
 * */
@Preview
@Composable
fun PreviewRaceCardListDark(){
    val source = FakeRacingDataSource()
    val summaries = source.getRaceSummaries()
        .map(RaceSummary::toRaceCardData)
    NedsTheme(
        darkTheme = true
    ) {
        RaceCardList(
            numberToDisplay = 5,
            summaries = summaries
        )
    }
}