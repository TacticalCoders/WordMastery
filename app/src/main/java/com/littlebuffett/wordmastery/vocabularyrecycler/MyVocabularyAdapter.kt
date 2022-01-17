package com.littlebuffett.wordmastery.vocabularyrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.littlebuffett.wordmastery.R

class MyVocabularyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val items = mutableListOf<MyVocabulary>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = MyVocabularyHolder.create(parent)


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is MyVocabularyHolder -> holder.bind(items[position])
        }
    }

    override fun getItemCount(): Int = items.size

    class MyVocabularyHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView){

        private val title = itemView.findViewById<TextView>(R.id.vocabulary_title)

        fun bind(item:MyVocabulary){
            title.text = item.title
        }

        companion object Factory{
            fun create(parent: ViewGroup) : MyVocabularyHolder{
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.vocabulary_cover_item,parent,false)
                return MyVocabularyHolder(view)
            }
        }
    }

    fun addItem(item: MyVocabulary){
        this.items.add(item)
    }

    fun setSampleData(){
        addItem(MyVocabulary("토익 단어장"))
        addItem(MyVocabulary("수능특강 단어"))
        addItem(MyVocabulary("공무원 9급"))
        addItem(MyVocabulary("텝스 대비"))
        addItem(MyVocabulary("팝송 단어"))
    }

}