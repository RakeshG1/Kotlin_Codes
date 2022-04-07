// https://play.kotlinlang.org/byExample/03_special_classes/02_Enum
// https://www.geeksforgeeks.org/enum-classes-in-kotlin/

// Enum classes are used to model types that represent a finite set of distinct values, such as directions, states, modes, and so forth.
// It is similar to dictionary in python

enum class Fruits(val color: String) {
    Apple("Red"),
    Banana("Yello"),
}

enum class Directions {
    North,
    South,
    East,
    West
}


fun main(){

    val color = Fruits.Apple.color
    println(color) // Red

    for (direction in Directions.values()){
        println("${direction.ordinal} = ${direction.name}")
//        0 = North
//        1 = South
//        2 = East
//        3 = West
    }


}