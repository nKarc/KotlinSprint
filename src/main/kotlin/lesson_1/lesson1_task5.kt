package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsInSpace = 6480
    val hours = secondsInSpace / (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)
    val secondsAfterHours = secondsInSpace % (SECONDS_IN_MINUTE * SECONDS_IN_MINUTE)
    val minutes = secondsAfterHours / SECONDS_IN_MINUTE
    val seconds = secondsAfterHours % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}