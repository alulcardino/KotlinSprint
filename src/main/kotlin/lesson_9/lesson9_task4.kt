package lesson_9

fun main() {
    println("Enter 5 ingredients: ")
    val ingredientsFromConsole = readln()
    val ingredients = ingredientsFromConsole.split(",")
    ingredients.sorted()
    println(ingredients)
}