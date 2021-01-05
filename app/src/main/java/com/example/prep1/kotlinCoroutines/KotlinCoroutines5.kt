package com.example.prep1.kotlinCoroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis


fun main() = runBlocking {

    println("Main Program Starts: ${Thread.currentThread().name}")


        val msgOne: Deferred<String> = async(start = CoroutineStart.LAZY) {  getMessageOne1()}
        val msgTwo: Deferred<String> = async(start = CoroutineStart.LAZY) {  getMessageTwo2()}
        println("Entire message ${msgOne.await()} ${msgTwo.await()}")



    println("\nMain Program Ends: ${Thread.currentThread().name}")
}

suspend fun getMessageOne1(): String {
    delay(1000L)
    println("After working in get message1")
    return "Hello"
}


suspend fun getMessageTwo2(): String {
    delay(1000L)
    println("After working in get message2")
    return "World"
}
