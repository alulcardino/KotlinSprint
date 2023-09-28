package lesson_13

fun main() {
    val contacts = mutableListOf<Contact2>()
    do {
        println("Если хотите добавить новую запись, введите “да”")
        val answer = readln()
        if (answer.equals("да", ignoreCase = true)) {
            println("Введите Имя: ")
            val name: String = readln()
            isNull(name)
            println("Введите Номер: ")
            val phone = readln()
            println("Введите Компанию: ")
            val company: String = readln()
            isNull(company)
            if (phone != "") {
                contacts.add(Contact2(name, phone.toLong(), company))
            }
        }
    } while (answer.equals("да", ignoreCase = true))

    contacts.forEach {
        println(it)
    }
}

fun isNull(str : String) = str.ifEmpty { null }

class Contact2(
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