package com.example.githubportfolio

import android.app.Application
import com.example.githubportfolio.data.di.DataModule
import com.example.githubportfolio.domain.di.DomainModule
import com.example.githubportfolio.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}