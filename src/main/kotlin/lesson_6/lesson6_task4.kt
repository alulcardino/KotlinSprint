package lesson_6

const val MIN = 1
const val MAX = 9
const val ATTEMPTS = 5

fun main() {

    val rightNumber = (MIN..MAX).random()
    var userNumber: Int
    var countAttempt = 0;
    var isWin = false;
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