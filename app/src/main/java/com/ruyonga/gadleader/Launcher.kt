package com.ruyonga.gadleader

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Launcher : AppCompatActivity() {
     val splashTimeout: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_launcher)
        GlobalScope.launch {
            delay(splashTimeout)
            redirectToHome()
        }
    }

    fun redirectToHome() {
        startActivity(Intent(this, LeaderBoard::class.java))
        finish()
    }
}