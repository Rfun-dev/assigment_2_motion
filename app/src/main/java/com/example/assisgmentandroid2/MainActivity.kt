package com.example.assisgmentandroid2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.assisgmentandroid2.adapter.ViewPagerAdapter
import com.example.assisgmentandroid2.databinding.ActivityMainBinding
import com.example.assisgmentandroid2.dummy.CourseDummy
import com.google.android.material.tabs.TabLayoutMediator
import com.google.firebase.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = binding.tlActivityMain
        val viewPager = binding.vpActivtyMain
        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager.adapter = adapter


        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.text = CourseDummy.text[position]
            tab.icon = ContextCompat.getDrawable(this, CourseDummy.icon[position])
        }.attach()
    }
}