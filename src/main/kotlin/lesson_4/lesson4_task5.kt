package lesson_4

fun main() {
    val firstValue = 3;
    val secondValue = 2;
    val trueAnswer = firstValue + secondValue


    println("5You need to solve to prove what you are human: $firstValue + $secondValue = ")

    val answer = readLine()?.toInt()

    if (answer == trueAnswer) {
        println("Welcome!")
    } else {
        println("Access Denied!")
    }
}