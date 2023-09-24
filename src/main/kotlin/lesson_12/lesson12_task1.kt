package lesson_12

fun main() {
    val weather1 = Weather()
    val weather2 = Weather()

    println(weather1)
    println(weather2)

    weather1.weatherNight = 20
    weather1.isRain = false
    weather2.weatherDay = 30
    weather2.pressure = 800

    println(weather1)
    println(weather2)

}

class Weather() {
    var weatherNight: Int = 1
    var weatherDay: Int = 2
    var isRain: Boolean = true
    var pressure: Int = 750

    override fun toString(): String {
        return "Weather(weatherNight=$weatherNight, weatherDay=$weatherDay," +
                " isRain=$isRain, pressure=$pressure)"
    }
}