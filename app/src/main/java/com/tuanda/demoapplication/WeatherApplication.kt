package com.tuanda.demoapplication

import android.app.Application
import com.tuanda.demoapplication.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WeatherApplication : Application() {
    override fun onCreate() {
        startKoin {
            androidContext(this@WeatherApplication)
            modules(appModules)
        }
        super.onCreate()
    }
}