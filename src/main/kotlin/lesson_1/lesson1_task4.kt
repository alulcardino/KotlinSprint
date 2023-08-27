package lesson_1

class lesson1_task4 {

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

        println("0$hours:$remainMinutes:0$remainSeconds")

    }
}