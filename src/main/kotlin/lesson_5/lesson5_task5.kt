package lesson_5

import kotlin.random.Random

const val MIN = 1;
const val MAX = 100;

fun main() {

    val firstNumber = (MIN..MAX).random();
    val secondNumber = (MIN..MAX).random();

    print("Enter first number: ")
    val userFirstNumber = readLine()!!.toInt()

    print("Enter second number: ")
    val userSecondNumber = readLine()!!.toInt()

    if (userFirstNumber == firstNumber && userSecondNumber == secondNumber) {
        println("You win main prize")
    } else if (userFirstNumber == firstNumber || userSecondNumber == secondNumber) {
        println("You win second prize")
    } else {
        println("You lose")
    }

    println("First number: $firstNumber")
    println("Second number: $secondNumber")

}