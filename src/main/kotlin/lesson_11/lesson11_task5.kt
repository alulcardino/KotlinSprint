package lesson_11

fun main() {
    val forum = Forum()
    val user1 = User3(1, "name1", "123", "sae")
    val user2 = User3(1, "name2", "123", "sae")
    val user3 = User3(1, "name3", "123", "sae")
    forum.createNewUser(user1)
    forum.createNewUser(user2)
    forum.createNewUser(user3)
    forum.createNewMessage(1, "message1")
    forum.createNewMessage(1, "message2")
    forum.createNewMessage(2, "message3")
    forum.createNewMessage(2, "message4")
    forum.createNewMessage(3, "message5")
    forum.printThread()

}

private class Forum() {
    private var listOfUsers: MutableList<User3> = mutableListOf()
    private var threadOfMessages: MutableList<String> = mutableListOf()
    private var id: Int = 0

    fun createNewUser(
        user: User3
    ): User3 {
        id++
        val newUser = User3(id, user.login, user.password, user.email)
        listOfUsers.add(newUser)
        return newUser
    }

    fun createNewMessage(
        authorId: Int, message: String
    ) {
        val author =  listOfUsers.first { it.id == authorId }
        author.sendMessage(message)
        threadOfMessages.add("${author.login} : $message")
    }

    fun printThread() {
        for (message in threadOfMessages) {
            println(message)
        }
    }
}

private class User3(
     var id: Int,
     val login: String,
     var password: String,
     val email: String
) {
    private var bio: String = ""

    fun readBio() {
        println("Enter bio: ")
        bio = readln()
    }

    fun changePassword(currentPassword: String) {
        println("Enter old password: ")
        val userPassword = readln()
        if (userPassword == currentPassword) {
            println("Enter new password")
            password = readln()
            println("Password successfully changed")
        }
    }

    fun sendMessage(message: String) = println("$login, $message")

    override fun toString(): String {
        return "User(id=$id, login='$login', password='$password', email='$email')"
    }


}