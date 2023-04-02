package com.example.nimbleweather.repository

import android.content.Context
import android.content.res.Resources
import com.example.nimbleweather.R
import com.example.nimbleweather.database.AppDatabase
import com.example.nimbleweather.model.NimbleWeather
import com.example.nimbleweather.network.NimbleWeatherClient
import com.example.nimbleweather.network.NimbleWeatherInterface
import com.example.nimbleweather.utils.MethodUtils

class NimbleWeatherRepository {

    /**
     * The reasoning behind this is that the Weathercan change hence fetching what was cached only if there is no connection.
     */
    suspend fun getWeather(context: Context, location: String): NimbleWeather? {
        val token = context.getString(R.string.tomorrow_token)
        val categoryDAO = AppDatabase.getInstance(context).weatherDao()
        if (!MethodUtils.isOnline(context)) {
            val result = categoryDAO.getAll()
            if (result != null) {
                return result
            }
        }

        try {
            val response = NimbleWeatherClient.apiClient.getWeather(location, token)
            if (response.isSuccessful && response.body() != null) {
                val data = response.body()!!
                categoryDAO.insert(data)
                return data
            }
        } catch (e: Exception) {
            return null
        }
        return null
    }
}