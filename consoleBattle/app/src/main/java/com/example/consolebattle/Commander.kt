package com.example.consolebattle

class Commander(
    health: Int = 200,
    evasion: Int = 100,
    isKilled: Boolean = false,
    accuracy: Int = 100,
    weapon: AbstractWeapon,
    topicalHealth: Int = health
) : AbstractWarrior(health, evasion, isKilled, accuracy, weapon, topicalHealth) {

    override fun attack(warrior: AbstractWarrior) {
        super.attack(warrior)
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage)
    }
}