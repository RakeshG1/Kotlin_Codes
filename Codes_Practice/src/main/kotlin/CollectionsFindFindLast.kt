fun main(){
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

    val first = words.find { it.startsWith("some") }
    println(first)
    val last = words.findLast { it.startsWith("some") }
    println(last)
    val some = words.find { it.contains("some") }
    println(some)
    val nothing = words.find { it.contains("nothing") }
    println(nothing)
}
