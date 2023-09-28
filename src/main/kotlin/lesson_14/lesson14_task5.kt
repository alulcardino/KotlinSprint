package lesson_14

import kotlin.math.pow
import kotlin.math.sqrt

const val PI = 3.14

fun main() {
    val circle1 = Circle("red", 12.0, 4.0)
    val circle2 = Circle("black", 17.0, 10.0)
    val rectangle1 = Rectangle("green", 10.0, 4.0)
    val rectangle2 = Rectangle("black", 12.0, 8.0)
    val triangle1 = Triangle("red", 4.0, 5.0, 3.0)
    val triangle2 = Triangle("green", 8.0, 10.0, 6.0)

    val listOfFigures = listOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)
    println("Perimeters = ${getRedPerimeters(listOfFigures)}")
    println("Square = ${getRedSquare(listOfFigures)}")
}

fun getRedPerimeters(listOfFigures : List<Figure>): Double {
    var sum = 0.0
    for (figure in listOfFigures) {
        if (figure.getColor() == "red") {
            sum+= figure.getPerimeter()
        }
    }
    return sum
}

fun getRedSquare(listOfFigures : List<Figure>): Double {
    var sum = 0.0
    for (figure in listOfFigures) {
        if (figure.getColor() == "red") {
            sum += figure.getSquare()
        }
    }
    return sum
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

    override fun getSquare() = PI * radius.pow(2)
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
