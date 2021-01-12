package com.childlearningnotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnNote : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //btnNote
        btnNote=findViewById(R.id.btn_note)
        btnNote.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
        //btnNote
    }
}