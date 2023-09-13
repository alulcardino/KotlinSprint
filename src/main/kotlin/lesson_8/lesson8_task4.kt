package lesson_8

fun main() {
    val recipe = arrayListOf("Egg", "Butter", "Apple", "Banana", "Milk", "Sugar")

    print("Enter ingredient: ")
    val userIngredient = readLine().toString()

    if (recipe.contains(userIngredient)) {
        print("Enter new ingredient: ")
        val newIngredient = readLine().toString()
        recipe[recipe.indexOf(userIngredient)] = newIngredient
        println(recipe)
    } else {
        println("The recipe does not have $userIngredient")
    }
}