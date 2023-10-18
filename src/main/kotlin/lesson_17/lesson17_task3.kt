package lesson_17


fun main() {
    val folder = Folder()
    folder.name = "name"
    folder.countOfFiles = 4
    folder.isHide = false
    println(folder)
    folder.isHide = true
    println(folder)


}

class Folder() {
    var name = ""
        get() = field
        set(value) {
            field = value
        }

    var countOfFiles = 0
        get() = field
        set(value) {
            field = value
        }

    var isHide = false
        get() = field
        set(value) {
            if (value) {
                name = "Folder is hidden"
                countOfFiles = 0
            }
            field = value
        }

    override fun toString(): String {
        return "Folder(name='$name', countOfFiles=$countOfFiles, isHide=$isHide)"
    }


}