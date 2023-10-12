package lesson_15


fun main() {
    val truck = Truck(2, 1)
    val car1 = PassengerCar(3)
    val car2 = PassengerCar(2)
    truck.drive()
    truck.driveWithPassenger()
    truck.driveWithCargo()
    car1.drive()
    car1.driveWithPassenger()
    car2.drive()
    car2.driveWithPassenger()
}

interface Drivable {
    fun drive()
}

interface Passengerable {
    fun driveWithPassenger()

}

interface Cargoble {
    fun driveWithCargo()
}

abstract class Car(
    private val amountOfPassenger: Int,
) : Drivable, Passengerable {
    override fun drive() {
        println("driving....")
    }

    override fun driveWithPassenger() {
        println("drive with $amountOfPassenger passengers")
    }
}

class Truck(
    private val amountOfCargo: Int, amountOfPassenger: Int,
) : Car(amountOfPassenger), Cargoble {

    override fun driveWithCargo() {
        println("drive with $amountOfCargo cargos")
    }

}

class PassengerCar(
    amountOfPassenger: Int
) : Car(amountOfPassenger) {

}
