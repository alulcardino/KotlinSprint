package lesson_6

fun main() {
    var counter = 0;

    print("Введите кол-во секунд: ")
    val amountOfSeconds = readLine()?.toInt() ?: 0

    while (counter < amountOfSeconds) {
        println("Осталось секунд: ${amountOfSeconds - counter}")
        Thread.sleep(1000)
        counter++
    }

    println("Время вышло")

}