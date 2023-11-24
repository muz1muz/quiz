package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Results : AppCompatActivity() {

    private lateinit var twr : TextView
    private lateinit var btn4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)


        initUI()
        displayMessage()
    }


    private fun displayMessage() {
        val mesaj = intent.extras?.getString(Intent.EXTRA_TEXT)
        twr.setText("kazanan"+mesaj)
    }

    private fun initUI() {
         twr = findViewById(R.id.twr)


        btn4.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)


        }
    }
}