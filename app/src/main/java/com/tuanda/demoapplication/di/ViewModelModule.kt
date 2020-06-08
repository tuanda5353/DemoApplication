package com.tuanda.demoapplication.di

import androidx.lifecycle.SavedStateHandle
import com.tuanda.demoapplication.ui.addedittask.AddEditTaskViewModel
import com.tuanda.demoapplication.ui.statistics.StatisticsViewModel
import com.tuanda.demoapplication.ui.taskdetail.TaskDetailViewModel
import com.tuanda.demoapplication.ui.tasks.TasksViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { AddEditTaskViewModel(get()) }
    viewModel { StatisticsViewModel(get()) }
    viewModel { TaskDetailViewModel(get()) }
    viewModel { (handle: SavedStateHandle) -> TasksViewModel(handle, get()) }
}