package com.example.pixabay

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MViewModel: ViewModel() {
    var count = 0
    val result = MutableLiveData<String>()
    fun increment (){
        count++
        result.value =count.toString()
    }
    fun decrement (){
        count--
result.value = count.toString()
    }
}