package com.example.hilt.app

import android.app.Application
import com.example.hilt.DatabaseHelper
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class App: Application() {
    @Inject
    lateinit var databaseHelper: DatabaseHelper

    override fun onCreate() {
        super.onCreate()
    }
}