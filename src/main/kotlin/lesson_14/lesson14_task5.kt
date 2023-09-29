package lesson_14

import kotlin.math.PI
import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.sqrt

const val RED = "RED"
const val BLACK = "BLACK"
const val GREEN = "GREEN"

fun main() {
    val circle1 = Circle(RED, 12.0, 4.0)
    val circle2 = Circle(BLACK, 17.0, 10.0)
    val rectangle1 = Rectangle(GREEN, 10.0, 4.0)
    val rectangle2 = Rectangle(BLACK, 12.0, 8.0)
    val triangle1 = Triangle(RED, 4.0, 5.0, 3.0)
    val triangle2 = Triangle(GREEN, 8.0, 10.0, 6.0)

    val listOfFigures =
        listOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)
            .filter { it.getColor() == RED }
    println("Perimeters = ${listOfFigures.sumOf { it.getPerimeter() }}")
    println("Square = ${listOfFigures.sumOf { it.getSquare() }}")
}

abstract class Figure(
    private val color: String,
) {
    abstract fun getPerimeter(): Double

    abstract fun getSquare(): Double

    fun getColor() = color

}

class Circle(
    color: String,
    private val length: Double,
    private val radius: Double,
) : Figure(color) {
    override fun getPerimeter() = length

    override fun getSquare() = floor((PI * radius.pow(2)) * 100) / 100
}

class Rectangle(
    color: String,
    private val length: Double,
    private val width: Double,
) : Figure(color) {
    override fun getPerimeter() = 2 * (length + width)

    override fun getSquare() = width * length
}

class Triangle(
    color: String,
    private val firstSide: Double,
    private val secondSide: Double,
    private val thirdSide: Double,
) : Figure(color) {
    private val halfPerimeter = getPerimeter() / 2

    override fun getPerimeter() = firstSide + secondSide + thirdSide

    override fun getSquare() =
        sqrt(
            halfPerimeter *
                    (halfPerimeter - firstSide) *
                    (halfPerimeter - secondSide) *
                    (halfPerimeter - thirdSide)
        )
}
