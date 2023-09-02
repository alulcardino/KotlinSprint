package lesson_2

fun main () {

    val crystalOre = 7
    val ironOre = 11
    val percentOfBuff = 20

    val buffCrystalOre = (crystalOre / 100.0) * percentOfBuff
    val buffIronOre  = (ironOre / 100.0) * percentOfBuff

    println(buffCrystalOre.toInt())
    println(buffIronOre.toInt())
}