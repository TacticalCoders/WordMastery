package com.example.wordmastery.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wordmastery.R


class MyWordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("MyWordFragment", "onCreateView()실행됨")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_word, container, false)
    }

}