// https://www.bezkoder.com/kotlin-groupby-groupingby-example/
// https://www.oreilly.com/library/view/kotlin-quick-start/9781789344189/1ab213b3-b815-4c25-be44-c631333de28c.xhtml
// groupBy: returns a Map object
// groupingBy: returns a Grouping object

fun main(){
    val fruits = listOf("Apple", "Mango", "Grapes", "Grapefruit")
    println(fruits.groupBy { it.first() }) // {A=[Apple], M=[Mango], G=[Grapes, Grapefruit]}
    println(fruits.groupingBy { it.first() }.eachCount()) // {A=1, M=1, G=2}

    val numbers = listOf<Int>(10, 20, 30)
    println(numbers.groupBy { a -> a.toString() }) // {10=[10], 20=[20], 30=[30]}
    // This is similar to groupBy, but doesn’t create a List of values in the resulting Map. Instead, the value is always a single element
    println(numbers.associateBy { a -> a.toString() }) // {10=10, 20=20, 30=30}
}