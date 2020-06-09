package com.tuanda.demoapplication.di

import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {
    single { androidApplication().resources }
}

val appModules = listOf(appModule, repositoryModule, viewModelModule, networkModule)