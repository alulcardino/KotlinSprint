package lesson_11

fun main() {
    val contact1 = Contact(
        "name", "lastname",
        "icloud", "+723123123",
        "+23112323",
        listOf(Friend("name1", "username1"), Friend("name1", "username1"))
    )
    println(contact1)
}

private class Contact(
    private val firstName: String,
    private val secondName: String,
    private val icloud: String,
    private val homeNumber: String,
    private val mobileNumber: String,
    private val friends: List<Friend>
) {
    fun call() {
        println("Call to $firstName $secondName")
    }

    fun write() {
        println("Write to $firstName $secondName")
    }

    fun videoCall() {
        println("VideoCall to $firstName $secondName")
    }

    fun mail() {
        println("Mail to $firstName $secondName")
    }

    fun facetimeCall() {
        println("Facetime call to $firstName $secondName")
    }

    fun facetimeVideo() {
        println("Facetime video to $firstName $secondName")
    }

    override fun toString(): String {
        return "Contact(firstName='$firstName', " +
                "secondName='$secondName', icloud='$icloud', " +
                "homeNumber='$homeNumber', mobileNumber='$mobileNumber'," +
                " friends=$friends)"
    }


}

private class Friend(
    private val name: String,
    private val tag: String,
) {
    override fun toString(): String {
        return "Friend(name='$name', tag='$tag')"
    }
}