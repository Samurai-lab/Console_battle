package com.example.consolebattle

//Task 7
abstract class AbstractWarrior(
    private val health: Int,
    override var evasion: Int,
    override var isKilled: Boolean,
    private val accuracy: Int,
    private val weapon: AbstractWeapon,
    private var topicalHealth: Int
) : Warrior {

    val warriorHealth get() = topicalHealth
    val warriorIsKilled get() = isKilled

    override fun attack(warrior: AbstractWarrior) {
        if (!weapon.checkMagazine()) {
            //Переделать рандомайз
            //Урон может быть больше здоровья
            if (accuracy.isEvent() || evasion.isEvent()) {
                warrior.takeDamage(weapon.fire())
            } else println("Warrior missed")
        } else {
            weapon.reloadMagazine()
        }
    }

    override fun takeDamage(damage: Int) = if (this.isKilled) {
        println("This warrior is dead")
    } else when (topicalHealth > damage) {
        true -> topicalHealth -= damage
        false -> {
            topicalHealth = 0
            isKilled = true
        }
    }
}