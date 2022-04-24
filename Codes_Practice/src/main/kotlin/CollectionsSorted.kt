// https://play.kotlinlang.org/byExample/05_Collections/14_sorted

//sorted returns a list of collection elements sorted according to their natural sort order (ascending).
//sortedBy sorts elements according to natural sort order of the values returned by specified selector function.

fun main(){

    val numbers = listOf(20, 5, 25, 30)
    println("numbers : ${numbers}") // numbers : [20, 5, 25, 30]

    val numbersSorted = numbers.sorted()
    println("numbersSorted : ${numbersSorted}") // numbersSorted : [5, 20, 25, 30]

    val numbersSorted1 = numbers.sortedBy { -it }
    println("numbersSorted1 : ${numbersSorted1}") // numbersSorted1 : [30, 25, 20, 5]

    val numbersSorted2 = numbers.sortedDescending()
    println("numbersSorted2 : ${numbersSorted2}") // numbersSorted2 : [30, 25, 20, 5]

    // val numbersSorted3 = numbers.sortedByDescending { abs(it) }

}