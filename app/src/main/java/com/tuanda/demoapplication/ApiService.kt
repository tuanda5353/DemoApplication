package com.tuanda.demoapplication

import com.tuanda.demoapplication.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather?&units=metric")
    suspend fun getWeatherByCityName(@Query("q") cityName: String): WeatherResponse
}
