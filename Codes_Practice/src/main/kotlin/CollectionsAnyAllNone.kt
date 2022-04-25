val numbersList2: List<Int> = listOf(10, 20, 30)


fun main(){

    var isNoneEven = numbersList2.none { it % 2 == 1 }
    println(isNoneEven) //true

    var isNoneLess6 = numbersList2.none { it > 6 }
    println(isNoneLess6) //false

    val isAnyNegative = numbersList2.any { it < 0 }
    println(isAnyNegative) //false

    val isAnyGT6 = numbersList2.any { it > 6 }
    println(isAnyGT6) //true

    val isAllEven = numbersList2.all { it % 2 == 0 }
    println(isAllEven) //true

    val isAllLess6 = numbersList2.all { it < 6 }
    println(isAllLess6) //false
}
