package lesson_21

import java.io.File

fun main() {
    val file = File("dictionary.txt")
    file.writeToWord(Word("hello", "привет", 4))
}

fun File.writeToWord(word: Word) {
    this.writeText("")
    this.appendText(("${word.englishWord}|${word.russianWord}|${word.correctAnswersCount}\n").lowercase())
}

data class Word(
    val englishWord: String,
    val russianWord: String,
    var correctAnswersCount: Int,
) {
    override fun toString(): String {
        return "Word(englishWord='$englishWord', russianWord='$russianWord', correctAnswersCount=$correctAnswersCount)"
    }
}