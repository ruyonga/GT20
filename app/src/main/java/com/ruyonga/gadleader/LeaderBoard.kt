package com.ruyonga.gadleader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.ruyonga.gadleader.ui.main.SectionsPagerAdapter
import kotlinx.android.synthetic.main.activity_leader_board.*

class LeaderBoard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)

        val fragmentAdapter = SectionsPagerAdapter(supportFragmentManager)
        view_pager.adapter = fragmentAdapter

        tabs.setupWithViewPager(view_pager)
    }


}