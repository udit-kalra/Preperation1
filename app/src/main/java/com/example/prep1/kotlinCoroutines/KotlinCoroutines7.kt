package com.example.prep1.cor1

import kotlinx.coroutines.*

fun main() = runBlocking{
    println("runblocking: $this")

    val la1=launch {
        println("C1 : ${Thread.currentThread().name}")
        delay(1000)
        println("C1 After Delay : ${Thread.currentThread().name}")
    }

    val la2=launch(Dispatchers.Default) {
        println("C2 : ${Thread.currentThread().name}")
        delay(1000)
        println("C2 After Delay: ${Thread.currentThread().name}")  // can be a different thread

    }

    val la3=launch(Dispatchers.Unconfined) {
        println("C3 : ${Thread.currentThread().name}")
        delay(1000)
        println("C3 After Delay: ${Thread.currentThread().name}")

    }


    val la4=launch(coroutineContext) {
        println("C4 : ${Thread.currentThread().name}")
        delay(1000)
        println("C4 After Delay: ${Thread.currentThread().name}")

    }

//    la1.join()
//    la2.join()
//    la3.join()
}
