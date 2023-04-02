package com.example.nimbleweather.model

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.RawValue

// We annotate @keep this class to avoid having it obfuscated by ProGuard
@Keep
@Entity
data class NimbleWeather(
    @PrimaryKey(autoGenerate = true)
    val _id: Int,
    val location: @RawValue Location,
    val timelines: @RawValue Timelines
)