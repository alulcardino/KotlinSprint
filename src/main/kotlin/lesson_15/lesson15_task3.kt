package lesson_15

fun main() {
    val user1 = SimpleUser("name1")
    val user2 = SimpleUser("name2")
    val user3 = SimpleUser("name3")
    val admin = Admin("name3")

    val listOfUsers = mutableListOf(user1, user2, user3, admin)

    println("Users: $listOfUsers")
    user1.writeMessage()
    user2.writeMessage()
    user3.readForum()
    admin.deleteUser(listOfUsers, user2)
    println("Users: $listOfUsers")


}

abstract class User(val name: String) {
    fun readForum() {
        println("$name read forum")
    }

    fun writeMessage() {
        println("$name write message")
    }

    override fun toString(): String {
        return "User(name='$name')"
    }


}

class SimpleUser(name: String) : User(name)

class Admin(name: String) : User(name) {

    fun deleteUser(list: MutableList<User>, user: User) {
        list.remove(user)
        println("$name deleted")
    }


}