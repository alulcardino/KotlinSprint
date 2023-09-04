package lesson_4

fun main() {
    val day = 5;

    val isHandAndPressDay = day % 2 == 1
    val isLegAndBackDya = !isHandAndPressDay

    println(
        """
        Упражнения для рук:   $isHandAndPressDay
        Упражнения для ног:   $isLegAndBackDya    
        Упражнения для спины: $isHandAndPressDay
        Упражнения для пресса:$isLegAndBackDya    
    """.trimIndent()
    )

}