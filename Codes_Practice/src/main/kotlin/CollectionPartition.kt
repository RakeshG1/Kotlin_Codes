// https://play.kotlinlang.org/byExample/05_Collections/11_partition

val numbers = listOf<Int>(10, 20, 30, 40, 50, -10, -20)

fun main(){

    val less30 = numbers.partition { it < 30 }
    println("less30 : ${less30}") // less30 : ([10, 20, -10, -20], [30, 40, 50])
    val (lessValues, greatValues) = numbers.partition { it > 0 }
    println("lessValues : ${lessValues}") // lessValues : [10, 20, 30, 40, 50]
    println("greatValues : ${greatValues}") // greatValues : [-10, -20]

}