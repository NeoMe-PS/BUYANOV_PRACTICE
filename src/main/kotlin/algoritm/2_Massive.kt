package algoritm

/*
    Task 2. Работа с массивом
    https://www.codewars.com/kata/5679aa472b8f57fb8c000047
*/

fun main() {

    val firstInput = arrayOf(1, 2, 3, 4, 3, 2, 1)
    val secondInput = arrayOf(1, 100, 50, -51, 1, 1)
    val thirdInput = arrayOf(20,10,-80,10,10,15,35)

    println(getIndexOfEqualSides(firstInput))
    println(getIndexOfEqualSides(secondInput))
    println(getIndexOfEqualSides(thirdInput))

}

fun getIndexOfEqualSides(input: Array<Int>): Int {
    if (input.size == 1) {
        return -1
    }
    val totalSum = input.sum()
    var leftSum = 0
    var rightSum: Int
    for ((index, value) in input.withIndex()) {
        rightSum = totalSum - value - leftSum
        if (leftSum == rightSum) {
            return index
        }
        leftSum += value
    }
    return -1
}