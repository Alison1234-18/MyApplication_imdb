package com.example.myapplication_imdb

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_login)

        val loginButton: Button = findViewById(R.id.button)

        loginButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val intent = Intent(applicationContext, MainActivity_inicio::class.java)
                startActivity(intent)
            }
        })

    }

}