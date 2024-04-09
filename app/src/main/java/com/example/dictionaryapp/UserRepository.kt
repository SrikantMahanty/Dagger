package com.example.dictionaryapp

import android.util.Log
import javax.inject.Inject

const val TAG ="srk"
class UserRepository @Inject constructor() {
    fun saveUser(s: String, s1: String) {
        Log.d(TAG,"User saved in DB")
    }
}