package com.example.consolebattle

import kotlin.random.Random
import kotlin.random.nextInt

class Battle(private var firstTeam: Team, private var secondTeam: Team) {

    private val battleState = Info(firstTeam, secondTeam)

    fun getProgress() {
        if (teamsHealth()) {
            battleState.progress()
        } else {
            when {
                battleState.wHealthTeam(firstTeam) == 0 -> println("Second team wined")
                battleState.wHealthTeam(secondTeam) == 0 -> println("First team wined")
            }
        }
    }

    private fun teamsHealth(): Boolean =
        when (battleState.wHealthTeam(firstTeam) > 0 && battleState.wHealthTeam(secondTeam) > 0) {
            true -> true
            false -> false
        }

    fun fight() {
        while (teamsHealth()) {
            val firstTeamRandom = Random.nextInt(0 until firstTeam.getTeamStack.getSize())
            val secondTeamRandom = Random.nextInt(0 until secondTeam.getTeamStack.getSize())
            if (firstTeam.getTeamStack.getElement(firstTeamRandom).warriorHealth > 0
                && secondTeam.getTeamStack.getElement(secondTeamRandom).warriorHealth > 0
            ) {
                println("Warrior $firstTeamRandom from first team_______________________")
                firstTeam.getWarrior(firstTeamRandom)
                    .attack(secondTeam.getWarrior(secondTeamRandom))
                println("Warrior $secondTeamRandom from second team_______________________")
                secondTeam.getWarrior(secondTeamRandom)
                    .attack(firstTeam.getWarrior(firstTeamRandom))
            } else {
                println("Warrior can no longer be harmed. He's dead")
                continue
            }
            continue
        }
        getProgress()
    }
}