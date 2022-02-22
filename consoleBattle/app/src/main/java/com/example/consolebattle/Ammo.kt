package com.example.consolebattle

import java.util.*

//Task 2
enum class Ammo(val damage: Int, val criticalHitChance: Int, val criticalDamageCoefficient: Int) {

    PISTOL_CARTRIDGES(damage = 20, criticalHitChance = 10, criticalDamageCoefficient = 2),
    REVOLVING_CARTRIDGES(damage = 50, criticalHitChance = 50, criticalDamageCoefficient = 4),
    RIFLE_CARTRIDGES(damage = 30, criticalHitChance = 25, criticalDamageCoefficient = 3);

    fun getDamaged(): Int {
        val returnedDamage: Int = when {
            criticalHitChance.isEvent() -> criticalDamageCoefficient * damage
            else -> damage
        }
        return returnedDamage
    }

    fun randomBullet(): Ammo {
        val elements = listOf(PISTOL_CARTRIDGES, REVOLVING_CARTRIDGES, RIFLE_CARTRIDGES)
        return elements[(0..2).random()]
    }
}