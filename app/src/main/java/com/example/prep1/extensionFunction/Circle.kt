package com.example.prep1.extensionFunction

class Circle(val radius: Double) {

    var a=4
    fun area(): Double{
        return Math.PI * radius * radius;
    }

    fun doSomething(){
        // create object for class Circle
        val newCircle = Circle(2.5)
        // invoke member function
        println("Area of the circle is ${newCircle.area()}")
        //invoke extension function
        println("Perimeter of the circle is ${newCircle.perimeter()}")


    }


}

fun main(){

    var abc=5
    abc.abs()
    // create object for class Circle
    val newCircle = Circle(2.5)
    // invoke member function
    println("Area of the circle is ${newCircle.area()}")
    //invoke extension function
    println("Perimeter of the circle is ${newCircle.perimeter()}")

}

// Extension function for Int
fun Int.abs(){
    if (this<0){
        println("negative")
    }else{
        println("positive")
    }
}

// Extension function created for a class Circle
fun Circle.perimeter(): Double{
    return 2*Math.PI*radius
}

