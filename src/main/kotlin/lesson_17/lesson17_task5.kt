package lesson_17


fun main() {
    val user = User5("login", "password")
    user.login = "login1"
    user.password = "password1"
    println(user)
}

class User5(
    initialLogin: String,
    initialPassword: String,
) {
    var login = initialLogin
        set(value) {
            field = value
            println("Login successfully changed")
        }

    var password = initialPassword
        set(value) {
            println("You cant change password")
        }
        get() {
            val stars = StringBuilder()
            for (i in field.indices) {
                stars.append("*")
            }
            return stars.toString()
        }

    override fun toString(): String {
        return "User5(login='$login', password='$password')"
    }

}