package additionTasks.kyu6

/*
    Task 1. Highest Scoring Word
    https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
*/

fun main() {

    val firstInput = "man i need a taxi up to ubud"
    val secondInput = "what time are we climbing up the volcano"
    println(high(firstInput))
    println(high(secondInput))
}

fun high(str: String): String {
    return str.split(' ').maxBy { it.sumOf { it - 'a' + 1 } }
}