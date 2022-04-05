class Car(val name: String) {
    val followedEngine = mutableListOf<Car>()
    infix fun follows(other: Car) { followedEngine.add(other) }  // 6
}

fun main(){
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Hi") // HiHi

    // https://stackoverflow.com/questions/48446286/repeat-string-n-times-in-kotlin
    val str: String = "*".repeat(2)
    println(str) // **

    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/to.html
    val map = mapOf(1 to "x", -1 to "zz")
    println(map) // {1=x, -1=zz}

    val fruitColorPair = "Apple" to "Red"
    println(fruitColorPair) // (Apple, Red)

    // https://www.geeksforgeeks.org/pair-in-kotlin/#:~:text=Kotlin%20language%20provides%20a%20simple,relationship%20between%20the%20two%20values.
    var fruitPair = Pair("Apple", "Mango")
    println(fruitPair) // (Apple, Mango)
    println(fruitPair.first) // Apple
    println(fruitPair.second) // Mango

    // Custom Pair using onto
    infix fun String.pairup(otherVal: String) = Pair(this, otherVal)
    fruitPair = "Apple" pairup "Mango"
    println(fruitPair) // (Apple, Mango)
    println(fruitPair.first) // Apple
    println(fruitPair.second) // Mango


    val x = Car("X")
    val y = Car("Y")
    x follows y // Here, Car_X making Car_y into its followed list Car Objects
    println(x.followedEngine) // [Car@27bc2616]
    println(y.followedEngine) // []

}