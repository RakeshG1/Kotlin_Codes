// https://www.geeksforgeeks.org/kotlin-data-classes/

// DataClass is majorly used to store data and some standard functions automatically created from it
// i.e.,
//equals()
//hashCode()
//toString()
//copy()

data class Fruit(val name: String, val price: Int){
    // compiler understands only property inside default class body
    var color: String = "yellow"
}

fun main(){

    // tostring()
    val fruit1 = Fruit("Banana", 10)
    println("fruit1.toString() : ${fruit1.toString()}") // fruit1.toString() : Fruit(name=Banana, price=10)
    println("fruit1.color : ${fruit1.color}") // fruit1.color : yellow
    fruit1.color = "green"
    println("fruit1.color : ${fruit1.color}") // fruit1.color : green

    // copy dataclass object / duplicating
    val fruit2 = fruit1.copy("Apple")
    fruit2.color = "Red"
    val fruit3 = fruit1.copy()
    println("${fruit1} color is : ${fruit1.color} ") // Fruit(name=Banana, price=10) color is : green
    println("${fruit2} color is : ${fruit2.color} ") // Fruit(name=Apple, price=10) color is : Red
    println("${fruit3} color is : ${fruit3.color} ") // Fruit(name=Banana, price=10) color is : yellow

    // hashCode() and equals()
    val hasCode1 = fruit1.hashCode()
    val hasCode2 = fruit2.hashCode()
    val hasCode3 = fruit3.hashCode()

    println(hasCode1) // 1327314213
    println(hasCode2) // 1967772688
    println(hasCode3) // 1327314213

    println("hashCode1 == hashCode2 ${hasCode1.equals(hasCode2)}") // hashCode1 == hashCode2 false
    println("hashCode2 == hashCode3 ${hasCode2.equals(hasCode3)}") // hashCode2 == hashCode3 false
    println("hashCode1 == hashCode3 ${hasCode1.equals(hasCode3)}") // hashCode1 == hashCode3 true

    println("${fruit1} color is : ${fruit1.color} ") // Fruit(name=Banana, price=10) color is : green
    println("${fruit2} color is : ${fruit2.color} ") // Fruit(name=Apple, price=10) color is : Red
    println("${fruit3} color is : ${fruit3.color} ") // Fruit(name=Banana, price=10) color is : yellow

    // Note: Though the fruit1.color property and fruit3.color property are different as object contructor copies sare same, that is why hash codes are same

}
