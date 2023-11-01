package lesson_20

fun main() {
    val player1 = Player1(true)
    val openDoor : (Player1) -> Unit = {
        if (it.haveKay){
            println("Door is open")
        } else {
            println("Door is closed")
        }
    }

    openDoor(player1)
}


class Player1(
    val haveKay: Boolean
) {
    override fun toString(): String {
        return "Player1(haveKay=$haveKay)"
    }
}