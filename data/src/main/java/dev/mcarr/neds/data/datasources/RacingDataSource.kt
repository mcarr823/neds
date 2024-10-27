package dev.mcarr.neds.data.datasources

import dev.mcarr.neds.common.enums.http.EventType
import dev.mcarr.neds.common.enums.racing.RacingMethod
import dev.mcarr.neds.data.classes.racing.RacingNetworkResponse
import dev.mcarr.neds.net.client.KtorClient
import dev.mcarr.neds.net.uri.NedsUri
import io.ktor.client.call.body

/**
 * HTTP data source for any API calls to the /racing endpoint on the server.
 * */
class RacingDataSource : IRacingDataSource {

    override suspend fun getNextRace(
        count: Int
    ): RacingNetworkResponse {
        val uri = NedsUri.Builder()
            .setEventType(EventType.RACING)
            .setMethod(RacingMethod.NEXT_RACES.value)
            .setCount(count)
            .build()

        return KtorClient.get(uri).body()
    }

}