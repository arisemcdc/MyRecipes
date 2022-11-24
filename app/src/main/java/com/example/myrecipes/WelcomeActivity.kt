package com.example.myrecipes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrecipes.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_welcome)*/
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.loginButton.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        binding.registrationButton.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }

    }
}