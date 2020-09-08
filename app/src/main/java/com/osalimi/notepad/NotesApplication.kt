package com.osalimi.notepad

import android.app.Application
import com.osalimi.notepad.data.DataStore.init

class NotesApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        init(this)
    }
}