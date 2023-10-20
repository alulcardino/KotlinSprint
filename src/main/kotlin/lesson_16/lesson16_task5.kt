package lesson_16

fun main() {
    val player = Player("name", 5)
    println(player)
    player.getDamage(49)
    println(player)
    player.getHeal(5)
    println(player)
    player.getDamage(25)
    println(player)
}

class Player(
    private var name: String,
    private var power: Int,
) {
    private var health: Int = 50

    fun getHeal(heal: Int) {
        health += heal
    }

    fun getDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            death()
        }
    }

    private fun death() {
        power = 0
        health = 0
    }

    override fun toString(): String {
        return "Player(name='$name', power=$power, health=$health)"
    }
}