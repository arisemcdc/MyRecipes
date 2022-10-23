package com.example.myrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import timber.log.Timber
import timber.log.Timber.Forest.d
import timber.log.Timber.Forest.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*timber.log.d("MainActivity","This is log for OnCreate")*/
        /*log(1, "MainActivity", "This is log for OnCreate")*/
        Log.d("MainActivity", "This is for OnCreate")
        timber.log.Timber.d("MainActivity","This is for onCreate111")
        Timber.d("Hello","1")

    }
}