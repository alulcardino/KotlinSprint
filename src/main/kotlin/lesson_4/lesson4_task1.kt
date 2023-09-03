package lesson_4

fun main() {
    val amountOfPlaces = 13
    val amountOfFreePlacesToday = 0
    val amountOfFreePlacesTomorrow = 4
    println ("Доступность столиков на сегодня: ${amountOfPlaces - amountOfFreePlacesToday != 13}")
    println ("Доступность столиков на завтра: ${amountOfPlaces - amountOfFreePlacesTomorrow != 13}")
}