package com.example.prep1

import com.example.prep1.kotlinCoroutines.myDelayFun
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testCoroutines(){
        runBlocking {
            myDelayFun(1000)
        }
    }
}