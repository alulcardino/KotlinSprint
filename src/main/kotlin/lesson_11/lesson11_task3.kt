package lesson_11

fun main() {
    val statuses = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val room1 =
        Room(
            "cover1", "name1",
            listOf(Avatar(statuses[0]), Avatar(statuses[1]))
        )
    val room2 =
        Room(
            "cover2", "name2",
            listOf(Avatar(statuses[0]), Avatar(statuses[1]), Avatar(statuses[2]), Avatar(statuses[1]))
        )
    println(room1)
    println(room2)
}


private class Room(
    private val cover: String,
    private val name: String,
    private val listOfMembers: List<Avatar>,
) {
    override fun toString(): String {
        return "Room(cover='$cover', name='$name', listOfMembers=$listOfMembers)"
    }
}

private class Avatar(
    private val status: String
) {
    override fun toString(): String {
        return "Avatar(status='$status')"
    }
}