package com.imranmelikov.kotlinoop

class Table :HouseDecor,Color{
    var leg :String?=null
    var head :Boolean?=null
    override var roomname: String
        get() = "Kitchen"
        set(value) {}
}