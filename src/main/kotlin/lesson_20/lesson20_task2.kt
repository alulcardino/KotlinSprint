package lesson_20

fun main() {
    val potion: (heal: Int,player: Player) -> Unit
    potion = {
        heal, player ->
        player.currentHealth += heal
    }
    val player = Player("name", 5,10)
    println(player)
    potion(4, player)
    println(player)

}

class Player(
    private val name: String,
    var currentHealth: Int,
    private val maxHealth: Int,
) {
    override fun toString(): String {
        return "Player(name='$name', currentHealth=$currentHealth, maxHealth=$maxHealth)"
    }
}