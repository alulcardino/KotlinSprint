package lesson_10

fun main() {
    var firstNumber: Int
    var secondNumber: Int
    do {
        firstNumber = generateNumbers()
        secondNumber = generateNumbers()
        if (firstNumber > secondNumber) {
            println("Robots win")
        } else if (firstNumber < secondNumber) {
            println("Humanity wins")
        } else {
            println("Both wins")
        }
    } while (tryAgain())
}

private fun generateNumbers(): Int = (1..6).random()

fun tryAgain(): Boolean {
    println("Хотите бросить кости еще раз Введите Да или Нет”")
    val answer = readln()
    return answer.equals("да", ignoreCase = true)
}