package lesson_18

fun main() {
    val dice4 = DiceFour()
    val dice6 = DiceSix()
    val dice8 = DiceEight()
    dice4.printNumber()
    dice6.printNumber()
    dice8.printNumber()
}

abstract class Dice(
    private val number: Int
) {
    open fun printNumber() {
        println(number)
    }
}

class DiceFour(
) : Dice(number = 4) {
    override fun printNumber() {
        return super.printNumber()
    }
}

class DiceSix(
) : Dice(number = 6) {
    override fun printNumber() {
        return super.printNumber()
    }
}

class DiceEight(
) : Dice(number = 8) {
    override fun printNumber() {
        return super.printNumber()
    }
}
