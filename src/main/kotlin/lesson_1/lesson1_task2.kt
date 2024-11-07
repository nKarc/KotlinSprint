package org.example.lesson_1

fun main() {
    val totalOrder = 75 // количество заказов

    val buyThankYouMessage = "Спасибо за покупку! Возвращайтесь к нам ещё!" /* текст для пользователя
                                                                            с благодарность за покупку*/
    println("$totalOrder\n$buyThankYouMessage")

    var numOfWorkers = 2000 // количество работников
    println(numOfWorkers)

    numOfWorkers = 1999 // уменьшение количества работников на 1 из-за увольнения
    println(numOfWorkers)
}