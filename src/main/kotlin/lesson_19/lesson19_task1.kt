package lesson_19

fun main() {
    val fishes = listOf(Fish.GUPPY, Fish.GOLDFISH, Fish.ANGELFISH, Fish.SIAMESE_FIGHTING_FISH)
    fishes.forEach{ setFish(it) }
}


enum class Fish(name: String) {
    GUPPY("Гуппи"),
    GOLDFISH("Золотая рыбка"),
    ANGELFISH("Скалярия"),
    SIAMESE_FIGHTING_FISH(("Петушок")),
}

fun setFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Гуппи")
        Fish.GOLDFISH -> println("Золотая рыбка ")
        Fish.ANGELFISH -> println("Скалярия")
        Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}
