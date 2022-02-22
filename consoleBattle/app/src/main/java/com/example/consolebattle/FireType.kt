package com.example.consolebattle

//Task 3
sealed class FireType(val count: Int) {

    object SingleShot : FireType(1)

    data class Queue(val typeOfQueue: Int) : FireType(typeOfQueue)
}