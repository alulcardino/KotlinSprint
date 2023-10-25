package lesson_19

fun main() {
    val tank = Tank()
    tank.bullet = Bullet.BLUE
    tank.printDamage()
    tank.bullet = Bullet.GREEN
    tank.printDamage()
    tank.bullet = Bullet.RED
    tank.printDamage()
}

enum class Bullet(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank() {

    var bullet: Bullet? = null
    fun printDamage() {
        println(bullet?.damage)
    }
}