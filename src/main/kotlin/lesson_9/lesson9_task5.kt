package lesson_9

fun main() {
    var list : MutableList<String> = mutableListOf()
    for (i in 0..4) {
        println("Enter ingredient: ")
        val ingredient = readln()
        list.add(ingredient)
    }
    list = list.toSet().distinct().toMutableList()
    list.sort()
    list[0] = list[0].replaceFirstChar { it.uppercase() }
    list[4] = list[4].plus(".")
    list.map { print("$it ") }
}