package lesson_8

import java.util.*

fun main() {
    print("Enter amount of Ingredients: ")
    val amountOfIngredients =  readln().toInt() ?: 0
    val ingredients = Array(amountOfIngredients) {
        println("Enter ingredient: ")
        readln()
    }
    println(ingredients.contentToString())
}