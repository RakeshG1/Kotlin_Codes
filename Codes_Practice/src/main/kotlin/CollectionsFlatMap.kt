// https://play.kotlinlang.org/byExample/05_Collections/12_flatMap

fun main(){
    val fruitsBag1 = listOf<String>("Apple", "Mango")
    val fruitsBag2 = listOf<String>("Grapes", "Banana")
    val fruitsBag3 = listOf(fruitsBag1, fruitsBag2)
    println("fruitsBag3 : ${fruitsBag3}") // fruitsBag3 : [[Apple, Mango], [Grapes, Banana]] : append two lists

    val fruitsMap = fruitsBag3.map{it}
    println("fruitsMap : ${fruitsMap}") // map of list elements : fruitsMap : [[Apple, Mango], [Grapes, Banana]]

    val fruitsFlatMap = fruitsBag3.flatMap { it }
    println("fruitsFlatMap : ${fruitsFlatMap}") // fruitsFlatMap : [Apple, Mango, Grapes, Banana]

}