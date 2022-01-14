package com.example.consolebattle

import kotlin.random.Random

fun main() {

    val pistol: Ammo = Ammo.PISTOL_CARTRIDGES
   println(typeOfFire(FireType.SingleShot, 3))

}

fun Int.isEvent(): Boolean {
    return when {
        Random.nextInt(0, this) % (100 / this) == 0 -> true
        else -> false
    }
}

fun typeOfFire(fireType: FireType, count: Int): FireType =
    when (fireType) {
        FireType.SingleShot -> FireType.SingleShot
        is FireType.Queue -> FireType.Queue(count)
    }

