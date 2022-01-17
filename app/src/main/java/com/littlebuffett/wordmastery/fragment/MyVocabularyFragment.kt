package com.littlebuffett.wordmastery.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.littlebuffett.wordmastery.R
import com.littlebuffett.wordmastery.vocabularyrecycler.MyVocabularyAdapter


class MyVocabularyFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter: MyVocabularyAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("MyWordFragment", "onCreateView()실행됨")

        val view = inflater.inflate(R.layout.fragment_my_vocabulary, container, false)

        recyclerView = view.findViewById(R.id.recycler_myVocabulary)
        recyclerView.layoutManager = GridLayoutManager(context,2)

        adapter = MyVocabularyAdapter()
        recyclerView.adapter = adapter

        adapter.setSampleData()

        return view
    }

}