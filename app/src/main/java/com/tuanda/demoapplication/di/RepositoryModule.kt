package com.tuanda.demoapplication.di

import com.tuanda.demoapplication.data.datasource.MainRepository
import com.tuanda.demoapplication.data.datasource.remote.RemoteDataSource
import com.tuanda.demoapplication.data.datasource.repoimpl.MainRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single { RemoteDataSource(get()) }
    single<MainRepository> { MainRepositoryImpl(get()) }
}
