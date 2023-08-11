package com.example.dotindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dotindicator.databinding.ActivityMainBinding
import com.example.dotindicator.fragments.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        binding.viewPagerTwo.adapter = adapter
        binding.indicator.setViewPager2(binding.viewPagerTwo)

    }
}