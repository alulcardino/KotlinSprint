package lesson_16

fun main() {
     val statuses = listOf("DELIVERED", "CANCELED", "IN PROGRESS")

    val order1 = Order(11111)
    val order2 = Order(12312512)
    val order3 = Order(123125413)

    order1.changeStatus(statuses[0])
    order2.changeStatus(statuses[1])
    order3.changeStatus(statuses[2])

    println(order1)
    println(order2)
    println(order3)

}

class Order(
    private val number: Long,
) {
    private var status: String = ""

    fun changeStatus(status: String) {
        this.status = status
    }

    override fun toString(): String {
        return "Order(number=$number, status='$status')"
    }


}

