package org.example.lesson_1

fun main() {
    val totalOrder: Byte = 75 // количество заказов

    val buyThankYouMessage: String = "Спасибо за покупку! Возвращайтесь к нам ещё!"
    println("$totalOrder\n$buyThankYouMessage")

    var numOfWorkers: Short = 2000 // количество работников
    println(numOfWorkers)

    numOfWorkers = 1999 // уменьшение количества работников на 1 из-за увольнения
    println(numOfWorkers)
}