package com.example.activiteler_aras_veri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun Basmak(view:View){
        val kullaniciVerisi = editText.text.toString()

        val intent = Intent(applicationContext,ActivityTwo::class.java)
        intent.putExtra("Data",kullaniciVerisi)
        startActivity(intent)
    }
}