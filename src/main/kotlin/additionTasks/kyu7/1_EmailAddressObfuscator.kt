package additionTasks.kyu7

/*
    Task 1. Email Address Obfuscator
    https://www.codewars.com/kata/562d8d4c434582007300004e
*/

fun main() {
    val someEmail = "user_name@example.com"
    println(obfuscate(someEmail))
}

fun obfuscate(email: String): String {
    return email.replace(".", " [dot] ").replace("@", " [at] ")
}