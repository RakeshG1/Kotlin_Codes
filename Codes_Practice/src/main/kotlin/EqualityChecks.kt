// https://play.kotlinlang.org/byExample/02_control_flow/04_Equality%20Checks
// Kotlin uses == for structural comparison and === for referential comparison.

fun main(){
    val fruitMarket1 = setOf<String>("Strawberry", "Mango")
    val fruitMarket2 = setOf("Strawberry", "Mango")
    val fruitMarket3 = setOf("Apple", "Mango")
    println(fruitMarket1 == fruitMarket2) // true : Both setOf objects values are same
    println(fruitMarket1 == fruitMarket3) // false : Both setOf objects values are different
    println(fruitMarket1 === fruitMarket2) // false : Both setOf objects reference are different
    println(fruitMarket1 === fruitMarket3) // false : Both setOf objects reference are different
    println(fruitMarket1 === fruitMarket1) // true : Both setOf objects reference are same
}