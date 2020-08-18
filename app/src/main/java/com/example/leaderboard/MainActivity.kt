package com.example.leaderboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabs = findViewById<TabLayout>(R.id.tlTabs)
        var view = findViewById<ViewPager>(R.id.vpView)

        //FILL TABS WITH ITEMS
        tabs.addTab(tabs.newTab().setText("FOLLOWING"))
        tabs.addTab(tabs.newTab().setText("LOCAL"))
        tabs.addTab(tabs.newTab().setText("GLOBAL"))



    }
}