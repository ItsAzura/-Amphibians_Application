package com.example.amphibians.data

import com.example.amphibians.model.AmphibiansItem
import com.example.amphibians.network.AmphibiansApiService

interface AmphibiansRepository {
    suspend fun getAmphibiansItems(): List<AmphibiansItem>
}

class NetworkAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
): AmphibiansRepository {
    override suspend fun getAmphibiansItems(): List<AmphibiansItem> = amphibiansApiService.getAmphibiansItems()
}