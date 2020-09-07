package com.ruyonga.gadleader.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ruyonga.gadleader.R
import com.ruyonga.gadleader.lboard.LearningBoard
import com.ruyonga.gadleader.skillBoard.Skillsiq_leader

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)

class SectionsPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getCount(): Int {
        return TAB_TITLES.size
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            1 -> LearningBoard()
            2 -> Skillsiq_leader()
            else -> LearningBoard()
        }
    }
    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Learning Leaders"
            1 -> "Skill IQ Leaders"
            else -> {
                return "Learning Leaders"
            }
        }
    }
}