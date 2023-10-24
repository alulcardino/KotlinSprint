package lesson_18

fun main() {
    val circle1 = Circle(1,2)
    val circle2 = Circle(1.1,2.2)
    val square1 = Square(1,2)
    val square2 = Square(1.1,2.2)
    val point1 = Point(1,2)
    val point2 = Point(1.1,2.2)

    circle1.draw()
    circle2.draw()
    square1.draw()
    square2.draw()
    point1.draw()
    point2.draw()
}

abstract class Object<T>(
    val x: T,
    val y: T,
) {
    abstract fun draw()
}

open class Point<T>(
    x: T,
    y: T,
) : Object<T>(x, y) {
    override fun draw() {
        println("Нарисовать точку в [$x, $y]")
    }
}

open class Circle<T>(
    x: T,
    y: T,
) : Object<T>(x, y) {
    override fun draw() {
        println("Нарисовать круг в [$x, $y]")
    }
}

open class Square<T>(
    x: T,
    y: T,
) : Object<T>(x, y) {
    override fun draw() {
        println("Нарисовать квадрат в [$x, $y]")
    }
}
