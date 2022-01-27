package com.example.consolebattle

class AbstractWeapon (
    private val maxBullet: Int,
    private val fireType: FireType,
    private val cartridgeMagazine: Stack<Ammo>,
    private val magazineIsEmpty: Boolean
) {

    private lateinit var typeOfAmmo: Ammo
     fun typeOfBullet(type:Ammo): Ammo {
         typeOfAmmo = type
        return type
    }

    fun reloadMagazine() {
        if (::typeOfAmmo.isInitialized) {
                for(i in 0 until maxBullet) {
                    cartridgeMagazine.push(typeOfBullet(typeOfAmmo))
                }
                println("Your magazine is full")
        } else {
            println("You should choose type of bullets")
        }
    }

    fun checkMagazine ():Boolean {
        when (cartridgeMagazine.getSize() > 0) {
            true -> println("You have bullets on your magazine - ${cartridgeMagazine.getSize()}")
            else -> println("Your magazine is empty")
        }
        return magazineIsEmpty == cartridgeMagazine.getSize() <= 0
    }

    fun fire () {
        for (i in 0 until typeOfFire()) {
        if (cartridgeMagazine.isEmpty()) {
            checkMagazine()
            break
        } else {
               cartridgeMagazine.pop()
                println("Bump!")
            }
        }
    }

    private fun typeOfFire(): Int =
         when (fireType) {
            FireType.SingleShot -> 1
             //Should to use from FireType!!!!!!!!!!!!!
            is FireType.Queue -> 3
        }
}