package lesson_17


fun main() {
    val ship = Ship(10, "Port")
    ship.name = "Name"
    ship.name = "Name1"
    println(ship)
}

class Ship(
    private val speed: Int,
    private val port: String,
) {
    var name = ""
        get() = field
        set(value) {
            if (name == "") {
                field = value
            } else {
                println("You cant rename this")

            }
        }

    override fun toString(): String {
        return "Ship(name='$name', speed=$speed, port='$port')"
    }


}