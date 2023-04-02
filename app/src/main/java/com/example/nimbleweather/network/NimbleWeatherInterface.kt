package com.example.nimbleweather.network

import com.example.nimbleweather.model.NimbleWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface NimbleWeatherInterface {
    @Headers(
        "Accept: application/json"
    )
    @GET("/v4/weather/forecast?location={location}&apikey={apiKey}")
    suspend fun getWeather(location: String, apiKey: String): Response<NimbleWeather>
}