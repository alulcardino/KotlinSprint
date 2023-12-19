package lesson_21

fun main() {
    val player3 = Player3(
        "name",
        mapOf(
            Pair("skill1", 1),
            Pair("skill2", 2),
            Pair("skill3", 4),
            Pair("skill4", 4),
            Pair("skill5", 1),
        )
    )
    println(player3.skills.maxCategory())
}

fun Map<String, Int>.maxCategory() : String {
    val max = this.maxByOrNull {
        it.value
    }
    return max?.key ?: ""
}

class Player3(
    val name: String,
    val skills: Map<String, Int>
) {
    override fun toString(): String {
        return "Player3(name='$name', skills=$skills)"
    }
}