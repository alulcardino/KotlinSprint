package lesson_18

fun main() {
    val fox = Fox()
    val dog = Dog()
    val cat = Cat()
    fox.eat()
    dog.eat()
    cat.eat()
    fox.play()
    dog.play()
    cat.play()
    fox.sleep()
    dog.sleep()
    cat.sleep()
}

abstract class Animal(
    private val type: String
) {
    abstract fun eat()

    fun play() {
        println("$type играет")
    }

    fun sleep() {
        println("$type спит")
    }

}

class Fox(
) : Animal("Лиса") {
    override fun eat() {
        println("Лиса ест ягоды")
    }

}

class Dog(
) : Animal("Собака") {
    override fun eat() {
        println("Собака ест кости")
    }
}

class Cat(
) : Animal("Кошка") {
    override fun eat() {
        println("Кошка ест рыбу")
    }
}