package com.example.leaderboard

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabsAdapter(private val context: Context, fm: FragmentManager, internal var numOfTabs: Int):
    FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return FollowingFragment()
            1 -> return LocalFragment()
            else -> return GlobalFragment()
        }
    }

    override fun getCount(): Int {
        return numOfTabs
    }
}