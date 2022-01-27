package com.example.consolebattle

import kotlin.random.Random

fun main() {

//    val pistol: Ammo = Ammo.PISTOL_CARTRIDGES
//   println(typeOfFire(FireType.SingleShot, 3))


    val weapon = AbstractWeapon(6, FireType.Queue(3), Stack(), true)

    weapon.fire()
    weapon.reloadMagazine()
    weapon.typeOfBullet(Ammo.REVOLVING_CARTRIDGES)
    weapon.reloadMagazine()
    weapon.checkMagazine()
    weapon.fire()
    weapon.checkMagazine()
    weapon.fire()
    weapon.reloadMagazine()

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

