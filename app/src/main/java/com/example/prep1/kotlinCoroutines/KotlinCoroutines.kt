package com.example.prep1.kotlinCoroutines

import kotlinx.coroutines.*
import kotlin.concurrent.thread


fun main()= runBlocking{

    println("Main Program Starts ${Thread.currentThread().name}")

    var deferred: Deferred<Unit> =GlobalScope.async {
        println("Other thread Starts ${Thread.currentThread().name}")
        myDelayFun(1000)
        println("Other thread ends ${Thread.currentThread().name}")
    }

    var value:Unit=deferred.await()
//    deferred.join()

    println("Main Program ends ${Thread.currentThread().name}")
}

suspend fun myDelayFun(time : Long){

    delay(1000)
}