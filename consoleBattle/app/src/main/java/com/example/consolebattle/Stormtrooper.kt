package com.example.consolebattle

class Stormtrooper(
    health: Int,
    evasion: Int,
    isKilled: Boolean,
    accuracy: Int,
    weapon: AbstractWeapon,
    topicalHealth: Int
) : AbstractWarrior(health, evasion, isKilled, accuracy, weapon, topicalHealth) {

    //Поменять балансироовку после изменеии рандомайзера
    override var evasion: Int = 22
    override var isKilled: Boolean = false

    override fun attack(warrior: AbstractWarrior) {
        super.attack(warrior)
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage)
    }
}