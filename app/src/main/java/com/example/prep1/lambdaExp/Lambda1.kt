package com.example.prep1.lambdaExp

fun main(){

    val program=Program()

    program.addTwoNumbers(2,7)

    program.addTwoNumbers(2,7,object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })


    val test:String="Hello"
    val myLambda : (Int)->Unit ={s : Int-> println(s)}
    program.addTwoNumbers(2,7,{s : Int-> println(s)})
}

class Program{

    fun addTwoNumbers(a:Int, b:Int,action:(Int)->Unit){    // High level function with Lambda expression
        val sum=a+b
        action(sum)
    }

    fun addTwoNumbers(a:Int, b:Int,action:MyInterface){
        val sum=a+b
        println(sum)
    }

    fun addTwoNumbers(a:Int, b:Int){
        val sum=a+b
        println(sum)
    }
}

interface MyInterface{
    fun execute(sum:Int)
}