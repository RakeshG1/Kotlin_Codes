// https://play.kotlinlang.org/byExample/05_Collections/04_filter

// filter function enables you to filter collections.

val numbersList: List<Int> = listOf<Int>(10, 20, 30)

fun main(){

    var greaterThan20: List<Int> = numbersList.filter { x -> x >=20 }
    println("greaterThan20 --> ${greaterThan20}") // greaterThan20 --> [20, 30]
    greaterThan20 = numbersList.filter { it >=20 }
    println("greaterThan20 --> ${greaterThan20}") // greaterThan20 --> [20, 30]

}
