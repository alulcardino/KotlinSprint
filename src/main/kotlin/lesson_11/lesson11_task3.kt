package lesson_11

fun main() {
    val statuses = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")
    val room1 =
        Room(
            "cover1", "name1",
            listOf(User2(statuses[0], "avatar", "name"), User2(statuses[1], "avatar", "name"))
        )

    println(room1)
}


private class Room(
    private val cover: String,
    private val name: String,
    private val listOfMembers: List<User2>,
) {
    override fun toString(): String {
        return "Room(cover='$cover', name='$name', listOfMembers=$listOfMembers)"
    }
}

private class User2(
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
