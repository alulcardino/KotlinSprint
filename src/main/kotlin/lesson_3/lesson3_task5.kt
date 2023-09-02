package lesson_3

fun main() {
    val move = "D2-D4;0"

    val from = move.substring(0,2)
    val to = move.substring(3,5)
    val numberOfMove = move.substring(6,7)

    println(from)
    println(to)
    println(numberOfMove)
}