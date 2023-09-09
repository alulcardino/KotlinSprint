package lesson_7

const val MIN = 1000
const val MAX = 9999

fun main() {
    var smsNumber: Int
    var userCode: Int

    while (true) {
        smsNumber = (MIN..MAX).random()
        println("""Ваш код авторизации: $smsNumber
            |Введите код: 
        """.trimMargin())
        userCode = readLine()?.toInt() ?: 0
        if (userCode == smsNumber) {
            break
        }
    }

    println("Добро пожаловать!")

}