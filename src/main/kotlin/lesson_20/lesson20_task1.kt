package lesson_20

fun main() {

    val greetings: (name: String) -> Unit

    greetings = {
        println("С наступающим Новым Годом, $it!")
    }

    greetings("name")

}