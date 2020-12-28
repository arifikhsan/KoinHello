package com.arifikhsan.koinhello

import android.app.Application
import com.arifikhsan.koinhello.di.appModules
import com.arifikhsan.koinhello.di.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinHelloApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startInjection()
    }

    private fun startInjection() {
        startKoin {
            androidContext(this@KoinHelloApp)
            val modules = listOf(appModules, viewModelModules)

            modules(modules)
        }
    }
}