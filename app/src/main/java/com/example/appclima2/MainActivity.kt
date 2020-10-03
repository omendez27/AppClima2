package com.example.appclima2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ciudad = intent.getStringExtra("com.example.appclima2.ActivityCiudad.CIUDAD")
        Toast.makeText(this, ciudad, Toast.LENGTH_SHORT).show()
    }
}