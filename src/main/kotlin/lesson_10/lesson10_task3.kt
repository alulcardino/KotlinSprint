package lesson_10

import kotlin.random.Random

fun main() {
    print("Enter length: ")
    val length = readln().toInt()
    val password = generatePassword(length)
    println(password)
}

fun generatePassword(length: Int): String {
    val numbers  = ('1'..'9')
    val symbols = "!" + "\"" + "#" +
            "\\" + "$" + "%" + "&" + "\'" + "(" + ")" +
            "*" + "+" + "," + "-" + "." + "/" + " "
    val password = StringBuilder("")
    for (i in 1..length) {
        if (i % 2 == 0) {
            password.append(numbers.random())
        } else {
            password.append(symbols[Random.nextInt(symbols.length)])

        }
    }
    return password.toString()
}