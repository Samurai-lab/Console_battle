package com.example.consolebattle

import com.example.consolebattle.exceptions.NoAmmoException

//Task 4
class AbstractWeapon(
    private val maxBullet: Int,
    private val fireType: FireType,
    private val typeOfAmmo: Ammo,
    private val cartridgeMagazine: Stack<Ammo>,
    private var magazineIsEmpty: Boolean
) {

    private fun getBulletType(): Ammo {
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
            println("Reloading... \nWarriors magazine is full")

    }

    fun checkMagazine(): Boolean {
        when (cartridgeMagazine.getSize() > 0) {
            true -> println("Warrior have bullets on his magazine - ${cartridgeMagazine.getSize()}")
            else -> println("Warrior magazine is empty")
        }
        return cartridgeMagazine.getSize() <= 0
    }

    //Exception
    fun fire(): Int {
        var damage = 0
        for (i in 0 until typeOfFire(fireType).count) {
            if (cartridgeMagazine.isEmpty() || cartridgeMagazine.getSize() < typeOfFire(fireType).count) {
                checkMagazine()
                magazineIsEmpty = true
                throw NoAmmoException()
            } else {
                cartridgeMagazine.pop()
                println("Bump!")
                damage += getBulletType().getDamaged()
                println("Warrior have bullets on your magazine - ${cartridgeMagazine.getSize()}")
            }
        }
        return damage
    }

    private fun typeOfFire(fireType: FireType): FireType =
        when (fireType) {
            FireType.SingleShot -> FireType.SingleShot
            is FireType.Queue -> fireType
        }


}