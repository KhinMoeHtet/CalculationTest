package com.example.calculateapp.viewmodel

import androidx.lifecycle.ViewModel

class AddViewModel:ViewModel() {
    private var result:Int=0
    fun getAdd():Int=result

    fun setAdd(nOne:Int,nTwo:Int):Int{
        result=nOne+nTwo
        return result

    }

}