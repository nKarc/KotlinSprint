package org.example.lesson_1

fun main() {
    val secondsInSpace = 6480
    val hours = secondsInSpace / 3600
    val secondsAfterHours = secondsInSpace % 3600
    val minutes = secondsAfterHours / 60
    val seconds = secondsAfterHours % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}