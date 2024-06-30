package additionTasks.kyu7

/*
    Task 2. Shortest Word
    https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
*/

fun main() {
    val stroke = "bitcoin take over the world maybe who knows perhaps"
    println(findShortest(stroke))
}

fun findShortest(s: String): Int = s.split(" ").minOf{it.length}