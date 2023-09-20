package lesson_10

import kotlin.random.Random

fun main() {
    var login : String
    do {
        println("Enter login ")
        login = readln()
    } while (!validateLogin(login))
    val password = generatePassword()
    println("Your password: $password")

    println("If you want to log in, enter login and password")
    var newLogin : String
    var newPassword : String
    do {
        println("Enter login ")
        newLogin = readln()
        println("Enter password ")
        newPassword = readln()
    } while (login != newLogin || password != newPassword)

    var sms : Int
    var newSms : Int
    do {
        sms = sendSMS()
        println("Enter sms")
        newSms = readln().toInt()
    } while (sms != newSms)

    println("You successfully loged in")
}

private fun validateLogin(string: String): Boolean = string.length > 4

private fun generatePassword(): String {
    val numbers = ('1'..'9')
    val symbols = (' '.code..'/'.code).map { it.toChar() }

    val password = StringBuilder("")
    for (i in 1..4) {
        if (i % 2 == 0) {
            password.append(numbers.random())
        } else {
            password.append(symbols.random())

        }
    }
    return password.toString()
}

private fun sendSMS(): Int {
    val sms = (1000..9999).random()
    println("Your code : $sms")
    return sms
}