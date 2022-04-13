fun main(){
    // for loop
    val fruits = listOf("Strawberry", "Apple", "Banana")
    for (fruit in fruits){
        println("fruit --> " + fruit)
        // fruit --> Strawberry
        // fruit --> Apple
        // fruit --> Banana
    }

    // while loop
    var i = 0
    while (i < fruits.size){
        println("fruit --> " + fruits.get(i))
        // fruit --> Strawberry
        // fruit --> Apple
        // fruit --> Banana
        i ++
    }

    // do while loop
    i = 0
    do {
        println("fruit --> " + fruits.get(i))
        // fruit --> Strawberry
        // fruit --> Apple
        // fruit --> Banana
        i ++
    } while (i < fruits.size)

    // iterator over listOf Strings
    // https://www.techiedelight.com/iterate-list-kotlin/
    val list: List<String> = listOf("Strawberry", "Apple", "Banana")
    println(list.toString()) // [Strawberry, Apple, Banana]
    val itr = list.listIterator()
    while (itr.hasNext()){
        println(itr.next())
        // Strawberry
        // Apple
        // Banana
    }

    val fruitmarket = FruitMarket(listOf(Fruit("Apple"), Fruit("Mango")))
    for (fruit in fruitmarket){
        println("Fruit Name : ${fruit.name}")
       // Fruit Name : Apple
       // Fruit Name : Mango
    }

}

// iterator over listOf Objects
class Fruit(val name: String)
class FruitMarket(val fruits: List<Fruit>){
    operator fun iterator(): Iterator<Fruit> {
        return fruits.iterator()
    }
}
