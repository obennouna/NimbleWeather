package com.example.nimbleweather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.example.nimbleweather.ui.theme.NimbleWeatherTheme
import com.example.nimbleweather.viewmodel.NimbleWeatherViewModel

class MainActivity : ComponentActivity() {

    private lateinit var weatherViewModel: NimbleWeatherViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        weatherViewModel = ViewModelProvider(this)[NimbleWeatherViewModel::class.java]
        setContent {
            NimbleWeatherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Weather("casablanca")
                }
            }
        }
    }
}

@Composable
fun Weather(location: String) {
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NimbleWeatherTheme {
        Weather("Android")
    }
}