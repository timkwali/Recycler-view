package com.example.leaderboard

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

//ADAPTER FOR THE FRAGMENTS IN VIEWPAGER
class TabsAdapter(private val context: Context, fm: FragmentManager, internal var numOfTabs: Int):
    FragmentPagerAdapter(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    //GET CURRENT FRAGMENT
    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return FollowingFragment()
            1 -> return LocalFragment()
            else -> return GlobalFragment()
        }
    }

    //GET NUMBER OF TABS
    override fun getCount(): Int {
        return numOfTabs
    }
}