package com.example.consolebattle

//Task 4
class AbstractWeapon(
    private val maxBullet: Int,
    private val fireType: FireType,
    private val typeOfAmmo: Ammo,
    private val cartridgeMagazine: Stack<Ammo>,
    private var magazineIsEmpty: Boolean
) {

    fun getBulletType(): Ammo {
        return typeOfAmmo
    }

    fun getMagazine(): Stack<Ammo> {
        return cartridgeMagazine
    }

    fun reloadMagazine() {
            for (i in 0 until maxBullet) {
                cartridgeMagazine.push(typeOfAmmo)
                magazineIsEmpty = false
            }
            println("Reloading... \nYour magazine is full")


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
                magazineIsEmpty = true
                return
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