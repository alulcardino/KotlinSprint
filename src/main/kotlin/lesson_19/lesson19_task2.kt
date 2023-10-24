package lesson_19

fun main() {
    val product = Product("product", "id", Category.OTHER)
    println(product)
}

enum class Category() {
    CLOTHES,
    OFFICE,
    OTHER,
}

fun setCategory(category: Category) : String{
    return when(category) {
        Category.CLOTHES -> "Одежда"
        Category.OFFICE -> "Канцелярия"
        Category.OTHER -> "Другое"
    }
}

class Product(
    private val name: String,
    private val id: String,
    private val category: Category,
) {

    override fun toString(): String {
        return "Product(name='$name', id='$id', category=${setCategory(category)})"
    }
}
