package lesson_21

fun main() {
    val list = listOf(1,2,3,4,5,6,7)
    println(list.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() : Int {
    val filteredList = this.filter { x -> x% 2 == 0 }
    return filteredList.sum()
}