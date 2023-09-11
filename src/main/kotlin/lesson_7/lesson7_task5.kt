package lesson_7

import kotlin.random.Random

const val CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"


fun main() {
    print("Enter length of password: ")
    val length = readLine()?.toInt() ?: 0
    val password = StringBuilder("")

    for (i in 1..length) {
        password.append(CHARACTERS[Random.nextInt(CHARACTERS.length)])
    }

    println("Your password is $password")
}