package com.example.prep1.viewModelLearn

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private var clickCountA = 0
    private  var clickCountB:Int = 0


    fun getInitialCountA():Int{
        return clickCountA
    }


    fun getInitialCountB():Int{
        return clickCountB
    }

    fun getCurrentCountA(): Int {
        clickCountA += 1
        return clickCountA
    }

    fun getCurrentCountB(): Int {
        clickCountA += 1
        return clickCountA
    }



}