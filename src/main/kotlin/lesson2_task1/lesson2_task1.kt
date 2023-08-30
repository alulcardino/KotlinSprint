package lesson2_task1

fun main() {
    val firstStudentMark = 3
    val secondStudentMark = 4
    val thirdStudentMark = 3
    val fourthStudentMark = 5

    val averageMark = (firstStudentMark + secondStudentMark + thirdStudentMark + fourthStudentMark)/4.0

    println(String.format("%.2f", averageMark))
}