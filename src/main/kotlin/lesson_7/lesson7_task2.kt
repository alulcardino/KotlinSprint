package lesson_7

const val MIN = 1000
const val MAX = 9999

fun main() {
    var smsNumber: Int
    var userCode: Int

    do {
        smsNumber = (MIN..MAX).random()
        println(
            """Ваш код авторизации: $smsNumber
            |Введите код: 
        """.trimMargin()
        )
        userCode = readLine()?.toInt() ?: 0
    } while (userCode != smsNumber)

    println("Добро пожаловать!")

}