package com.example.consolebattle

import com.example.consolebattle.exceptions.NoAmmoException

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

    //try - catch
    override fun attack(warrior: AbstractWarrior) {
            if (accuracy.isEvent() || evasion.isEvent()) {
                try {
                    warrior.takeDamage(weapon.fire())
                } catch (n: NoAmmoException) {
                    weapon.reloadMagazine()
                }
            } else println("Warrior missed")
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