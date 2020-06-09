package com.tuanda.demoapplication.data.datasource.repoimpl

import com.tuanda.demoapplication.data.datasource.MainRepository
import com.tuanda.demoapplication.data.datasource.remote.RemoteDataSource
import com.tuanda.demoapplication.data.model.WeatherResponse

class MainRepositoryImpl(private val remoteDataSource: RemoteDataSource) :
    MainRepository {
    override suspend fun getWeatherByCityName(cityName: String): WeatherResponse =
        remoteDataSource.getWeatherByCityName(cityName)
}