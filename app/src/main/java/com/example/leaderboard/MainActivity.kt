package com.example.leaderboard

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SET BACK BUTTON IN TOOL BAR
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //GET TAB-LAYOUT AND VIEWPAGER
        var tabs = findViewById<TabLayout>(R.id.tlTabs)
        var view = findViewById<ViewPager>(R.id.vpView)

        //FILL TABS WITH ITEMS
        tabs.addTab(tabs.newTab().setText("FOLLOWING"))
        tabs.addTab(tabs.newTab().setText("LOCAL"))
        tabs.addTab(tabs.newTab().setText("GLOBAL"))

        //SET TAB ITEMS COLORS
        tabs.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary))
//        tabs.tabTextColors(ContextCompat.getColor(this, R.color.white))



        //GET TABS-ADAPTER AND PUT IN VIEWPAGER
        var adapter = TabsAdapter(this, supportFragmentManager, tabs.tabCount)
        view.adapter = adapter

        //SET CURRENT TAB
        view.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
//        tabs.addOnTabSelectedListener(object : TabLayout.onTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab) {
//               view.currentItem = tab.position
//           }
//            override fun onTabUnselected(tab: TabLayout.Tab) {}
//            override fun onTabReselected(tab: TabLayout.Tab) {}
//        })
        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onTabSelected(tab: TabLayout.Tab) {
                view.currentItem = tab.position
//                tabs.tabIconTint(ContextCompat.getColorStateList(this@MainActivity, R.color.decagonGreenDark))
//                setTabIconTint(ContextCompat.getColorStateList(TabLayoutAndViewPagerActivity6.this, R.color.colorPrimary));
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }
}