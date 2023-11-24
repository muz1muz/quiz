package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn5: Button
    private lateinit var tw :TextView
    private lateinit var tw2 :TextView
    lateinit var input : EditText
    lateinit var input2 :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        initUI()
    }
        var number=0
        var number2=0
    private fun initUI(){
        btn1 =findViewById(R.id.btn1)
        btn2 =findViewById(R.id.btn2)
        btn5 =findViewById(R.id.btn5)
        tw=findViewById(R.id.tw1)
        tw2=findViewById(R.id.tw2)
        input =findViewById(R.id.etvw)
        input2 =findViewById(R.id.etvw2)
        var sonuc=""
        var sonuc2=""

            btn5.setOnClickListener {
                 sonuc=""
                 sonuc2=""
                tw.text=""
                tw2.text=""
                number=0
                 number2=0
            }
        btn1.setOnClickListener{
            number++
            number2++
            tw.text=number.toString()
            tw2.text=number.toString()
             sonuc2 =input2.toString()
             sonuc =input.toString()

            if (number>5 )
            {
                val intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    putExtras(Bundle().apply {
                        putString(Intent.EXTRA_TEXT, sonuc)
                    })
                }

            }
            else
            {
                val intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    type = "text/plain"
                    putExtras(Bundle().apply {
                        putString(Intent.EXTRA_TEXT, sonuc2)



            })}}


            if (number>5 )
            {
                val intent = Intent(this, Results::class.java)
                val bundle = Bundle()
                bundle.putString(Intent.EXTRA_TEXT, sonuc)
                intent.putExtras(bundle)
                startActivity(intent)

            }else{
                val intent = Intent(this, Results::class.java)
                val bundle = Bundle()
                bundle.putString(Intent.EXTRA_TEXT, sonuc2)
                intent.putExtras(bundle)
                startActivity(intent)

            }

        }
    }
}