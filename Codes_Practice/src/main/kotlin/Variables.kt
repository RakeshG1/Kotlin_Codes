fun main(){

    var a: String = "intialisation" // Declares a mutable variable and initializes it.
    println(a) // intialisation
    val b: Int = 1 // Declares an immutable variable and initializes it.
    println(b) // 1
    val c = 2 // Declares an immutable variable and initializes it without specifying the type. The compiler infers the type Int.
    println(c) // 2
    var d: Int
    // println(d) // An attempt to use the variable causes a compiler error: Variable 'e' must be initialized.

    val e: Int
    if (1 == 1){
        e = 1
    }else{
        e = 2
    }
    println(e) // 1


}