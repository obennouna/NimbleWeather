package com.example.nimbleweather.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.nimbleweather.model.NimbleWeather

@Dao
interface NimbleWeatherDao {
    @Query("SELECT * FROM NimbleWeather")
    suspend fun getAll(): NimbleWeather?

    @Insert
    suspend fun insert(nimbleWeather: NimbleWeather)
}
