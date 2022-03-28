package com.example.consolebattle

import kotlin.random.Random

fun main() {

    val firstTeam = Team(2)
    val secondTeam = Team(2)
    val battle = Battle(firstTeam, secondTeam)
    battle.getProgress()
    battle.fight()

}

//Task 5
object Weapons {

    fun createPistol(): AbstractWeapon {
        return AbstractWeapon(9, FireType.Queue(3), Ammo.PISTOL_CARTRIDGES, Stack(), true)
    }

    fun createRevolving(): AbstractWeapon {
        return AbstractWeapon(6, FireType.SingleShot, Ammo.REVOLVING_CARTRIDGES, Stack(), true)
    }

    fun createRifle(): AbstractWeapon {
        return AbstractWeapon(5, FireType.SingleShot, Ammo.RIFLE_CARTRIDGES, Stack(), true)
    }
}

fun Int.isEvent(): Boolean {
    return when {
        Random.nextInt(0, this) % (100 / this * 2) == 0 -> true
        else -> false
    }
}