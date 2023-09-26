package lesson_13

fun main() {
    val contact1 = Contact("name1", 9323412412, "company1")
    val contact2 = Contact("name2", 12312143123, null)

    println(contact1)
    println(contact2)
}

class Contact(
    private val name: String,
    private val phone: Long,
    private val company: String?,
) {
    override fun toString(): String {
        return "Имя: $name\nНомер: $phone\nКомпания: ${company ?: "не указано"}"
    }
}