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
                topicalHealth -=  weapon.getMagazine().getLast()!!.getDamaged() * weapon.getMagazine().getSize()
            } else {
                println("You missed")
            }
        } else {
            println("You magazine is empty \nReloading magazine")
            weapon.reloadMagazine()
        }
    }

    override fun takeDamage(damage: Int) {
        topicalHealth -= damage
    }
}