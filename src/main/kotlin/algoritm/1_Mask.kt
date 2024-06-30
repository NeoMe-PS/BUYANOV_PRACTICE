package algoritm

/*
    Task 1. Маска карты
    https://www.codewars.com/kata/5412509bd436bd33920011bc
*/

fun main() {
    val firstInput = "4556364607935616"
    val secondInput = "64607935616"
    val thirdInput = "Skippy"
    val fourthInput = "Nananananananananananananananana Batman!"

    println(maskify(firstInput))
    println(maskify(secondInput))
    println(maskify(thirdInput))
    println(maskify(fourthInput))
}

fun maskify(input: String): String {
    if (input.length <= 4) {
        return input
    }
    val regex = Regex(".")
    return input.subSequence(0, input.length - 4).replace(regex, "#") + input.takeLast(4)
}