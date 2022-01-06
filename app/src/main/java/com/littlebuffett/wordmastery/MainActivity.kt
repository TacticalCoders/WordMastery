package com.littlebuffett.wordmastery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import com.littlebuffett.wordmastery.fragment.DictionaryFragment
import com.littlebuffett.wordmastery.fragment.MyWordFragment
import com.littlebuffett.wordmastery.fragment.ReadFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.littlebuffett.wordmastery.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mainFrame : FrameLayout
    private lateinit var bottomNavbar: BottomNavigationView

    private lateinit var homeFragment: Fragment
    private lateinit var readFragment: ReadFragment
    private lateinit var dictionaryFragment: DictionaryFragment
    private lateinit var myWordFragment: MyWordFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainFrame = findViewById(R.id.mainFrame)
        bottomNavbar = findViewById(R.id.bottomNavigationView)
        homeFragment = HomeFragment()
        readFragment = ReadFragment()
        dictionaryFragment = DictionaryFragment()
        myWordFragment = MyWordFragment()

        initNavagationBar()

    }

    fun initNavagationBar(){
        changeFragment(homeFragment)
        bottomNavbar.setOnItemSelectedListener {
            when(it.itemId){
                R.id.bottom_home -> {changeFragment(homeFragment)}
                R.id.bottom_read ->{ changeFragment(readFragment)}
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
