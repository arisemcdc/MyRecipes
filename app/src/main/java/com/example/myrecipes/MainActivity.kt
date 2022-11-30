package com.example.myrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import com.example.myrecipes.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import timber.log.Timber
import timber.log.Timber.Forest.d
import timber.log.Timber.Forest.log

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)*/
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_activity_main, SearchFragment())
            .commit()
        val navView: BottomNavigationView = binding.navView

        val listener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.searchFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, SearchFragment())
                        .commit()
                    true
                }
                R.id.favoritesFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, FavoriteFragment())
                        .commit()
                    true
                }
                R.id.profileFragment -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.nav_host_fragment_activity_main, ProfileFragment())
                        .commit()
                    true
                }
                else -> false
           }
        }
        navView.setOnNavigationItemSelectedListener(listener)
        val fakeFoodRepository = FakeFoodRepository()
        val foodUtils = FoodUtils()
        Log.d("MainActivity", "This is for OnCreate")
       /* timber.log.Timber.d("MainActivity","This is for onCreate111")
        Timber.d("Hello","1")*/
        d("Fakerepository", fakeFoodRepository.getRecipe())
        d("Fakerepository", fakeFoodRepository.sortByRating(fakeFoodRepository.getRecipe(),true))
        d("Fakerepository", fakeFoodRepository.sortByCalories(fakeFoodRepository.getRecipe()))
        d("Fakerepository", fakeFoodRepository.sortByTimeForPreparing(fakeFoodRepository.getRecipe()))
        d("Fakerepository", fakeFoodRepository.sortByCategory(fakeFoodRepository.getRecipe()))
        d("Fakerepository", foodUtils.resolveFoodIngredient(Ingridient.WATER) )
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "This is for OnResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "This is for OnStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "This is for OnPause")
    }
}