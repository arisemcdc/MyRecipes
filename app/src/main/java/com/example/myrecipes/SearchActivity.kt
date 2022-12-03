package com.example.myrecipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrecipes.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_search)*/
        binding = ActivitySearchBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}