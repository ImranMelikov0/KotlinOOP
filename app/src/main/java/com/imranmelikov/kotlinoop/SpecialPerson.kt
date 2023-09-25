package com.imranmelikov.kotlinoop

class SpecialPerson(name: String, age: Int, job: String) : Person(name, age, job) {
    fun special(){
        println("Special")
    }
}