package algoritm

/*
    Task 3. Удаление в строке
    https://www.codewars.com/kata/5727bb0fe81185ae62000ae3
*/

fun main() {
    val firstInput = "abc#d##c"
    val secondInput = "abc##d######"
    val thirdInput = "#######"

    println(checkBackspaces(firstInput))
    println(checkBackspaces(secondInput))
    println(checkBackspaces(thirdInput))
}

fun checkBackspaces(input: String): String {
    var result = input
    val regex = Regex(".*#.*")
    while (result.matches(regex)) {
        result = result.replaceFirst(".?#".toRegex(), "")
    }
    return result
}