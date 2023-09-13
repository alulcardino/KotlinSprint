package lesson_9

fun main() {
    val recipe = arrayListOf("Egg", "Sugar", "Bread")
    println(
        "В рецепте есть базовые ингредиенты: $recipe." +
                "\nЖелаете добавить еще?"
    )
    val answer = readLine().toString()
    if (answer == "да") {
        println("Какой ингредиент вы хотите добавить?")
        val ingredient = readLine().toString()
        recipe.add(ingredient)
        println("Теперь в рецепте есть следующие ингредиенты: $recipe")
    }
}