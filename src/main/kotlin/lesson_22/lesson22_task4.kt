package lesson_22

fun main() {
    val mainScreenViewModel = MainScreenViewModel()
    mainScreenViewModel.loadData(false, null)
    mainScreenViewModel.loadData(true, null)
    mainScreenViewModel.loadData(false, "data")
}

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    var mainScreenState = MainScreenState()

    fun loadData(isLoading: Boolean, data: String?) {
        mainScreenState = mainScreenState.copy(
            data = data,
            isLoading = isLoading
        )
    }
}