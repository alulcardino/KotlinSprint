package lesson_19

fun main() {
    println("Имя дожно быть длинее 3 символов. Пол должен быть Мужской или Женский")

    val cardIndex = mutableListOf<Human>()
    for (i in 0..2) {
        print("Введите имя: ")
        val name = readln()
        print("Введите пол: ")
        val gender = readln()
        if (validateGender(gender) && validateName(name)) {
            cardIndex.add(Human(name, Gender.valueOf(gender)))
        } else {
            println("Неверные данные")
        }
    }
    println(cardIndex)
}

private fun validateName(name: String) = name.length < 4

private fun validateGender(gender: String) = gender == "мужской"
        || gender == "женский"

enum class Gender(val gender: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

class Human(
    private var name: String = "",
    private var gender: Gender? = null
) {

    override fun toString(): String {
        return "Human(name='$name', gender=${gender?.gender})"
    }
}