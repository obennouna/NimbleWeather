package com.example.nimbleweather.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.nimbleweather.dao.NimbleWeatherDao
import com.example.nimbleweather.model.NimbleWeather
import com.example.nimbleweather.utils.SingletonHolder
import com.example.nimbleweather.utils.WeatherTypeConverter

@Database(entities = [NimbleWeather::class], version = 1, exportSchema = true)
@TypeConverters(WeatherTypeConverter::class)
abstract class AppDatabase: RoomDatabase() {
    abstract fun weatherDao(): NimbleWeatherDao

    companion object : SingletonHolder<AppDatabase, Context>({
        Room.databaseBuilder(it.applicationContext,
            AppDatabase::class.java, "nimbleweather.db")
            .build()
    })
}