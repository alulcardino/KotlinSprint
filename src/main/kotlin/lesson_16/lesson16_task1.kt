package lesson_16

fun main() {
    val dice = Dice()
    dice.getNumber()
    dice.getNumber()
    dice.getNumber()

}


class Dice() {
    private var number: Int = 0

    private fun generateNumber() = (1..6).random()

    fun getNumber() {
        number = generateNumber()
        println(number)
    }
}
