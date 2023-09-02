package lesson_2

fun main() {
    val countOfWorkers = 50
    val salaryOfWorker = 30000
    val countOfSInterns = 30
    val salaryOfIntern = 20000

    val totalSalaryOfWorkers = countOfWorkers * salaryOfWorker
    val totalSalaryOfInterns = countOfSInterns * salaryOfIntern

    val totalSalaryOfAll = totalSalaryOfWorkers + totalSalaryOfInterns

    val averageSalaryOfWorker = totalSalaryOfAll / (countOfWorkers + countOfSInterns)

    println(totalSalaryOfWorkers)
    println(totalSalaryOfInterns)
    println(totalSalaryOfAll)

    println(averageSalaryOfWorker)
}