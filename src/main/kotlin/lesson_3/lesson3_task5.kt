package lesson_3

fun main() {
    val move = "D2-D4;0"

    val splitedMove = move.split("-", ";")

    println(splitedMove[0])
    println(splitedMove[1])
    println(splitedMove[2])

}