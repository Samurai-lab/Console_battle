package com.example.consolebattle

import com.example.consolebattle.Weapons.createPistol

class Stormtrooper(
    health: Int = 150,
    evasion: Int = 50,
    isKilled: Boolean = false,
    accuracy: Int = 50,
    weapon: AbstractWeapon = createPistol(),
    topicalHealth: Int = health
) : AbstractWarrior(health, evasion, isKilled, accuracy, weapon, topicalHealth) {

    override fun attack(warrior: AbstractWarrior) {
        super.attack(warrior)
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage)
    }
}