package com.example.consolebattle

//Task 6
interface Warrior {

    var isKilled: Boolean
    var evasion: Int

    fun attack(warrior: AbstractWarrior)
    fun takeDamage(damage: Int)
}