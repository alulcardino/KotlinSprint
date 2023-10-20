package lesson_17


fun main() {
    val package1 = Package(123)
    package1.location = "location1"
    package1.location = "location2"
    package1.location = "location3"
    println(package1.countOfMove)
    println(package1)
}

class Package(
    private val number: Int,
) {
    var countOfMove = 0
        get() = field

    var location = ""
        get() = field
        set(value) {
            countOfMove++
            field = value
        }

    override fun toString(): String {
        return "Package(number=$number, countOfMove=$countOfMove, location='$location')"
    }


}