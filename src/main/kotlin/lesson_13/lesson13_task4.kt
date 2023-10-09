package lesson_13

fun main() {
    val contacts = mutableListOf<Contact3>()
    do {
        println("Если хотите добавить новую запись, введите “да”")
        val answer = readln()
        if (answer.equals("да", ignoreCase = true)) {
            println("Введите Имя: ")
            val name = readln().ifEmpty { null }
            println("Введите Номер: ")
            val phone = readln()
            println("Введите Компанию: ")
            val company = readln().ifEmpty { null }
            if (phone != "") {
                contacts.add(Contact3(name, phone.toLong(), company))
            } else {
                println("Пустой номер!")
            }
        }
    } while (answer.equals("да", ignoreCase = true))

    contacts.forEach {
        println(it)
    }
}


class Contact3(
    private val name: String?,
    private val phone: Long?,
    private val company: String?,
) {
    override fun toString(): String {
        return "Имя: ${name ?: "не указано"} " +
                "Номер: ${phone ?: "не указано"} " +
                "Компания: ${company ?: "не указано"}"
    }
}