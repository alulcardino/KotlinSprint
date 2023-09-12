package lesson_7

import kotlin.random.Random

val CHARACTERS = ('1'..'9') + ('a'..'z') + ('A'..'Z')


fun main() {
    print("Enter length of password: ")
    val length = readLine()?.toInt() ?: 0
    val password = StringBuilder("")

    for (i in 1..length) {
        password.append(CHARACTERS[Random.nextInt(CHARACTERS.size)])
    }

    println("Your password is $password")
}