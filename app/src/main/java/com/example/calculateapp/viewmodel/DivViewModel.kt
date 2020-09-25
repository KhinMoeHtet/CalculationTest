package com.example.calculateapp.viewmodel

import androidx.lifecycle.ViewModel

class DivViewModel:ViewModel() {
    private var result:Int=0
    fun getDiv():Int=result
    fun setDiv(nOne:Int,nTwo:Int):Int{
        result=nOne/nTwo
        return result
    }
}