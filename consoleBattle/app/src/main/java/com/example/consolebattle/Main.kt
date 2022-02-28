package com.example.consolebattle

import kotlin.random.Random

fun main() {

//    val pistol: Ammo = Ammo.PISTOL_CARTRIDGES
//   println(typeOfFire(FireType.SingleShot, 3))


//    val weapon = AbstractWeapon(6, FireType.Queue(2), Stack(), true)

//    weapon.fire()
//    weapon.reloadMagazine()
//    weapon.typeOfBullet(Ammo.REVOLVING_CARTRIDGES)
//    weapon.reloadMagazine()
//    weapon.checkMagazine()
//    weapon.fire()
//    weapon.checkMagazine()
//    weapon.fire()
//    weapon.checkMagazine()
//    weapon.reloadMagazine()



//    val pistol: AbstractWeapon = Weapons.createRevolving()
//    pistol.fire()
//    pistol.reloadMagazine()
//    pistol.typeOfBullet(Ammo.REVOLVING_CARTRIDGES)
//    pistol.reloadMagazine()
//    pistol.checkMagazine()
//    pistol.fire()
//    pistol.checkMagazine()
//    pistol.fire()
//    pistol.checkMagazine()
//    pistol.reloadMagazine()
}

//Task 5
object Weapons {

    fun createPistol(): AbstractWeapon {
        return AbstractWeapon(9, FireType.Queue(3), Stack(), true)
    }

    fun createRevolving(): AbstractWeapon {
        return AbstractWeapon(6, FireType.SingleShot, Stack(), true)
    }

    fun createRifle(): AbstractWeapon {
        return AbstractWeapon(5, FireType.SingleShot, Stack(), true)
    }
}

fun Int.isEvent(): Boolean {
    return when {
        Random.nextInt(0, this) % (100 / this * 2) == 0 -> true
        else -> false
    }
}