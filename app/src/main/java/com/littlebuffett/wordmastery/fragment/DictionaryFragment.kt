package com.littlebuffett.wordmastery.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.littlebuffett.wordmastery.R

class DictionaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("DictionaryFragment", "onCreateView()실행됨")

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dictionary, container, false)
    }

}