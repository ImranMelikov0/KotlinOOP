package com.imranmelikov.kotlinoop

class BMW : Cars() {
    fun test(){
        drive()
    }
    override fun drive(){
        println("BMW")
    }
}