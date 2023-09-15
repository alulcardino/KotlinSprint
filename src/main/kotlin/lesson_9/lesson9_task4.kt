package lesson_9

fun main() {
    println("Enter 5 ingredients: ")
    val ingredients = readln().split(",").toMutableList()
    ingredients.sort()
    println(ingredients)
}