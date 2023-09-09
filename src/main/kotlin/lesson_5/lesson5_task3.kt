package lesson_5

fun main() {
    val firstNumber = 5
    val secondNumber = 78

    print("Enter first number: ")
    val userFirstNumber = readLine()?.toInt() ?: 0

    print("Enter second number: ")
    val userSecondNumber = readLine()?.toInt() ?: 0

    if (userFirstNumber == firstNumber && userSecondNumber == secondNumber ||
            userSecondNumber == firstNumber && userFirstNumber == secondNumber) {
        println("You win main prize")
    } else if (userFirstNumber == firstNumber || userSecondNumber == secondNumber
        || userSecondNumber == firstNumber || userFirstNumber == secondNumber) {
        println("You win second prize")
    } else {
        println("You lose")
    }
}