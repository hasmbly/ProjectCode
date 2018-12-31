package com.intecs.project.projectcode

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    //private final val SPLASH_DISPLAY_LENGTH = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Start Home Activity
        val i = Intent(this@SplashActivity, MainActivity::class.java)
        startActivity(i)
        //close splash activity
        finish()
    }
}