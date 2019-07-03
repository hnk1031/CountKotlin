package com.example.countkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.textView)

        val plus = findViewById<Button>(R.id.plus)

        val minus = findViewById<Button>(R.id.minus)

        val clear = findViewById<Button>(R.id.clear)

        plus.setOnClickListener {
            count++
            text.setText(count.toString())
        }

        minus.setOnClickListener {
            count--
            text.setText(count.toString())
        }

        clear.setOnClickListener {
            count = 0
            text.setText(count.toString())
        }

    }
}
