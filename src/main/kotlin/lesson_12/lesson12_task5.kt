package lesson_12

fun main() {
    val pressureDiapason = (700..800)
    val weatherDiapason = (10..30)
    val list = mutableListOf<Weather4>()
    val listOfDayTemp = mutableListOf<Int>()
    val listOfNightTemp = mutableListOf<Int>()
    val listOfRainDay = mutableListOf<Boolean>()
    val listOfPressure = mutableListOf<Int>()

    for (i in 0..9) {
        val dayTemp = weatherDiapason.random()
        val nightTemp = weatherDiapason.random()
        val rainDay = i % 2 == 0
        val pressure = pressureDiapason.random()

        listOfDayTemp.add(dayTemp)
        listOfNightTemp.add(nightTemp)
        listOfRainDay.add(rainDay)
        listOfPressure.add(pressure)

        list.add(
            Weather4(
                dayTemp,
                nightTemp,
                rainDay,
                pressure,
            )
        )
    }

    println(
        """
        average temp day = ${listOfDayTemp.average()}
        average temp night = ${listOfNightTemp.average()}
        average pressure = ${listOfPressure.average()}
        rain days = ${listOfRainDay.filter { it }.size}
    """.trimIndent()
    )
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