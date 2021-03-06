package com.example.consolebattle

import com.example.consolebattle.Weapons.createRifle

class Sniper(
    health: Int = 100,
    evasion: Int = 22,
    isKilled: Boolean = false,
    accuracy: Int = 22,
    weapon: AbstractWeapon = createRifle(),
    topicalHealth: Int = health
) : AbstractWarrior(health, evasion, isKilled, accuracy, weapon, topicalHealth) {

    override fun attack(warrior: AbstractWarrior) {
        super.attack(warrior)
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage)
    }
}