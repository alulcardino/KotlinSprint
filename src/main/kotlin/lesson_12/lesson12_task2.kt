package lesson_12

fun main() {
    val weather1 = Weather1(1, 2, false, 3)
    val weather2 = Weather1(4, 6, true, 10)
    val weather3 = Weather1(5, 7, false, 12)

    println(weather1)
    println(weather2)
    println(weather3)

}

class Weather1 (
    _weatherNight: Int,
    _weatherDay: Int,
    _isRain: Boolean,
    _pressure: Int
) {
    private val weatherNight: Int = _weatherNight
    private val weatherDay: Int = _weatherDay
    private val isRain: Boolean = _isRain
    private val pressure: Int = _pressure

    override fun toString(): String {
        return "Weather(weatherNight=$weatherNight, weatherDay=$weatherDay," +
                " isRain=$isRain, pressure=$pressure)"
    }
}