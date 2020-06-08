package com.tuanda.demoapplication

import android.app.Application
import com.tuanda.demoapplication.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * An application that lazily provides a repository. Note that this Service Locator pattern is
 * used to simplify the sample. Consider a Dependency Injection framework.
 *
 * Also, sets up Timber in the DEBUG BuildConfig. Read Timber's documentation for production setups.
 */
class TodoApplication : Application() {

    override fun onCreate() {
        startKoin {
            androidContext(this@TodoApplication)
            modules(appModules)
        }
        super.onCreate()
    }
}
