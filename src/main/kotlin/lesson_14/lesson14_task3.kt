package lesson_14

fun main() {
    val comment = Comment("comment", "author1", Message("message", "author2"))
    comment.postMessage()
    println(comment)
}


open class Message(
    private val text : String,
    private val author : String,
) {
    override fun toString(): String {
        return "Message(text='$text', author='$author')"
    }

    fun postMessage() {
        println("$author $text")
    }
}

class Comment(
    private val text: String,
    private val author: String,
    private val message: Message,
) : Message(text, author) {

    override fun toString(): String {
        return "Comment(text='$text', author='$author', message=$message)"
    }
}