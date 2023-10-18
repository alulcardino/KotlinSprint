package lesson_17


fun main() {
    val quiz = Quiz()
    println(quiz)
    quiz.answer = "answer1"
    quiz.question = "question1"
    println(quiz.answer)
    println(quiz.question)
    println(quiz)
}

class Quiz() {
     var question: String = ""
        get() = field
        set(value) {
            field = value
        }

     var answer: String = ""
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Quiz(question='$question', answer='$answer')"
    }

}