package lesson_4

fun main() {
    val day = 5;

    val isHandDay = day % 2 == 1
    val isPressDay = day % 2 == 1
    val isLegDay = day % 2 == 0
    val isBackDay = day % 2 == 0

    println(
        """
        Упражнения для рук:   $isHandDay
        Упражнения для ног:   $isLegDay    
        Упражнения для спины: $isPressDay
        Упражнения для пресса:$isBackDay    
    """.trimIndent()
    )

}