package com.example.prep1.kotlinCoroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread


fun main(){

    println("Main Program Starts ${Thread.currentThread().name}")

    GlobalScope.launch {
        println("Other thread Starts ${Thread.currentThread().name}")
        Thread.sleep(1000)
        println("Other thread ends ${Thread.currentThread().name}")
    }
    Thread.sleep(2000)

    println("Main Program ends ${Thread.currentThread().name}")
}