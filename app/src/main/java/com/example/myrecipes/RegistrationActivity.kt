package com.example.myrecipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrecipes.databinding.ActivityRegistrationBinding
import com.example.myrecipes.databinding.ActivityWelcomeBinding

class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_registration)*/
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        binding.textView2.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}