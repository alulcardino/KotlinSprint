package lesson_12

fun main() {
    val weather1 = Weather2(1, 2, false, 3)
    val weather2 = Weather2(4, 6, true, 10)
    val weather3 = Weather2(5, 7, false, 12)

    println(weather1)
    println(weather2)
    println(weather3)

}

class Weather2(
    private val weatherNight: Int,
    private val weatherDay: Int,
    private val isRain: Boolean,
    private val pressure: Int,
) {
    override fun toString(): String {
        return "Weather(weatherNight=$weatherNight, weatherDay=$weatherDay," +
                " isRain=$isRain, pressure=$pressure)"
    }
}