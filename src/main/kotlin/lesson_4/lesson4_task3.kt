package lesson_4

const val IS_SUNNY = true
const val TENT_IS_OPEN = true
const val HUMIDITY = 20
const val SEASON = "not winter"

fun main() {
    val isSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "winter"

    println(
        isSunny == IS_SUNNY
                && tentIsOpen == TENT_IS_OPEN
                && humidity == HUMIDITY
                && season == SEASON
    )
}