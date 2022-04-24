// https://play.kotlinlang.org/byExample/05_Collections/08_count

// Checks the list elements count and list elements matching counts

fun main(){
    val numList = listOf(34, 456, 254, 0)
    val noOfCounts = numList.count()
    println("noOfCounts : ${noOfCounts}") // noOfCounts : 4
    val matchCounts = numList.count{ it == 0}
    println("matchCounts : ${matchCounts}") // matchCounts : 1
}