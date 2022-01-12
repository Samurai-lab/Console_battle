package com.example.consolebattle

import kotlin.random.Random

fun main() {
    println(
        """
    ${Ammo.pistolCartridges.getDamaged()}
    ${Ammo.pistolCartridges.getDamaged()}
    ____________________________________
    ${Ammo.revolvingСartridges.getDamaged()}
    ${Ammo.revolvingСartridges.getDamaged()}
    ____________________________________
    ${Ammo.rifleCartridges.getDamaged()}
    ${Ammo.rifleCartridges.getDamaged()}
    """.trimIndent()
    )


}

//fun Int.isEven(): Boolean {
//    return when {
//        Random.nextInt(0, this) % 2 == 0 -> true
//        else -> false
//    }
//}
fun Int.isEvent(): Boolean {
    return when {
        Random.nextInt(0, this) % (100 / this) == 0 -> true
        else -> false
    }
}