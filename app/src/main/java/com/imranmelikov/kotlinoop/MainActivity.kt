package com.imranmelikov.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myuser=User("cenqu",43)
        myuser.age=23
        myuser.name="Cenqu"
        println(myuser.age)
        println(myuser.name)
        println(myuser.information())

        var person=Person("Cenqu",40,"Job")
        println(person.age)
        person.name="Ceksin"
        println(person.name)

        var person2=SpecialPerson("Bandroid",37,"Job")
        println(person2.name)
        println(person2.age)
        person2.special()


        var sum=Sum()
        println(sum.sum())
        println(sum.sum(2,4))
        println(sum.sum(4,6,8))

        var cars=Cars()
        println(cars.drive())
        var bmw=BMW()
        println(bmw.drive())
        println(bmw.test())

        var table=Table()
        table.head=true
        table.leg="Leg"
        println(table.head)
        println(table.leg)
        println(table.roomname)
       println(table.info())


        fun teststring(test : String){
            println(test)
        }
        teststring("Teststring")

        var lambda={test:String -> println(test)}
        lambda("LambdaString")
    }




}