// https://play.kotlinlang.org/byExample/05_Collections/16_zip

fun main(){
    val fruits = listOf<String>("Apple", "Mango")
    val numbers = listOf<Int>(10, 20, 30)

    // map each element of 1st list to 2nd list : pairs
    val fruitsNumbersZipPairs = fruits zip numbers
    println("fruitsNumbersZipPairs : ${fruitsNumbersZipPairs}") // fruitsNumbersZipPairs : [(Apple, 10), (Mango, 20)]

    val fruitsNumbersZipReduce = fruits.zip(numbers) {fruit, number -> "$fruit$number"}
    println("fruitsNumbersZipReduce : ${fruitsNumbersZipReduce}") // fruitsNumbersZipReduce : [Apple10, Mango20]

}