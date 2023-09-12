package lesson_6


const val ATTEMPTS = 5

fun main() {
    val min = 1
    val max = 9
    val rightNumber = (min..max).random()
    var userNumber: Int
    var countAttempt = 0
    var isWin = false
    do {
        print("Введите свое число ")
        userNumber = readLine()?.toInt() ?: 0
        if (userNumber != rightNumber) {
            println("Неверно, осталось ${ATTEMPTS - countAttempt - 1} попыток")
        } else {
            isWin = true
        }
        countAttempt++

    } while (userNumber != rightNumber && countAttempt != ATTEMPTS)

    if (isWin) {
        println("Это была великолепная игра")
    } else {
        println("Вы проиграли")
    }
    println("Было загадано число $rightNumber")


}