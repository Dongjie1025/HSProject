package com.hs.hsproject.application

import android.app.Application
import android.content.Context

class BasicApplication : Application() {

    companion object {
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }
}