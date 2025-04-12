package com.allcampusapp.allcampus

import android.app.Application
import com.google.firebase.FirebaseApp

class MyApp : Application(){

    override fun onCreate() {
        super.onCreate()
        // Initialize Firebase
        FirebaseApp.initializeApp(this)
    }
}