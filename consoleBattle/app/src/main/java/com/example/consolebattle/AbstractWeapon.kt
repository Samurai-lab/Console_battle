package com.example.consolebattle

//Task 4
class AbstractWeapon(
    private val maxBullet: Int,
    private val fireType: FireType,
    private val cartridgeMagazine: Stack<Ammo>,
    private val magazineIsEmpty: Boolean
) {

    private lateinit var typeOfAmmo: Ammo

     fun typeOfBullet(type: Ammo): Ammo {
        typeOfAmmo = type
        return type
    }

    fun getMagazine(): Stack<Ammo> {
        return cartridgeMagazine
    }

    fun reloadMagazine() {
        if (::typeOfAmmo.isInitialized) {
            for (i in 0 until maxBullet) {
                cartridgeMagazine.push(typeOfBullet(typeOfAmmo))
            }
            println("Reloading... \nYour magazine is full")

        } else {
            println("You should choose type of bullets")
        }
    }

    fun checkMagazine(): Boolean {
        when (cartridgeMagazine.getSize() > 0) {
            true -> println("You have bullets on your magazine - ${cartridgeMagazine.getSize()}")
            else -> println("Your magazine is empty")
        }
        return magazineIsEmpty == cartridgeMagazine.getSize() <= 0
    }

    fun fire() {
        for (i in 0 until typeOfFire(fireType).count) {
            if (cartridgeMagazine.isEmpty()) {
                checkMagazine()
                return
                break
            } else {
                cartridgeMagazine.pop()
                println("Bump!")
            }
        }
    }

    private fun typeOfFire(fireType: FireType): FireType =
        when (fireType) {
            FireType.SingleShot -> FireType.SingleShot
            is FireType.Queue -> fireType
        }


}