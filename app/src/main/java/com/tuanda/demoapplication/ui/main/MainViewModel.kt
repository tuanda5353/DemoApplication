package com.tuanda.demoapplication.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.tuanda.demoapplication.data.datasource.MainRepository
import com.tuanda.demoapplication.data.model.Result
import kotlinx.coroutines.Dispatchers

class MainViewModel(val mainRepository: MainRepository) : ViewModel() {
    val result = liveData(Dispatchers.IO) {
        emit(Result.Loading)
        try {
            emit(Result.Success(data = mainRepository.getWeatherByCityName("HaNoi")))
        } catch (exception: Exception) {
            emit(Result.Error(exception))
        }
    }
}