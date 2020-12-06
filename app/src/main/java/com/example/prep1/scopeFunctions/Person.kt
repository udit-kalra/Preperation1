package com.example.prep1.scopeFunctions

class Person() {

//    var name: String = "Abcd"
    var name: String?=null
    var contactNumber: String = "1234567890"
    var address: String = "xyz"

    fun displayInfo()  = print("\n Name: $name\n " +
            "Contact Number: $contactNumber\n " +
            "Address: $address")
    
}