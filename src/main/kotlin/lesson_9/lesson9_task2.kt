package lesson_9

fun main() {
    val recipe = arrayListOf("Egg", "Sugar", "Bread")
    println(
        "В рецепте есть базовые ингредиенты: $recipe." +
                "\nЖелаете добавить еще?"
    )
    val answer = readln()
    if (answer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val ingredient = readln()
        recipe.add(ingredient)
        println("Теперь в рецепте есть следующие ингредиенты: $recipe")
    }
}