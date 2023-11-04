package lesson_21

fun main() {
    val player1 = Player1("name1", 4, 10)
    val player2 = Player1("name1", 10, 10)
    println(player1.isHealthy())
    println(player2.isHealthy())
}

fun Player1.isHealthy() = this.currentHealth == maxHealth

class Player1(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
) {
    override fun toString(): String {
        return "Player(name='$name', currentHealth=$currentHealth, maxHealth=$maxHealth)"
    }
}