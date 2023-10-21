package lesson_17


fun main() {
    val folder = Folder("name", 4)
    folder.name = "name"
    folder.countOfFiles = 4
    folder.isHide = false
    println(folder)
    folder.isHide = true
    println(folder)
    println(folder.countOfFiles)
    println(folder.name)
}

class Folder(
    initialName: String,
    initialCountOfFiles: Int,
) {
    var name = initialName
        get() {
            return if (isHide) {
                "Folder is hidden"
            } else {
                field
            }
        }

    var countOfFiles = initialCountOfFiles
        get()  {
            return if (isHide) {
                0
            } else {
                field
            }
        }

    var isHide = false

    override fun toString(): String {
        return "Folder(name='$name', countOfFiles=$countOfFiles, isHide=$isHide)"
    }


}