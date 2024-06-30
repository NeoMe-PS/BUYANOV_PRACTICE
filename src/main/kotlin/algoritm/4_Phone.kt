package algoritm

/*
    Task 4. Телефонный номер
    https://www.codewars.com/kata/525f50e3b73515a6db000b83
*/

fun main() {

    val firstInput = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)

    println(getPhone(firstInput))
}

fun getPhone(input: Array<Int>): String {
    var format = "(xxx) xxx-xxxx"
    val regex = Regex("x")
    for (element in input) {
        format = format.replaceFirst(regex, element.toString())
    }
    return format
}