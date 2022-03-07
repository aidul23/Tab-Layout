package com.aidul23.tablayout
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    var tabTitle = arrayOf("Message", "Status", "Call")
    private val tabIcons = intArrayOf(
        R.drawable.ic_tab_message,
        R.drawable.ic_tab_status,
        R.drawable.ic_tab_call
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabTitle[position]
        }.attach()

    }

}