package lesson_8

fun main() {
    var recipe = arrayListOf("Egg", "Butter", "Apple", "Banana", "Milk", "Sugar")

    print("Enter ingredient: ")
    val userIngredient = readLine().toString()

    for (ingredient in recipe) {
        if (userIngredient == ingredient) {
            print("The recipe has $userIngredient")
            return
        }
    }

    println("The recipe does not have $userIngredient")
}