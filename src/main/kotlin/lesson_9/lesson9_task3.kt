package lesson_9

fun main() {
    var recipe = arrayListOf(2, 50, 15)
    print("Enter amount of a portion: ")
    val amountOfPortion = readLine()?.toInt() ?: 0

    recipe = recipe.map { it * amountOfPortion } as ArrayList

    println("На $amountOfPortion порций вам понадобится: Яиц – ${recipe[0]}, молока – ${recipe[1]}, сливочного масла – ${recipe[2]}]")
}