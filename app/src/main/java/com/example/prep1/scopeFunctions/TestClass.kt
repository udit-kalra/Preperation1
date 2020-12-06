package com.example.prep1.scopeFunctions

import android.content.Intent
import android.net.Uri


fun main(){

}

fun performLetFunction(){


    // 1st example
    val person:String=Person().let {
         "The name of the person is : ${it.name}"
    }


    val person2=Person().let {
        it.name="Hello"
    }

    val person3=Person().let {personObj->
        personObj.name="Hello"
    }


    val person4=Person().let {personObj->
        personObj.name?.let {
            println("name is ${it}")
        }
    }

    //2nd example

    val numbers = mutableListOf("One","Two","Three","Four","Five")
    val resultsList = numbers.map { it.length }.filter { it > 3 }
    print(resultsList)

    val numbers2 = mutableListOf("One","Two","Three","Four","Five")
    numbers2.map { it.length }.filter { it > 3 }.let {
        print(it)
    }


}

fun performRunFun(){
    var value:String=Person().run {
        name = "Asdf"
        contactNumber = "0987654321"
        "The details of the Person is: ${displayInfo()}"
    }
}


fun performWithFun(){
    var value:String= with(Person()){
        name = "Asdf"
        contactNumber = "0987654321"
        "The details of the Person is: ${displayInfo()}"
    }
}


fun performApplyFun(){

    // 1st
    var value: Person = Person().apply{
        name = "Asdf"
        contactNumber = "0987654321"
        "The details of the Person is: ${displayInfo()}"
    }


    // 2nd
    fun returnIntent():Intent {
        val intent = Intent()
        intent.action = "intentAction"
        intent.data = Uri.parse("intentData")
        return intent
    }

    fun createIntent(intentData: String, intentAction: String) =
        Intent().apply {
            action = intentAction
            data = Uri.parse(intentData)
        }
}


fun performAlsoFun(){
    val name = Person().also { currentPerson ->
        print("Current name is: ${currentPerson.name}\n")
        currentPerson.name = "modifiedName"
    }.run {
        "Modified name is: $name\n"
    }
    print(name)
}