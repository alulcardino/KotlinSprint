package lesson_17


fun main() {
    val ship = Ship()
    ship.speed = 10
    ship.port = "Port"
    ship.name = "Name"
    println(ship)
}

class Ship(

) {
    var name = ""
        get() = field
        set(value) {
            println("Can not rename")
        }
    var speed = 0
        get() = field
        set(value) {
            field = value
        }
    var port = ""
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Ship(name='$name', speed=$speed, port='$port')"
    }


}