// https://play.kotlinlang.org/byExample/05_Collections/15_Map_getValue

fun main(){
    val map = mapOf("a" to 10)
    println("map : ${map}") // map : {a=10}

    val value1 = map["a"]
    println("value1 : ${value1}") // value1 : 10
    val value2 = map["a2"]
    println("value2 : ${value2}") // value2 : null

    val value3: Int = map.getValue("a")
    println("value3 : ${value3}") // value3 : 10

    val mapWithDefault = map.withDefault { k -> k.length }
    println("mapWithDefault : ${mapWithDefault}") // mapWithDefault : {a=10}

    val value4 = mapWithDefault.getValue("a2")
    println("value4 : ${value4}") // value4 : 2

    try {
        println(map.getValue("otherKey"))
        // Message: java.util.NoSuchElementException: Key anotherKey is missing in the map.
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }

}