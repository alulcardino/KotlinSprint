package lesson_7

const val MILISECONDS_IN_SECOND = 1000L

fun main() {
    print("Введите кол-во секунд: ")
    val amountOfSeconds = readLine()?.toInt() ?: 0

    for (i in 1..amountOfSeconds) {
        Thread.sleep(i * MILISECONDS_IN_SECOND)
        println("Прошло: $i секунд")
    }

    println("Время вышло")
}