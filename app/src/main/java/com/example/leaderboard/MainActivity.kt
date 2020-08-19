package com.example.leaderboard

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

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

        //GET TABS-ADAPTER AND PUT IN VIEWPAGER
        var adapter = TabsAdapter(this, supportFragmentManager, tabs.tabCount)
        view.adapter = adapter

        //SET CURRENT TAB
        view.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabs))
        tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
            override fun onTabSelected(tab: TabLayout.Tab) {
                view.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        //SET UP SPINNER
        var spinner = findViewById<Spinner>(R.id.spTimeline)
        val arrayAdapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(this, R.array.timeline, android.R.layout.simple_spinner_item)
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener
    }

    //OVERRIDE METHODS FOR SPINNER
    override fun onNothingSelected(p0: AdapterView<*>?) {}

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {}

    //SET CURRENT TAB ON START OF APPLICATION
    override fun onStart() {
        super.onStart()
        vpView.currentItem = 3
    }


}