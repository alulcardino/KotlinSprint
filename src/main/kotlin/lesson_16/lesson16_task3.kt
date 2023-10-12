package lesson_16

fun main() {
    val user = User("login")
    println("Enter login: ")
    val password = "12345678"
    user.setPassword(password)
    if(user.validatePassword(password)) {
        println("Password is correct")
    } else {
        println("Password isn't correct")
    }

}

class User(
    private val login: String
) {
    private var password: String = ""

    fun setPassword(password: String) {
        this.password = password
    }

    fun validatePassword(password: String) = password == this.password

}

