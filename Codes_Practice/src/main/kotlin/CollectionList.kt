// https://play.kotlinlang.org/byExample/05_Collections/01_List
// A list is an ordered collection of items. In Kotlin, lists can be either mutable (MutableList) or read-only (List).
// For list creation, use the standard library functions listOf() for read-only lists and mutableListOf() for mutable lists.

val mutList: MutableList<String> = mutableListOf("apple", "mango")
val readList: List<String> = mutList

fun addFruit(fruitName: String){
    mutList.add(fruitName)
}

@JvmName("getReadList1")
fun getReadList(): List<String>{
    return readList
}

fun main(){
    println("Fruits List Size : ${getReadList().size}") // Fruits List Size : 2
    println("Fruits List : ${getReadList()}") // Fruits List : [apple, mango]
    addFruit("Grapes")
    println("Fruits List Size : ${getReadList().size}") // Fruits List Size : 3
    println("Fruits List : ${getReadList()}") // Fruits List : [apple, mango, Grapes]
    getReadList().forEach{
        i -> println("Fruit Name : ${i}")
        // Fruit Name : apple
        // Fruit Name : mango
        // Fruit Name : Grapes
    }
}
