package lesson_8

import com.sun.xml.internal.fastinfoset.util.StringArray

fun main() {
    print("Enter amount of Ingredients: ")
    val amountOfIngredients =  readln().toInt() ?: 0
    val ingredients = Array(amountOfIngredients) { ""}

    for (i in ingredients.indices) {
        println("Enter ingredient: ")
        val ingredient = readln()
        ingredients[i] = ingredient
    }

}