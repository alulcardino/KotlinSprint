package lesson_14

fun main() {
    val icebreaker = Icebreaker("name1", 10, 100, 20, 30)
    val cargoShip = CargoShip("name2", 20, 400, 600, "EVERGREEN")

    println(icebreaker)
    icebreaker.breakIce()
    println(cargoShip)
}


class Icebreaker(
    name: String,
    speed: Int,
    weight: Int,
    boxes: Int,
    private val temp: Int,
) : Ship1(name, speed, weight, boxes) {

    fun breakIce() {
        println("breaking ice...")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    weight: Int,
    boxes: Int,
    private val company: String
): Ship1(name, speed, weight, boxes)


open class Ship1(
    private val name: String,
    private val speed: Int,
    private val weight: Int,
    private val boxes: Int,
) {
    override fun toString(): String {
        return "Ship(name='$name', speed=$speed, weight=$weight, boxes=$boxes)"
    }
}
