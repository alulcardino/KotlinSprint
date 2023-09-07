package lesson_6

fun main() {
    print("Create login: ")
    val registerLogin = readln()
    print("Create password: ")
    val registerPassword = readln()

    print("Enter login: ")
    var login: String = readln()
    print("Enter password: ")
    var password: String = readln()

    while (login != registerLogin || password != registerPassword) {
        println("Wrong password or login. Please, enter again")
        print("Enter login: ")
        login = readln()
        print("Enter password: ")
        password = readln()
    }
    println("You successfully entered")
}