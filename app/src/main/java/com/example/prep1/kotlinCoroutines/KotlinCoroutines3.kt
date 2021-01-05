package com.example.prep1.kotlinCoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import kotlinx.coroutines.withTimeoutOrNull

fun main()= runBlocking{

    println("Main Program Starts: ${Thread.currentThread().name}")

    val value=withTimeoutOrNull(2000){

            for (i in 0..500){
                print("$i.")
                delay(500)
            }
        "Done"

    }

    print("result $value")

    println("\nMain Program Ends: ${Thread.currentThread().name}")
}