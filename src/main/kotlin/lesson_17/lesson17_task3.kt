package lesson_17


fun main() {
    val package1 = Package()
    package1.number = 123
    package1.location = "location1"
    package1.location = "location2"
    package1.location = "location3"
    println(package1.countOfMove)
}

class Package() {
    var countOfMove = 0
        get() = field
    var number = 0
        get() = field
        set(value) {
            field = value
        }

    var location = ""
        get() = field
        set(value) {
            countOfMove++
            field = value
        }


}