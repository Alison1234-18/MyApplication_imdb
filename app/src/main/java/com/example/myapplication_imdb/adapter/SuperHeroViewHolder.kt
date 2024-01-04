package com.example.myapplication_imdb.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication_imdb.R
import com.example.myapplication_imdb.SuperHeroe

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val superHero = view.findViewById<TextView>(R.id.nombretextView)
    val marca = view.findViewById<TextView>(R.id.marcatextView3)
    val realNameTextView = view.findViewById<TextView>(R.id.realNameTextView)
    val photo = view.findViewById<ImageView>(R.id.imageView2)

    fun render(superHeroModel: SuperHeroe) {
        superHero.text = superHeroModel.nombre
        marca.text = superHeroModel.marca
        realNameTextView.text = superHeroModel.realName
        Glide.with(photo.context).load(superHeroModel.photo).into(photo)
    }
}