package com.example.assisgmentandroid2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assisgmentandroid2.adapter.ViewPagerAdapter
import com.example.assisgmentandroid2.databinding.ActivityMainBinding
import com.example.assisgmentandroid2.dummy.CourseDummy
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

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