// https://play.kotlinlang.org/byExample/05_Collections/04_map

// map extension function enables you to apply a transformation to all elements in a collection.

val numbersList1: List<Int> = listOf<Int>(10, 20, 30)

fun main(){

    var addition = numbersList1.map { x -> x + 1 }
    println("addition --> ${addition}") // addition --> [11, 21, 31]
    addition = numbersList1.map { it + 100 }
    println("addition --> ${addition}") // addition --> [110, 120, 130]

}
