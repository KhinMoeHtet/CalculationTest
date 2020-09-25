package com.example.calculateapp.viewmodel

import androidx.lifecycle.ViewModel

class MultipleViewModel: ViewModel() {
    private var result: Int = 0
    fun getMultiple(): Int = result
    fun setMultiple(nOne: Int, nTwo: Int): Int {
        result = nOne * nTwo
        return result
    }
}