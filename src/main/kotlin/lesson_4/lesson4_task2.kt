package lesson_4

const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MAX = 100

fun main() {
    var weight = 20
    var volume = 80

    println(weight >= WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_MAX)

    weight = 50
    volume = 100

    println(weight >= WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_MAX)

}