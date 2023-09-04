package lesson_4

const val AMOUNT_OF_PLACES = 13

fun main() {
    val amountOfFreePlacesToday = 0
    val amountOfFreePlacesTomorrow = 4

    val  amountOfTakenPlacesToday = AMOUNT_OF_PLACES - amountOfFreePlacesToday
    val  amountOfTakenPlacesTomorrow = AMOUNT_OF_PLACES - amountOfFreePlacesTomorrow

    println ("Доступность столиков на сегодня: ${AMOUNT_OF_PLACES - amountOfTakenPlacesToday != 0}")
    println ("Доступность столиков на завтра: ${AMOUNT_OF_PLACES - amountOfTakenPlacesTomorrow != 0}")
}