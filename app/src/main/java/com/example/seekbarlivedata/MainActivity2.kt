package com.example.seekbarlivedata

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val timetv = findViewById<TextView>(R.id.textView)
        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            object : CountDownTimer(30000, 1000) {
                override fun onTick(millisUntilFinished: Long) {
                    timetv.text = (millisUntilFinished / 1000).toString()
                }
                override fun onFinish() {
                    timetv.text = "0"
                }
            }.start()
        }
    }
}