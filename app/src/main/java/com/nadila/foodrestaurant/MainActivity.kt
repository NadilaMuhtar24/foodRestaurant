package com.nadila.foodrestaurant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nadila.foodrestaurant.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

    }
}