package lesson_10

fun main() {
    val firstNumber = generateNumber()
    val secondNumber = generateNumber()
    if (firstNumber > secondNumber) {
        println("Robots win")
    } else if (firstNumber < secondNumber) {
        println("Humanity wins")
    } else {
        println("Both wins")
    }
}

fun generateNumber(): Int = (1..6).random()