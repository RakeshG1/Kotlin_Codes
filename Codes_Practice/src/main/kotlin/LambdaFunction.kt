// https://play.kotlinlang.org/byExample/04_functional/02_Lambdas

// lambda functions to create ad-hoc functions
val upperCase1: (String) -> String = {str: String -> str.uppercase()}
val upperCase2: (String) -> String = {str -> str.uppercase()}
val upperCase3 = {str: String -> str.uppercase()}
val upperCase4: (String) -> String = {it.uppercase()}
val upperCase5: (String) -> String = String::uppercase

fun main(){
    println(upperCase1("Hello1")) //HELLO1
    println(upperCase2("Hello1")) //HELLO1
    println(upperCase3("Hello1")) //HELLO1
    println(upperCase4("Hello1")) //HELLO1
    println(upperCase5("Hello1")) //HELLO1
}
