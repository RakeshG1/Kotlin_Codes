// https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression
// There is no ternary operator condition ? then : else in Kotlin. Instead, if may be used as an expression:


fun heightCheck(studA: Int, studB : Int){
    if (studA > studB){
        println("studA is more Height")
    }
    else{
        println("studB is more Height")
    }
}

fun main(){
    heightCheck(studA = 168, studB = 178) // studB is more Height
}