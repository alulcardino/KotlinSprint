package lesson_16

import kotlin.math.pow

fun main() {
    val circle1 = Circle(10.0)
    val circle2 = Circle(20.0)
    println(circle1)
    println(circle2)
}

class Circle(
    private val radius: Double,
) {
    private val pi: Double = 3.14

    fun getLength() = 2 * pi * radius

    fun getSquare() = pi * radius.pow(2)
    override fun toString(): String {
        return "Circle(Length=${getLength()}, Square=${getSquare()})"
    }


}
