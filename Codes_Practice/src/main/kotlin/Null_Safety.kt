fun main(){

    // -------------------------
    // Mutable String Variables
    // -------------------------

    var a: String = "test a" // Non-Nullable String Object
    println("--> " + a) // --> test a
    // a = null // Null can not be a value of a non-null type String

    var b: String? = "test b" // Nullable String Object
    println("--> " + b) // --> test b
    b = null
    println("--> " + b) // --> null

    var c = "test c"
    println("--> " + c) // --> test c
    // c = null // Null can not be a value of a non-null type String

    // -------------------------
    // Immutable String Variables
    // -------------------------

    val d: String = "test d" // Immutable Non-Nullable String Object
    println("--> " + d) // --> test d
    // d = null // Val cannot be reassigned

    fun getStrLength(str: String): Int{
        return str.length
    }

    println("Size of str : a --> " + getStrLength(str = a)) // Size of str : a --> 6
    println("Size of str : c --> " + getStrLength(str = c)) // Size of str : c --> 6

    fun getStrLength1(str: String?): Int? {
        if (str != null) {
            return str.length
        }
        return null
    }

    println("Size of str : b --> " + b?.let { getStrLength(str = it) }) // Size of str : b --> null

}