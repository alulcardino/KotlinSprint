package lesson_11

fun main() {
    val forum = Forum()
    forum.createNewUser(1, "name1", "123", "sae")
    forum.createNewUser(2, "name2", "123", "sae")
    forum.createNewUser(3, "name3", "123", "sae")
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


    fun createNewUser(
        id: Int, login: String, password: String, email: String
    ): User3 {
        val newUser = User3(id, login, password, email)
        listOfUsers.add(newUser)
        return User3(id, login, password, email)
    }

    fun createNewMessage(
        authorId: Int, message: String
    ) {
        val author =  listOfUsers.first { it.getId() == authorId }
        author.sendMessage(message)
        threadOfMessages.add("${author.getLogin()} : $message")
    }

    fun printThread() {
        for (message in threadOfMessages) {
            println(message)
        }
    }
}

private class Message(
    private val id: Int,
    private val message: String,
    private val date: String
) {

}

private class User3(
    private var id: Int,
    private val login: String,
    private var password: String,
    private val email: String
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

    fun getId() = id

    fun getLogin() = login



}