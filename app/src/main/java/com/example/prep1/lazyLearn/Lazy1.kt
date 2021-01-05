package com.example.prep1.lazyLearn

import kotlin.properties.Delegates

class Lazy1 {

    lateinit var value1:String
//    lateinit var value2:Int

    var test by Delegates.notNull<Int>()

    val obj1 : Int by lazy{
         3
    }

    fun main(){
        test=7
//        obj1=4
    }
}