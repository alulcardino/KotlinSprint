package lesson_13

fun main() {
    val contacts = mutableListOf<Contact2>()
    do {
        println("Если хотите добавить новую запись, введите “да”")
        val answer = readln()
        if (answer.equals("да", ignoreCase = true)) {
            println("Введите Имя: ")
            var name: String? = readln()
            if (name == "") {
                name = null
            }
            println("Введите Номер: ")
            val phone = readln()
            println("Введите Компанию: ")
            var company: String? = readln()
            if (company == "") {
                company = null
            }
            if (phone != "") {
                contacts.add(Contact2(name, phone.toLong(), company))
            }
        }
    } while (answer.equals("да", ignoreCase = true))

    contacts.forEach {
        println(it)
    }
}

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