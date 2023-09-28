package lesson_14

fun main() {
    val sputnik1 = Sputnik(
        isLanding = false,
        hasWater = false,
        hasAtmosphere = true,
        isInhabited = true,
    )
    val sputnik2 = Sputnik(
        isLanding = true,
        hasWater = true,
        hasAtmosphere = true,
        isInhabited = true,
    )
    val planet = Planet(
        isLanding = false,
        hasWater = false,
        hasAtmosphere = false,
        isInhabited = false,
        sputniks = listOf(sputnik1, sputnik2)
    )
    println(planet)
}

abstract class SpaceObject(
    private val isInhabited: Boolean,
    private val hasWater: Boolean,
    private val hasAtmosphere: Boolean,
    private val isLanding: Boolean,
) {
    override fun toString(): String {
        return "SpaceObject(isInhabited=$isInhabited, hasWater=$hasWater, hasAtmosphere=$hasAtmosphere, isLanding=$isLanding)"
    }

}

class Planet(
    isInhabited: Boolean,
    hasWater: Boolean,
    hasAtmosphere: Boolean,
    isLanding: Boolean,
    private val sputniks: List<Sputnik>
) : SpaceObject(isInhabited, hasWater, hasAtmosphere, isLanding) {
}


class Sputnik(
    isInhabited: Boolean,
    hasWater: Boolean,
    hasAtmosphere: Boolean,
    isLanding: Boolean,
) : SpaceObject(isInhabited, hasWater, hasAtmosphere, isLanding) {

}
