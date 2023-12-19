package lesson_22

import java.util.*

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Triple star system in the southern constellation of Centaurus",
        placeDistance = 42465
        )
    println(alphaCentauri)
}

data class GalacticGuide(
    val placeName: String = "",
    val placeDesc: String = "",
    val time: Date? = null,
    val placeDistance: Int = 0,
)

private fun dateFormatter() {

}



