package lesson_21

fun main() {
    val word = "aeiofawqczd"
    println(word.vowelCount())
}

fun String.vowelCount() : Int {
    val vowel = listOf('a', 'u', 'i', 'e', 'y', 'o')
    return this.count {
        it.lowercaseChar() in vowel
    }
}