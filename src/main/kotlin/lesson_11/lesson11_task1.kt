package lesson_11

fun main() {
    val user1 = User(123, "abc", "abc", "abc")
    val user2 = User(431, "qwe", "qwe", "qwe")
    println(user1)
    println(user2)
}

private class User(private val id: Int, private val login: String, private val password: String, private val email: String) {

    override fun toString(): String {
        return "User(id=$id, login='$login', password='$password', email='$email')"
    }


}