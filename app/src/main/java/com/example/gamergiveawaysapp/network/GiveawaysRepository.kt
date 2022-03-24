package com.example.gamergiveawaysapp.network

import com.example.gamergiveawaysapp.model.Giveaways
import retrofit2.Response

interface GiveawaysRepository {
    suspend fun getAllGiveaways(sortedBy: String): Response<List<Giveaways>>
    suspend fun getGiveawaysByPlatform(platform: String): Response<List<Giveaways>>
}

class GiveawaysRepositoryImpl(
    private val giveawaysService: GiveawaysService
) : GiveawaysRepository {

    override suspend fun getAllGiveaways(sortedBy: String): Response<List<Giveaways>> =
        giveawaysService.getAllGiveaways(sortedBy)

    override suspend fun getGiveawaysByPlatform(platform: String): Response<List<Giveaways>> =
        giveawaysService.getGiveawaysByPlatform(platform)

}