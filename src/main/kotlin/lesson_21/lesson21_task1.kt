package lesson_21

fun main() {
    val word = "aeiofawqczd"
    println(word.vowelCount(word))
}

fun String.vowelCount(word: String) : Int {
    val vowel = listOf('a', 'u', 'i', 'e', 'y', 'o')
    var countOfVowel = 0
    word.forEach {
        if(vowel.contains(it.lowercaseChar())) {
            countOfVowel++
        }
    }
    return countOfVowel
}