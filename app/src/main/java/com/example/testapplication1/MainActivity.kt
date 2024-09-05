package com.example.testapplication1

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val skip = findViewById<TextView>(R.id.textView)
        val continue1 = findViewById<TextView>(R.id.textView2)
        skip.setOnClickListener{
            Toast.makeText(this, "Would You Like to skip", Toast.LENGTH_SHORT).show()
        }
        continue1.setOnClickListener{
            Toast.makeText(this, "Would You Like to continue", Toast.LENGTH_SHORT).show()
        }
    }
}