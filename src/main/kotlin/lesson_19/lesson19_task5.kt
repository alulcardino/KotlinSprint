package lesson_19

fun main() {
    println("Имя дожно быть длинее 3 символов. Пол должен быть Мужской или Женский")
    val cardIndex = mutableListOf(
        Human("name1", Gender.MALE),
        Human("name2", Gender.FEMALE),
        Human("name3", Gender.MALE),
        Human("name4", Gender.MALE),
        Human("nam", Gender.MALE),
    )
    println(cardIndex)
}

enum class Gender(val gender: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

class Human() {
    private var name: String = ""
    private var gender: Gender? = null

    constructor(
        name: String,
        gender: Gender,
    ) : this() {
        if (name.length > 4) {
            this.name = name
        }
        this.gender = gender
    }

    override fun toString(): String {
        return "Human(name='$name', gender=${gender?.gender})"
    }
}