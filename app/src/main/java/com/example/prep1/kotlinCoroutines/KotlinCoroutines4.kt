package com.example.prep1.kotlinCoroutines

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {

    println("Main Program Starts: ${Thread.currentThread().name}")

//    val time= measureTimeMillis {
//        val msgOne = getMessageOne()
//        val msgTwo = getMessageTwo()
//        println("Entire message $msgOne $msgTwo")
//    }


    val time= measureTimeMillis {
        val msgOne:Deferred<String> = async {  getMessageOne()}
        val msgTwo:Deferred<String> = async {  getMessageTwo()}
        println("Entire message ${msgOne.await()} ${msgTwo.await()}")
    }

    println("time taken $time")


    println("\nMain Program Ends: ${Thread.currentThread().name}")
}

suspend fun getMessageOne(): String {
    delay(1000L)
    return "Hello"
}


suspend fun getMessageTwo(): String {
    delay(1000L)
    return "World"
}

