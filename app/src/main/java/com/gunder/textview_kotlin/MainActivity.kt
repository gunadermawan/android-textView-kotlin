package com.gunder.textview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        inisialisasi textView
        val textView = findViewById<TextView>(R.id.tv) as TextView
        textView?.setOnClickListener { Toast.makeText(this@MainActivity, "Youtuber pemula hehee", Toast.LENGTH_LONG).show() }
    }
}