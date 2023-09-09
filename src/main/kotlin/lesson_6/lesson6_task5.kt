package lesson_6

const val MIN = 1
const val MAX = 9
const val MAX_ATTEMPTS = 1

fun main() {
    var firstNumber: Int
    var secondNumber: Int
    var answer: Int
    var rightAnswer: Int
    var attempt = 0;

    while (attempt < MAX_ATTEMPTS) {
        firstNumber = (MIN..MAX).random()
        secondNumber = (MIN..MAX).random()
        rightAnswer = secondNumber + firstNumber

        print("$firstNumber + $secondNumber = ")
        answer = readLine()?.toInt() ?: 0

        if (answer == rightAnswer) {
            println("Welcome!")
            break
        }

        attempt++
    }



}