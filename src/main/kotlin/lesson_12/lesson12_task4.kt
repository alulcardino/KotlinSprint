package lesson_12

fun main() {
    val weather1 = Weather3(1, 2, false, 3)
    val weather2 = Weather3(4, 6, true, 10)
    val weather3 = Weather3(5, 7, false, 12)
}

class Weather3(
    private var weatherNight: Int,
    private var weatherDay: Int,
    private var isRain: Boolean,
    private var pressure: Int
) {

    init {
        println(
            "Weather(weatherNight=$weatherNight, weatherDay=$weatherDay," +
                    " isRain=$isRain, pressure=$pressure)"
        )


    }
}