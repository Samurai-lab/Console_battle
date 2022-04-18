package com.example.consolebattle

    data class Info(private val firstTeam: Team, private val secondTeam: Team) {

        fun progress() {
            println("""
                First command have ${warriorsNumbers(firstTeam)} warriors and team health is ${wHealthTeam(firstTeam)} 
                Second command have ${warriorsNumbers(secondTeam)} warriors and team health is ${wHealthTeam(secondTeam)} 
            """.trimIndent())
        }

         private fun warriorsNumbers(team:Team): Int {
            var count = 0
            for (number in 0 until team.getTeamStack.getSize()) {
                when (team.getTeamStack.getElement(number).warriorIsKilled) {
                    true -> continue
                    false -> count += 1
                }
            }
            return count
        }

         fun wHealthTeam(team:Team): Int {
            var healthCount = 0
            for (number in 0 until team.getTeamStack.getSize()) {
                healthCount += team.getTeamStack.getElement(number).warriorHealth
            }
            return healthCount
        }
    }