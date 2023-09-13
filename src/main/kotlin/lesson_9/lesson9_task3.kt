package lesson_9

fun main() {
    val recipe = arrayListOf(2, 50, 15)
    print("Enter amount of a portion: ")
    val amountOfPortion = readLine()?.toInt() ?: 0

    for (i in recipe.indices) {
        recipe[i] *= amountOfPortion
    }

    println("На $amountOfPortion порций вам понадобится: Яиц – ${recipe[0]}, молока – ${recipe[1]}, сливочного масла – ${recipe[2]}]")
}