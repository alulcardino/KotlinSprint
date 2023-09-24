package lesson_12

fun main() {
    val pressureDiapason = (700..800)
    val weatherDiapason = (10..30)
    val list = mutableListOf<Weather4>()
    for (i in 0..9) {
        list.add(
            Weather4(
                weatherDiapason.random(),
                weatherDiapason.random(),
                i % 2 == 0,
                pressureDiapason.random()
            )
        )
    }
    var averageTempDay  = 0.0
    var averageTempNight = 0.0
    var averageTemp = 0.0
    var rainDay = 0
    var averagePressure = 0.0

    list.forEach {
        averageTempDay += it.weatherDay
        averageTempNight += it.weatherNight
        if (it.isRain) {
            rainDay++
        }
        averagePressure += it.pressure
    }

    averageTemp = (averageTempDay + averageTempNight) / 20
    averagePressure /= 10
    println("""
        average temp = $averageTemp
        average pressure = $averagePressure
        rain days = $rainDay
    """.trimIndent())
}

class Weather4(
     var weatherNight: Int,
     var weatherDay: Int,
     var isRain: Boolean,
     var pressure: Int
) {

    init {
        println(
            "Weather(weatherNight=$weatherNight, weatherDay=$weatherDay," +
                    " isRain=$isRain, pressure=$pressure)"
        )


    }
}