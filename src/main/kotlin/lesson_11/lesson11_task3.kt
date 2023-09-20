package lesson_11

fun main() {
    val statuses = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val room1 =
        Room(
            "cover1", "name1",
            listOf(User(statuses[0]), User(statuses[1]))
        )
    val room2 =
        Room(
            "cover2", "name2",
            listOf(User(statuses[0]), User(statuses[1]), User(statuses[2]), User(statuses[1]))
        )

    println(room1)
    println(room2)
}


private class Room(
    private val cover: String,
    private val name: String,
    private val listOfMembers: List<User>,
) {
    override fun toString(): String {
        return "Room(cover='$cover', name='$name', listOfMembers=$listOfMembers)"
    }
}

private class User(
    private val status: String,
    private val avatar: String,
    private val name: String
) {
    fun longTapToAvatar() {
        println(name)
    }

    override fun toString(): String {
        return "User(status='$status', avatar='$avatar', name='$name')"
    }


}