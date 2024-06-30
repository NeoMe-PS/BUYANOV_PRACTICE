package additionTasks.kyu8

/*
    Task 1. Parse nice int from char problem
    https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
*/

fun main() {
    val firstInput = "1 years old"
    val secondInput = "5 years old"
    println(getAge(firstInput))
    println(getAge(secondInput))
}

fun getAge(input: String): Int {
    return input.first().digitToInt()
}
