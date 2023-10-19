package com.example.amphibians.network

import com.example.amphibians.model.AmphibiansItem
import retrofit2.http.GET

interface AmphibiansApiService {
    @GET("items")
    suspend fun getAmphibiansItems(): List<AmphibiansItem>
}