package lesson_9

fun main() {
    val recipe = arrayListOf<String>("Egg", "Sugar", "Bread")
    println("В рецепте есть следующие ингредиенты: ")
    for (ingredient in recipe) {
        println(ingredient)
    }
}