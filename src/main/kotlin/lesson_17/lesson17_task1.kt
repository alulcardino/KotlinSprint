package lesson_17


fun main() {
    val quiz = Quiz("question", "answer")
    println(quiz)
    quiz.setAnswer("answer1")
    quiz.setQuestion("question1")
    println(quiz.getAnswer())
    println(quiz)
}

class Quiz(
    private var question: String,
    private var answer: String,
) {
    fun setQuestion(question: String) {
        this.question = question
    }

    fun setAnswer(answer: String) {
        this.answer = answer
    }

    fun getAnswer() = answer

    override fun toString(): String {
        return "Quiz(question='$question', answer='$answer')"
    }

}