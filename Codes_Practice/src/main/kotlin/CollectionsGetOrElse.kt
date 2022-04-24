// https://play.kotlinlang.org/byExample/05_Collections/17_getOrElse

// Get else value if not matched with predicate

fun main(){

    val numbers = listOf<Int>(10, 20, 30)
    println(numbers.getOrElse(40){"Number not matched"}) // Number not matched
    println(numbers.getOrElse(10){0}) // 0


    val numbersMap = mutableMapOf<String, Int?>()
    println(numbersMap.getOrElse("x") { "Number not matched" }) // Number not matched
    numbersMap["a"] = 10
    println(numbersMap.getOrElse("a") { 0 }) // 10
    numbersMap["a"] = null
    println(numbersMap.getOrElse("a") { 0 }) // 0

}