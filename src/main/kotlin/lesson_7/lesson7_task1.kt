package lesson_7

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val MIN_LETTER = 'a'
const val MAX_LETTER = 'z'

fun main() {
    val firstSymbol = (MIN_NUMBER..MAX_NUMBER).random()
    val secondSymbol = (MIN_LETTER..MAX_LETTER).random()
    val thirdSymbol = (MIN_NUMBER..MAX_NUMBER).random()
    val fourthSymbol = (MIN_LETTER..MAX_LETTER).random()
    val fifthSymbol = (MIN_NUMBER..MAX_NUMBER).random()
    val sixthSymbol = (MIN_LETTER..MAX_LETTER).random()

    println("$firstSymbol$secondSymbol$thirdSymbol$fourthSymbol$fifthSymbol$sixthSymbol")
}