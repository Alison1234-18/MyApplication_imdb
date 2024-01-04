package com.example.myapplication_imdb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication_imdb.adapter.SuperHeroAdapter

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity2)

        initRecyclerView()
    }

    
    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
    }


}


