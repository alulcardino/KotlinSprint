package lesson_17


fun main() {
    val package1 = Package(123, "location1")
    package1.location = "location1"
    package1.location = "location2"
    package1.location = "location3"
    println(package1.countOfMove)
    println(package1)
}

class Package(
    private val number: Int,
    location: String,
) {
    var countOfMove = 0

    var location: String = location
        get() = field
        set(value) {
            countOfMove++
            field = value
        }

    override fun toString(): String {
        return "Package(number=$number, countOfMove=$countOfMove, location='$location')"
    }


}