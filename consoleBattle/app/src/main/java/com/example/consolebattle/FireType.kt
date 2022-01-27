package com.example.consolebattle

sealed class FireType (private val count: Int){

    object SingleShot: FireType(1)

    data class Queue(val typeOfQueue: Int): FireType(typeOfQueue)

}