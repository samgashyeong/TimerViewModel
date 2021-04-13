package com.example.seekbarlivedata

import android.os.CountDownTimer
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.seekbarlivedata.databinding.ActivityMainBinding

class LivedataModel : ViewModel(){
    val time : MutableLiveData<Int> by lazy{
        MutableLiveData<Int>()
    }
    init{
        time.value = 30
    }
    fun countdown(){
        object : CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                time.value = (millisUntilFinished/1000).toInt()
                Log.d("few", time.value.toString())
            }
            override fun onFinish() {
                time.value = 0
            }
        }.start()
    }
}