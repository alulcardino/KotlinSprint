package lesson_18

fun main() {
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()
    fox.eat()
    dog.eat()
    cat.eat()
}

open class Animal(
    private val name: String,
    private val food: String,
) {
    open fun eat() {
        println("$name ест $food")
    }
}

class Fox() : Animal("Лиса", "ягоды") {
    override fun eat() {
        super.eat()
    }
}

class Dog() : Animal("Собкак", "кости") {
    override fun eat() {
        super.eat()
    }
}

class Cat() : Animal("Кошка", "рыбу") {
    override fun eat() {
        super.eat()
    }
}