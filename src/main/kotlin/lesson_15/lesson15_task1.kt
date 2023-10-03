package lesson_15

fun main() {
    val carp = Carp()
    val gull = Gull()
    val duck = Duck()

    carp.swim()
    gull.fly()
    duck.swim()
    duck.fly()
}

interface Flyable {
    fun fly()
}

interface Swimable {
    fun swim()
}

class Carp() : Swimable {
    override fun swim() {
        println("swim")
    }
}

class Gull() : Flyable {
    override fun fly() {
        println("fly")
    }
}

class Duck() : Swimable, Flyable {
    override fun fly() {
        println("fly")
    }

    override fun swim() {
        println("swim")
    }

}