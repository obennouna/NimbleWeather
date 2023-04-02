package com.example.nimbleweather.utils

import androidx.room.TypeConverter
import com.example.nimbleweather.model.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class WeatherTypeConverter {

    @TypeConverter
    fun fromStringToLocation(value: String?): Location? {
        return Gson().fromJson(value, Location::class.java)
    }

    @TypeConverter
    fun fromLocationToString(obj: Location?): String? {
        return Gson().toJson(obj)
    }

    @TypeConverter
    fun fromStringToTimeline(value: String?): Timelines? {
        return Gson().fromJson(value, Timelines::class.java)
    }

    @TypeConverter
    fun fromTimelinesToString(obj: Timelines?): String? {
        return Gson().toJson(obj)
    }

    @TypeConverter
    fun fromStringToDaily(value: String?): Daily? {
        return Gson().fromJson(value, Daily::class.java)
    }

    @TypeConverter
    fun fromDailyToString(obj: Daily?): String? {
        return Gson().toJson(obj)
    }

    @TypeConverter
    fun fromStringToHourly(value: String?): Hourly? {
        return Gson().fromJson(value, Hourly::class.java)
    }

    @TypeConverter
    fun fromHourlyToString(obj: Hourly?): String? {
        return Gson().toJson(obj)
    }

    @TypeConverter
    fun fromStringToMinutely(value: String?): Minutely? {
        return Gson().fromJson(value, Minutely::class.java)
    }

    @TypeConverter
    fun fromMinutelyToString(obj: Minutely?): String? {
        return Gson().toJson(obj)
    }

    @TypeConverter
    fun fromStringToValuesDaily(value: String?): ValuesDaily? {
        return Gson().fromJson(value, ValuesDaily::class.java)
    }

    @TypeConverter
    fun fromValuesDailyToString(obj: ValuesDaily?): String? {
        return Gson().toJson(obj)
    }

    @TypeConverter
    fun fromStringToValuesHourly(value: String?): ValuesHourly? {
        return Gson().fromJson(value, ValuesHourly::class.java)
    }

    @TypeConverter
    fun fromValuesHourlyToString(obj: ValuesHourly?): String? {
        return Gson().toJson(obj)
    }

    @TypeConverter
    fun fromStringToValuesMinutely(value: String?): ValuesMinutely? {
        return Gson().fromJson(value, ValuesMinutely::class.java)
    }

    @TypeConverter
    fun fromValuesMinutelyToString(obj: ValuesMinutely?): String? {
        return Gson().toJson(obj)
    }
}