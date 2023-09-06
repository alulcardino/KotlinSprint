package lesson_4

const val IS_DAMAGED = false
const val AMOUNT_OF_CREW_MIN = 55
const val AMOUNT_OF_CREW_MAX = 70
const val AMOUNT_OF_BOXES_MIN = 50
const val IS_GOOD_WEATHER = true

fun main() {


    println("Is damaged?:")
    var isDamaged: Boolean = readLine().toBoolean()
    println("Amount of Crew:")
    var amountOfCrew: Int = readLine()?.toInt() ?: 0
    println("Amount of Boxes:")
    var amountOfBoxes: Int = readLine()?.toInt() ?: 0
    println("Is good weather?:")
    var isGoodWeather: Boolean = readLine().toBoolean()

    println("Can ship go?: ${(isDamaged == IS_DAMAGED 
            && amountOfCrew >= AMOUNT_OF_CREW_MIN
            && amountOfCrew <= AMOUNT_OF_CREW_MAX) 
            || (amountOfCrew == AMOUNT_OF_CREW_MAX
            &&  isGoodWeather == IS_GOOD_WEATHER)
            &&  amountOfBoxes > AMOUNT_OF_BOXES_MIN}")

}