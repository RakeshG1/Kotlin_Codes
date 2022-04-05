fun printMessage(message: String): Unit{
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Test"){
    println("[$prefix] $message")
}

fun mul1(x: Int, y: Int): Int{
    return x * y
}

fun mul2(x: Int, y: Int) = x * y

fun showMessages(vararg messages: String){
    for(msg in messages){
        println(msg)
    }
}

fun showMessagesWithPrefix(vararg messages: String, prefix: String){
    for (msg in messages) println(prefix + msg)
}

fun log(vararg messages: String){
    showMessages(*messages)
}

fun main(){
    printMessage("Hello") // Hello
    printMessageWithPrefix("Hello", "Kotlin") // [Kotlin] Hello
    printMessageWithPrefix("Hello") // [Test] Hello
    printMessageWithPrefix(prefix="Kotlin", message="Hello") // [Kotlin] Hello
    println(mul1(y=10, x=1)) // 10
    println(mul2(y=10, x=1)) // 10
    showMessages("Hi", "Hello", "How", "Are", "You!!")
    // Hi
    // Hello
    // How
    // Are
    // You!!
    showMessagesWithPrefix("Hi", "Hello", prefix = "Greetings!! ")
    // Greetings!! Hi
    // Greetings!! Hello
    log("Hi", "Hello", "How", "Are", "You!!")
    // Hi
    // Hello
    // How
    // Are
    // You!!
}