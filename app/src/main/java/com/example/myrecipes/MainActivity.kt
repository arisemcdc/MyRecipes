package com.example.myrecipes

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import timber.log.Timber
import timber.log.Timber.Forest.d
import timber.log.Timber.Forest.log
import timber.log.Timber.Forest.tag

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fakeFoodRepository = FakeFoodRepository()
        val foodUtils = FoodUtils()
        /*timber.log.d("MainActivity","This is log for OnCreate")*/
        /*log(1, "MainActivity", "This is log for OnCreate")*/
        d("MainActivity", "This is for OnCreate")
        Timber.d("MainActivity", "This is for onCreate111")
        Timber.d("Hello", "1")
        Log.d("Fakerepository", fakeFoodRepository.getRecipe().toString())
        Log.d("Fakerepository", fakeFoodRepository.sortByRating().toString())
        Log.d("Fakerepository", fakeFoodRepository.sortByCalories().toString())
        Log.d("Fakerepository", fakeFoodRepository.sortByCategory().toString())
        Log.d("Fakerepository", fakeFoodRepository.sortByTimeForPreparing().toString())
        Log.d("Fakerepository", foodUtils.resolveFoodIngredient("WATER").toString())
    }

}