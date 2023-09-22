package lesson_12

fun main() {
    val weather1 = Weather1(1, 2, false, 3)
    val weather2 = Weather1(4, 6, true, 10)
    val weather3 = Weather1(5, 7, false, 12)

    println(weather1)
    println(weather2)
    println(weather3)

}

class Weather2(
    private var weatherNight: Int,
    private var weatherDay: Int,
    private var isRain: Boolean,
    private var pressure: Int
) {


    override fun toString(): String {
        return "Weather(weatherNight=$weatherNight, weatherDay=$weatherDay," +
                " isRain=$isRain, pressure=$pressure)"
    }
}