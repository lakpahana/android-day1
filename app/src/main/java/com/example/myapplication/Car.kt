package com.example.myapplication

import android.util.Log

open class Car(var name : String, credit : Int) {
    //var totalCredits = 8
    open fun start(){
        Log.i("MyTag","Car Start")
    }
}

class MyCar : Car(), SpeedController{
    override fun start(){
        Log.i("Mytag", "My car is starting . Brand of the car is ${getBrandId()}")
    }

    override fun acceleration() {
        TODO("Not yet implemented")
    }

    override fun deceleration() {
        TODO("Not yet implemented")
    }
}



