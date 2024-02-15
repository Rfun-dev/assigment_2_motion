package com.example.assisgmentandroid2.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assisgmentandroid2.fragment.AccountFragment
import com.example.assisgmentandroid2.fragment.ExamsFragment
import com.example.assisgmentandroid2.fragment.HomeFragment
import com.example.assisgmentandroid2.fragment.SearchFragment
import com.example.assisgmentandroid2.fragment.WishlistFragment

public class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
            1 -> return SearchFragment()
            2 -> return ExamsFragment()
            3 -> return WishlistFragment()
            4 -> return AccountFragment()
        }
        return HomeFragment()
    }
}