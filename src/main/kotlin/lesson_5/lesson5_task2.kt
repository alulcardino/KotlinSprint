package lesson_5

const val ADULT_AGE = 18

fun main() {
    val currentYear = 2023
    print("Enter your birth year: ")
    val birthYear = readLine()!!.toInt()
    val age = currentYear - birthYear
    if (age >= ADULT_AGE) {
        println("Show adult content")
    }
}