package algoritm

/*
    Task 5. RegEx
    https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023
*/

fun main() {
    val firstInput = "54_tfhrt456"
    val secondInput = "54_tfhrt456 !!"
    val thirdInput = "54_DDDRErt456"
    println(validate(firstInput))
    println(validate(secondInput))
    println(validate(thirdInput))
}

fun validate(input: String): Boolean {
    val regex = Regex("[a-z0-9_]{3,17}")
    return regex.matches(input)
}