package lesson_7

const val MIN = 1000
const val MAX = 9999

fun main() {
    var smsNumber: Int
    var userCode: Int
    var isPassed = false

    do {
        smsNumber = (MIN..MAX).random()
        println(
            """Ваш код авторизации: $smsNumber
            |Введите код: 
        """.trimMargin()
        )
        userCode = readLine()?.toInt() ?: 0
        if (userCode == smsNumber) {
            isPassed = true
        }
    } while (isPassed)

    println("Добро пожаловать!")

}