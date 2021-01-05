package com.example.prep1.kotlinCoroutines

import kotlinx.coroutines.*

fun main() = runBlocking {

    println("Main Program Starts: ${Thread.currentThread().name}")

    val job: Job = launch {

        try {

            for (i in 1..1000) {
                    print("$i.")
                    delay(5)
            }

        }catch (e: CancellationException){
            println(e.message)
        }finally {
            withContext(NonCancellable) {
                delay(10)
                println("close resources inFinally block")
            }
        }
    }

    delay(50)
    job.cancel(CancellationException("Crash Message"))
    job.join()

    println("\nMain Program Ends: ${Thread.currentThread().name}")

}