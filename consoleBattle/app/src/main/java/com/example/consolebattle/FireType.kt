package com.example.consolebattle

sealed class FireType (count: Int){

    object SingleShot: FireType(1)

    data class Queue(val typeOfQueue: Int): FireType(typeOfQueue)

}