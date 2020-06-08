package com.tuanda.demoapplication.di

import android.content.Context
import androidx.room.Room
import com.tuanda.demoapplication.data.source.DefaultTasksRepository
import com.tuanda.demoapplication.data.source.TasksDataSource
import com.tuanda.demoapplication.data.source.TasksRepository
import com.tuanda.demoapplication.data.source.local.TasksLocalDataSource
import com.tuanda.demoapplication.data.source.local.ToDoDatabase
import com.tuanda.demoapplication.util.Constants
import org.koin.dsl.module

val repositoryModule = module {
    single { createAppDatabase(get()) }
    single<TasksDataSource> { TasksLocalDataSource(get<ToDoDatabase>().taskDao()) }
    single<TasksRepository> { DefaultTasksRepository(get()) }
}

fun createAppDatabase(context: Context) =
    Room.databaseBuilder(context, ToDoDatabase::class.java, Constants.DATABASE_NAME).build()