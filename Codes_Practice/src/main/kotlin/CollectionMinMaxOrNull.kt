fun main(){
    val numbers = listOf<Int>(10, 20, 30)
    val numbers1 = emptyList<Int>()
    val number2 = listOf(3)

    println("numbers : $numbers, min = ${numbers.minOrNull()}, max = ${numbers.maxOrNull()}") // numbers : [10, 20, 30], min = 10, max = 30
    println("numbers1 : $numbers1, min = ${numbers1.minOrNull()}, max = ${numbers1.maxOrNull()}") // numbers1 : [], min = null, max = null
    println("number2 : $number2, min = ${number2.minOrNull()}, max = ${number2.maxOrNull()}") // number2 : [3], min = 3, max = 3

}