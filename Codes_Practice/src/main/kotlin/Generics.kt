// Generic Classes :
class Student (x: String){
    var ivalue = x
    init {
        println(ivalue)
    }
}

class Teacher<T> (x: T){
    var ivalue = x
    init {
        println(ivalue)
    }
}

// Generic Class
class MutableStackFruits<E>(vararg items: E){
    init{
        for(item in items){
            println(item)
            //Apple
            //Mango
            //Grapes
        }
    }

    public val items = items.toMutableList() //private

    fun pushFruit(element: E) = items.add(element)

    fun peekFruit() = items.last() // get last item

    fun popFruit() = items.removeAt(items.size - 1) // remove last item

    fun isFruitsItemsEmpty() = items.isEmpty()

    fun fruitsItemsSize() = items.size

}

// Generic Function
fun <E> mutableFruitsList(vararg fruits: E) = MutableStackFruits(*fruits)

// Other Way of Generic Function
fun <E> mutableFruitsList1(vararg fruits: E): MutableStackFruits<E> {
    var msf = MutableStackFruits(*fruits)
    return msf
}

fun main(args: Array<String>){

    var x: Student = Student(x = "Alex") // Alex
    println("x.ivalue --> " + x.ivalue) // x.ivalue --> Alex


    var y: Teacher<String> = Teacher<String>("Peter") // Peter
    println("y.ivalue --> " + y.ivalue) // y.ivalue --> Peter
    var z: Teacher<Int> = Teacher<Int>(123) // 123
    println("z.ivalue --> " + z.ivalue) // z.ivalue --> 123


    var m: MutableStackFruits<String> = MutableStackFruits<String>("Apple", "Mango", "Grapes")
    println("m --> " + m) // m --> MutableStackFruits@57829d67
    println("m.items --> " + m.items) // m.items --> [Apple, Mango, Grapes]

    var m1 = mutableListOf<String>("Apple", "Mango", "Grapes")
    println("m1 --> " + m1) // m1 --> [Apple, Mango, Grapes]

    println(m.pushFruit("Strawberry")) // true
    println("m.items --> " + m.items) // m.items --> [Apple, Mango, Grapes, Strawberry]

    println(m.peekFruit()) // Strawberry
    println(m.popFruit()) // Strawberry
    println("m.items --> " + m.items) // m.items --> [Apple, Mango, Grapes]

    println(m.isFruitsItemsEmpty()) // false
    println(m.fruitsItemsSize()) // 3

    // Passing List Values from Generic List to Generic Class
    var m2 = mutableFruitsList<String>("Apple", "Mango", "Grapes")
    println("m2.items --> " + m2.items) // m2.items --> [Apple, Mango, Grapes]
    println(m2.isFruitsItemsEmpty()) // false
    println(m2.fruitsItemsSize()) // 3

    // Passing List Values from Generic List to Generic Class
    var m3 = mutableFruitsList1<String>("Apple", "Mango", "Grapes")
    println("m3.items --> " + m3.items) // m3.items --> [Apple, Mango, Grapes]
    println(m3.isFruitsItemsEmpty()) // false
    println(m3.fruitsItemsSize()) // 3
}
