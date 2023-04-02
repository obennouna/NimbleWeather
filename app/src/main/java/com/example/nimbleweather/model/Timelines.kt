package com.example.nimbleweather.model

data class Timelines(
    val daily: List<Daily>,
    val hourly: List<Hourly>,
    val minutely: List<Minutely>
)