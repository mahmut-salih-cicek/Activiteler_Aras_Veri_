package com.example.activiteler_aras_veri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_two.*
import kotlinx.android.synthetic.main.activity_two.view.*

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

      val intent = intent
        var alınanVeri = intent.getStringExtra("Data")
        textView3.text = alınanVeri

    }



    fun bas(view:View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)


    }
}