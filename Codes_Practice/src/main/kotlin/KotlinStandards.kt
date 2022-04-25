import java.time.LocalDate
import java.time.chrono.ChronoLocalDate
import kotlin.math.min

// https://play.kotlinlang.org/byExample/08_productivity_boosters/01_namedArguments

fun sample(studentName: String, studentGender: String){
    println("studentName : $studentName, studentGender : $studentGender")
}

data class FruitClass(val name: String, val cost: Int)

fun getFruit() = FruitClass("Apple", 100)


fun main(){
    sample("Peter", "M") // studentName : Peter, studentGender : M
    sample("M", "Peter") // studentName : M, studentGender : Peter : This is not compiler error but it is wrong for arguments. So better use named arguments
    sample(studentName = "Peter", studentGender = "M") // studentName : Peter, studentGender : M
    sample(studentGender = "M", studentName = "Peter") // studentName : Peter, studentGender : M

    // Destructuring Declarations : Short Form Declarations
    val (x, y, z) = arrayOf(10, 20, 30)
    println("$x, $y, $z") // 10, 20, 30

    val fruitPrize = mapOf<String, Int>("Apple" to 50, "Mango" to 100)
    for ((fruit, price) in fruitPrize){
        println("Fruit : $fruit, Price : $price")
        // Fruit : Apple, Price : 50
        // Fruit : Mango, Price : 100
    }

    // val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))

    // Assigning Object Properties to variables directly
    val fruit = getFruit()
    val (name, cost) = fruit
    println("$name, $cost") // Apple, 100
    println(name == fruit.component1()) // true
    val (_, price) = getFruit()
    println("$price") // 100
    val (name1, price1) = getFruit()
    println("$name, $cost") // Apple, 100


    val (num, numName) = Pair(1, "one")
    println("num = $num, numName = $numName") // num = 1, numName = one

    //  Kotlin compiler is smart enough to perform type casts automatically in most cases
    // Casts from nullable types to their non-nullable counterparts.
    // Casts from a supertype to a subtype.
    val date: ChronoLocalDate? = LocalDate.now()

    if (date!=null){
        println(date.isLeapYear) // false
    }

    if (date!=null && date.isLeapYear){
        println("This is a Leap Year")
    }

    if (date!=null && !date.isLeapYear){
        println("This is not a leap year") // This is not a leap year
    }

    if (date is LocalDate){
        val month = date.monthValue
        println(month) // 4
    }

}

// fun findMinMax(list: List<Int>): List<Int> {
//    val result: List<Int> = listOf<Int>(list.minOrNull(), list.maxOrNull())
//    return result
// }

class Pair<K, V>(val first: K, val second: V){
    operator fun component1(): K{
        return first
    }
    operator fun component2(): V{
        return second
    }
}
