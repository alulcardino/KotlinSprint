package lesson_13

fun main() {
    val contact1 = Contact2("name1", 9323412412, "company1")
    val contact2 = Contact2("name2", 12312143123, null)
    val contact3 = Contact2(null, null, null)

    val list = mutableListOf(contact1, contact2, contact3)

    list.forEach {
        println(it)
    }

}

class Contact2(
    private val name: String?,
    private val phone: Long?,
    private val company: String?,
) {
    override fun toString(): String {
        return "Имя: ${name ?: "не указано"}\n" +
                "Номер: ${phone ?: "не указано"}\n" +
                "Компания: ${company ?: "не указано"}"
    }
}