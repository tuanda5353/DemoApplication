package com.tuanda.demoapplication.data.datasource

import com.tuanda.demoapplication.data.model.WeatherResponse

interface MainRepository {
    suspend fun getWeatherByCityName(cityName: String): WeatherResponse
}