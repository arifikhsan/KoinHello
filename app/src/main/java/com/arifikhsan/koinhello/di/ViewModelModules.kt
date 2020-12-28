package com.arifikhsan.koinhello.di

import com.arifikhsan.koinhello.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModules = module {
    viewModel { MainViewModel(get(), get()) }
}