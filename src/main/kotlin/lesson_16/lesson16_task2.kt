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
    companion object {
        private const val PI: Double = 3.14
    }

    private fun getLength() = 2 * PI * radius

    private fun getSquare() = PI * radius.pow(2)
    override fun toString(): String {
        return "Circle(Length=${getLength()}, Square=${getSquare()})"
    }


}
