package com.tuanda.demoapplication.di

import com.tuanda.demoapplication.ui.main.MainViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { MainViewModel(get()) }
}