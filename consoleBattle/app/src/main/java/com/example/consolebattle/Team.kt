package com.example.consolebattle

import kotlin.random.Random

 open class Team(private val teamSize: Int) {

    private val teamStack: Stack<AbstractWarrior> = Stack()
    val getTeamStack get() = teamStack

    init {
        createTeam()
    }

     fun getWarrior(wNum: Int): AbstractWarrior {
        return when (wNum <= teamStack.getSize()) {
            true -> teamStack.getElement(wNum)
            false -> teamStack.getElement(teamStack.getSize())
        }
    }

    private fun createTeam() {
        for (i in 0 until teamSize) {
            when (Random.nextInt(0, 100)) {
                in 0..60 -> teamStack.push(Stormtrooper())
                in 60..80 -> teamStack.push(Sniper())
                in 80..100 -> teamStack.push(Commander())
            }
        }
    }

    fun teamInfo() {
        for (i in 0 until teamStack.getSize())
            println(teamStack.getElement(i))
    }
}