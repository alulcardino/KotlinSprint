package lesson_20

fun main() {
    val elements = listOf(
        "element1",
        "element2",
        "element3",
        "element4",
        "element5"
    )

    val tap: (String) -> Unit = {
        println("Нажат элемент $it")
    }
    elements.map {
        if (elements.indexOf(it) % 2 == 1) {
            tap(it)
        }
    }


}