fun main(){
    val l1 = arrayOf<Int>(1, 2, 3)
    println("l1 --> " + l1) // l1 --> [Ljava.lang.Integer;@340f438e
    val l2 = arrayOf("a", "b", "c")
    println("l2.get(1) --> " + l2.get(1)) // l2.get(1) --> b
    l2[2] = "d"
    println("l2.get(2) --> " + l2.get(2)) // l2.get(2) --> d
    // l4.add (No add functionality)

    // val l2 = arrayOf("a", "b", "c", 1) doesnt allow this

    // ListOf allows both string and numeric
    val values = listOf("a", "b", "c", 1, 3)
    for (value in values){
        println(value)
        // a
        // b
        // c
        // 1
        // 3
    }


    var l3 = mutableListOf("a","b","c","d")
    var l4 = mutableListOf(1, 2, 3)
    var l5 = mutableListOf<String>("a","b","c","d")
    l5[2] = "dd"
    println("l5 --> " + l5) // l5 --> [a, b, dd, d]
    l5.add("ee")
    println("l5 --> " + l5) // l5 --> [a, b, dd, d, ee]
}
