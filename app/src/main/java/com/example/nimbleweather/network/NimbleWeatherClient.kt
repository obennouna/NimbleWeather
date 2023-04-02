package com.example.nimbleweather.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NimbleWeatherClient {
    val apiClient: NimbleWeatherInterface = Retrofit.Builder()
        .baseUrl("https://api.tomorrow.io")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NimbleWeatherInterface::class.java)
}