package lesson_11

fun main() {
    val user = User1(123, "alulcardin", "qwerty", "@gmail.com")
    user.changePassword("qwerty")
    user.sendMessage("Hello")
    println(user)
}

private class User1(
    private val id: Int,
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

    fun sendMessage(message: String) = println("$login,\n$message")

    override fun toString(): String {
        return "User(id=$id, login='$login', password='$password', email='$email')"
    }
}