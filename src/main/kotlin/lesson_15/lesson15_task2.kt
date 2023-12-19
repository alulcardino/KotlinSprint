package lesson_15

fun main() {
    val temperature = Temperature(20)
    val precipitationAmount = PrecipitationAmount(200)
    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}

abstract class WeatherStationStats(
    val amount: Int
)

class Temperature(amount: Int) : WeatherStationStats(amount) {}


class PrecipitationAmount(amount: Int) : WeatherStationStats(amount) {}

class WeatherServer(
) {
    fun sendMessage(weather: WeatherStationStats) {
        if (weather is Temperature) {
            println("Temperature is ${weather.amount}")
        } else if (weather is PrecipitationAmount) {
            println("Precipitatio nAmount is ${weather.amount}")
        }
    }
}
