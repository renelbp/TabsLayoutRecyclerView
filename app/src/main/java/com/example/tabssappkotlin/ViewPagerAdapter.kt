package com.example.tabssappkotlin

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabssappkotlin.fragments.FragmentGames
import com.example.tabssappkotlin.fragments.FragmentPlayers

class ViewPagerAdapter(val context: Context, supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {

    val tabNames = arrayOf(R.string.Fragment1, R.string.Fragment2 )
    val tabImage = arrayOf(R.drawable.ic_baseline_person_pin_24,R.drawable.ic_baseline_videogame_asset_24)
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when (position ){
            0-> {
                val fragment1 = FragmentPlayers()
                return fragment1
            }
            1->{
                val fragment2 = FragmentGames()
                return fragment2
            }
            else ->{

                return Fragment()
            }

        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(tabNames[position])

    }

}
