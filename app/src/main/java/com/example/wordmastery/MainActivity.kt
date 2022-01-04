package com.example.wordmastery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.example.wordmastery.fragment.DictionaryFragment
import com.example.wordmastery.fragment.MyWordFragment
import com.example.wordmastery.fragment.TodayFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var mainFrame : FrameLayout
    private lateinit var bottomNavbar: BottomNavigationView
    private lateinit var todayFragment: TodayFragment
    private lateinit var dictionaryFragment: DictionaryFragment
    private lateinit var myWordFragment: MyWordFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainFrame = findViewById(R.id.mainFrame)
        bottomNavbar = findViewById(R.id.bottomNavigationView)

        todayFragment = TodayFragment()
        dictionaryFragment = DictionaryFragment()
        myWordFragment = MyWordFragment()

        initNavagationBar()

    }

    fun initNavagationBar(){
        changeFragment(todayFragment)
        bottomNavbar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.bottom_today ->{ changeFragment(todayFragment)}
                R.id.bottom_dictionary->{ changeFragment(dictionaryFragment)}
                R.id.bottom_myWords->{ changeFragment(myWordFragment) }
            }
            return@setOnItemSelectedListener true
        }
    }

    fun changeFragment(fragment :Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.mainFrame, fragment).commit()
    }

}
