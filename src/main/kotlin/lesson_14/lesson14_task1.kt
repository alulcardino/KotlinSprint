package lesson_14

fun main() {
    val ship1 = Ship("name1", 10, 100, 20)
    val ship2 = Ship("name2", 20, 400, 600)

    println(ship1)
    println(ship2)
}

class Ship(
    private val name: String,
    private val speed: Int,
    private val weight: Int,
    private val boxes: Int,
) {
    override fun toString(): String {
        return "Ship(name='$name', speed=$speed, weight=$weight, boxes=$boxes)"
    }
}
