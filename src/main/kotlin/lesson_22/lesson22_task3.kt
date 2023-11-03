package lesson_22

fun main() {
    val user = User7("name", "surname", 30)
    val name = user.name
    val surname = user.surname
    val age = user.age

    println("$name $surname $age")
}

data class User7(
    val name: String,
    val surname: String,
    val age: Int,
)