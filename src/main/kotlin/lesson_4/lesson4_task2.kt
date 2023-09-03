package lesson_4

fun main() {
    val category = "Average"
    var weight = 20
    var volume = 80

    println(weight >= 35 && weight <= 100 && volume < 100)

    weight = 50
    volume = 100

    println(weight >= 35 && weight <= 100 && volume < 100)

}