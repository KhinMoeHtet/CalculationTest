package com.example.calculateapp.viewmodel

import androidx.lifecycle.ViewModel

class MinusViewModel:ViewModel() {
    private var result:Int=0
    fun getMinus():Int=result

    fun setMinus(nOne:Int,nTwo:Int):Int{
        result=nOne-nTwo
        return result

    }
}