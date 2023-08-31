package lesson_1

import java.util.*


fun main() {
    val seconds = 6480
    val minutes = seconds / 60
    val remainSeconds = seconds % 60
    val hours = minutes / 60
    val remainMinutes = minutes % 60

    println(seconds)
    println(minutes)
    println(remainSeconds)
    println(hours)
    println(remainMinutes)

    println(String.format(Locale.ENGLISH,"%02d:%02d:%02d", hours, remainMinutes, remainSeconds))
}