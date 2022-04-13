fun inputValue(value: Any): Any{
    val res = when (value){
        10 -> "ten"
        "test" -> "tested"
        is Long -> true
        else -> 0
    }
    return res
}

fun main(){

    println(inputValue(10)) // ten
    println(inputValue(value=11)) // 0
    println(inputValue("test")) // tested
    println(inputValue(123)) // 0
    println(inputValue(234234234324)) // true

}
