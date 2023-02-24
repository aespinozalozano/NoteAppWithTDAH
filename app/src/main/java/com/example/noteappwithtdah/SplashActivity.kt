package com.example.noteappwithtdah

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_main)

        Handler().postDelayed(Runnable { // This method will be executed once the timer is over
            startActivity(Intent(this, OnboardingActivity::class.java))

            // close this activity
            finish()
        }, 1500)

    }
}