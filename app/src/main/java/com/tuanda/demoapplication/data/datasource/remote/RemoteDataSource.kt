package com.tuanda.demoapplication.data.datasource.remote

import com.tuanda.demoapplication.ApiService
import com.tuanda.demoapplication.data.datasource.MainRepository
import com.tuanda.demoapplication.data.model.WeatherResponse

class RemoteDataSource(private val apiService: ApiService) :
    MainRepository {
    override suspend fun getWeatherByCityName(cityName: String): WeatherResponse =
        apiService.getWeatherByCityName(cityName)
}