// https://play.kotlinlang.org/byExample/05_Collections/03_Map

// A map is a collection of key/value pairs, where each key is unique and is used to retrieve the corresponding value.
// For creating maps, there are functions mapOf() and mutableMapOf().

val fruitsMutableMap: MutableMap<Int, String> = mutableMapOf(1 to "Apple", 2 to "Mango")
val fruitsReadMap: Map<Int, String> = fruitsMutableMap

fun getFruits(){
    fruitsReadMap.forEach{
        k, v -> println("ID: ${k}, VALUE: ${v}")
    }
}

fun updateFruit(id: Int, fruitName: String){
    if (fruitsMutableMap.containsKey(id)){
        fruitsMutableMap[id] = fruitName
    } else{
        println("ID : ${id} not exists!!")
    }
}

fun main(){
    getFruits()
    updateFruit(id= 1, fruitName= "Grapes")
    // ID: 1, VALUE: Apple
    // ID: 2, VALUE: Mango
    updateFruit(id= 1, fruitName= "Banana")
    getFruits()
    // ID: 1, VALUE: Banana
    // ID: 2, VALUE: Mango
}
