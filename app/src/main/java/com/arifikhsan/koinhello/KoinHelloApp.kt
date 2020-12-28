package com.arifikhsan.koinhello

import android.app.Application
import com.arifikhsan.koinhello.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinHelloApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@KoinHelloApp)
            modules(appModules)
        }
    }
}