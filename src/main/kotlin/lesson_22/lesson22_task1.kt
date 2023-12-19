package lesson_22

fun main() {
    val regularBook1 = RegularBook("name", "author")
    val regularBook2 = RegularBook("name", "author")
    val dataBook1 = DataBook("name", "author")
    val dataBook2 = DataBook("name", "author")

    println(regularBook1 == regularBook2)
    println(dataBook1 == dataBook2)
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)