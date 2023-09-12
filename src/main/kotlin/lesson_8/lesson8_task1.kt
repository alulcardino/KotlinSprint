package lesson_8

fun main() {
    val viewsInWeek = intArrayOf(2, 4, 4, 5, 4, 2, 1)
    var sumOfViewsInWeek = 0

    for (views in viewsInWeek) {
        sumOfViewsInWeek += views
    }

    println(sumOfViewsInWeek)
}