package com.example.consolebattle

enum class Ammo(val damage: Int, val criticalHitChance: Int, val criticalDamageCoefficient: Int) {

    pistolCartridges(damage = 20, criticalHitChance = 10, criticalDamageCoefficient = 2),
    revolvingСartridges(damage = 50, criticalHitChance = 50, criticalDamageCoefficient = 4),
    rifleCartridges(damage = 30, criticalHitChance = 25, criticalDamageCoefficient = 3);

    fun getDamaged(): Int {
        val returnedDamage: Int = when {
            criticalHitChance.isEvent() -> criticalDamageCoefficient * damage
            else -> damage
        }
        return returnedDamage
    }
}