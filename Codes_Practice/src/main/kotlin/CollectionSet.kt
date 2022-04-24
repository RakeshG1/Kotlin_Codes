// https://play.kotlinlang.org/byExample/05_Collections/02_Set

// A set is an unordered collection that does not support duplicates.
// For creating sets, there are functions setOf() and mutableSetOf().
// A read-only view of a mutable set can be obtained by casting it to Set.

val fruitSet: MutableSet<String> = mutableSetOf("Apple", "Mango")

fun addFruitToSet(fruitName: String): Boolean {
    return fruitSet.add(fruitName)
}

fun getStatus(isAdded: Boolean): String{
    return if (isAdded) "Added" else "Not Added - Duplicate"
}

fun main() {
    val fruitName1: String = "Grapes"
    val fruitName2: String = "Mango"

    println("Adding new fruit       : ${getStatus(addFruitToSet(fruitName1))}")
    println("Adding old fruit again : ${getStatus(addFruitToSet(fruitName2))}")
}
