package lesson_15

fun main() {
    val instrument = Instrument("name1", 3)
    val component = Instrument("name2", 3)
    instrument.find()
}

abstract class Product(
    val name: String,
    val amount: Int,
)

interface Findable {
    fun find()
}

class Component(name: String, amount: Int) : Product(name, amount)

class Instrument(name: String, amount: Int) : Product(name, amount), Findable {
    override fun find() {
        println("выполняется поиск")
    }
}