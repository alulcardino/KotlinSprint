package lesson_17


fun main() {
    val folder = Folder()
    folder.name = "name"
    folder.countOfFiles = 4
    folder.isHide = false
    println(folder)
    folder.isHide = true
    println(folder)
    println(folder.countOfFiles)
    println(folder.name)
}

class Folder() {
    var name = ""
        get() {
            return if (isHide) {
                "Folder is hidden"
            } else {
                field
            }
        }

    var countOfFiles = 0
        get()  {
            return if (isHide) {
                0
            } else {
                field
            }
        }

    var isHide = false
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Folder(name='$name', countOfFiles=$countOfFiles, isHide=$isHide)"
    }


}