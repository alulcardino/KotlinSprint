package lesson_18

import kotlin.math.pow

fun main() {
    val cube = Cube(3.0)
    val rectangle = Rectangle(3.0, 2.0, 3.0)
    println(cube.getSquare())
    println(rectangle.getSquare())
}

abstract class Package1() {
    abstract fun getSquare() : Double
}

class Cube(
    private val edge: Double,
) : Package1() {
    override fun getSquare() = edge.pow(3)
}

class Rectangle(
    private val length: Double,
    private val height: Double,
    private val width: Double,
) : Package1() {
    override fun getSquare() = length * width * height
}