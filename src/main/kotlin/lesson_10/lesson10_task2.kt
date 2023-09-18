package lesson_10

fun main() {
    println("Enter login")
    val login = readln()
    println("Enter password")
    val password = readln()
    if (validate(login) && validate(password)) {
        println("Логин и пароль подходят")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validate(string: String) = string.length > 3