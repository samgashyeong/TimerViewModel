package com.example.seekbarlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.seekbarlivedata.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding : ActivityMain3Binding
    private lateinit var model : LivedataModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main3)
        model = ViewModelProviders.of(this).get(LivedataModel::class.java)
        binding.lifecycleOwner = this
        binding.viewmodel = model
    }
}