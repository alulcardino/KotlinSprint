package lesson2_task1

import kotlin.math.pow

fun main() {
    val startDeposit = 70_000
    val percentOfDeposit = 16.7
    val amountOfYears = 20

    val finalDeposit =  startDeposit * (1 + (percentOfDeposit / 100)).pow(amountOfYears)

    println(String.format("%.3f", finalDeposit))

}