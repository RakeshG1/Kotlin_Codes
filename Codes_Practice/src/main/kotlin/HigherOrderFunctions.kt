// https://play.kotlinlang.org/byExample/04_functional/01_Higher-Order%20Functions

// Here Argument : operation: (Int, Int) -> Int, kind of higher argument which take values invoke another function
// or act like dynamic function behaviour
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int{
    return operation(x, y)
}

fun valuesSum(x: Int, y: Int) = x + y

fun operation(): (Int) -> Int{
    return ::square
}

fun square(x: Int) = x * x

fun main() {

    val sumResult = calculate(x = 10, y = 20, ::valuesSum) //Calling function
    println("sumResult --> $sumResult") // sumResult --> 30

    val mulResult = calculate(x = 10, y = 20) { a, b -> a * b } //Dynamically taking arguments and making some logic on it
    println("mulResult --> $mulResult") // mulResult --> 200

    val func = operation()
    println(func(2)) // 4 // call function within return

}
