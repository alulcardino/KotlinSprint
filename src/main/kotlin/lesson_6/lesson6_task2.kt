package lesson_6

const val SECONDS_IN_MINUTE = 1000L

fun main() {

    print("Введите кол-во секунд: ")
    val amountOfSeconds = readLine()?.toInt() ?: 0

    Thread.sleep(SECONDS_IN_MINUTE * amountOfSeconds)

    println("Прошло $amountOfSeconds секунд")
}