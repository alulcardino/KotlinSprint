package lesson_18


fun main() {
    val order = Order2()
    order.printMessage("Name")
    order.printMessage(listOf("Name1", "Name2"))
}

class Order2(
) {
    fun printMessage(name: String) {
        println("Заказан товар: $name")
    }

    fun printMessage(names: List<String>) {
        val sb = StringBuilder()
        val separator = ", "
        names.forEach {sb.append(it).append(separator)}
        println("Заказаны следующие товары: ${sb.removeSuffix(separator)}")
    }

}