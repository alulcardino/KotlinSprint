package lesson_7

fun main() {
    print("Enter number: ")
    val userNumber = readLine()?.toInt() ?: 0

    for (i in 1..userNumber) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}