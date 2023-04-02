package com.example.nimbleweather.viewmodel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nimbleweather.model.NimbleWeather
import com.example.nimbleweather.repository.NimbleWeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NimbleWeatherViewModel: ViewModel() {

    private val weatherRepository = NimbleWeatherRepository()
    private val _weather: MutableLiveData<NimbleWeather> = MutableLiveData()

    var weatherLiveData: LiveData<NimbleWeather> = _weather

    fun getWeather(context: Context, location: String) {
        _weather.apply {
            viewModelScope.launch(Dispatchers.Main) {
                value = context.let { weatherRepository.getWeather(it, location) }
            }
        }
    }
}