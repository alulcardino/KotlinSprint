package lesson_22

fun main() {
    val regularBook1 = RegularBook1("name", "author")
    val dataBook1 = DataBook1("name", "author")

    println(regularBook1)
    // В обычном классе нужно переопределять метод toString() и поэтому выводитя строковое предсавление объекта
    println(dataBook1)
    // В data классе не нужно переопределять метод toString()

}

class RegularBook1(
    val name: String,
    val author: String,
)

data class DataBook1(
    val name: String,
    val author: String,
)