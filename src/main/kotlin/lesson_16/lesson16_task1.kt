package lesson_16

fun main() {
    val dice = Dice()
    dice.getNumber()
}


class Dice() {
    private var number = generateNumber()

    private fun generateNumber() = (1..6).random()

    fun getNumber() {
        println(number)
    }
}
