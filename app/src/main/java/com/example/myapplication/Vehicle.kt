package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Vehicle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vehicle)
        findViewById<TextView>(R.id.addButton).setOnClickListener{
            Toast.makeText(this, "congrats", Toast.LENGTH_LONG).show()
        }
    }
}