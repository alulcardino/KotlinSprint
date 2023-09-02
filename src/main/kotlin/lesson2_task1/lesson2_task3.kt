package lesson2_task1

import java.util.*

fun main() {
    val hours = 9
    val minutes = 39
    val timeInWay = 457
    val hoursToMinutes = hours * 60
    val timeOfArrivingInMinutes = timeInWay + hoursToMinutes + minutes
    val hourOfArriving = timeOfArrivingInMinutes / 60
    val minutesOfArriving = timeOfArrivingInMinutes % 60


    println(String.format(Locale.getDefault(),"%02d:%02d", hourOfArriving, minutesOfArriving))

}