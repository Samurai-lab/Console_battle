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

    override fun attack(warrior: AbstractWarrior) {
        if (weapon.checkMagazine()) {

            //Переделать рандомайз
            if (accuracy.isEvent() && evasion.isEvent()) {
                //Урон может быть больше здоровья
                topicalHealth -=  weapon.getBulletType().getDamaged()
            } else {
                println("You missed")
            }
        } else {
            println("You magazine is empty \nReloading magazine")
            weapon.reloadMagazine()
        }
    }

    override fun takeDamage(damage: Int) = if(this.isKilled) {
        println("This warrior is dead")
    } else {
        when (topicalHealth > damage) {
            true -> topicalHealth -= damage
            false -> {
                topicalHealth = 0
                isKilled = true
            }
        }

    }
}