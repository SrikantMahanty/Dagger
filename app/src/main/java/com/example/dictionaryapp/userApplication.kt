package com.example.dictionaryapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class userApplication:Application() {


    override fun onCreate() {
        super.onCreate()

        //userRepository.saveUser("test@gmail.com","11111")
    }

}