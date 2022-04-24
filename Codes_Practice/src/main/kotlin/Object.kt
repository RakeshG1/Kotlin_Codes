// https://play.kotlinlang.org/byExample/03_special_classes/04_Object
// Classes and objects in Kotlin work the same way as in most object-oriented languages: a class is a blueprint, and an object is an instance of a class.
// Usually, you define a class and then create multiple instances of that class:

import java.util.Random;

class RandomNumberGenerator{
    fun getRandomNumber(){
        var objRand = Random()
        println(objRand.nextInt(10))
    }
}

// object can be used to create Singleton pattern: it ensures you that only one instance of that class is created even
// if 2 threads try to create it

// Creating Object i.e., instance without class declaration´// SimpleSingleton
fun bikePrice(modelNumber: Int): Unit{
    val bikePriceCalc = object {
        var bikePrice = modelNumber * 10
    }
    val bikePrice = bikePriceCalc.bikePrice
    println("Bike Price : ${bikePrice}")
}

// Instance creation directly using object keyword, without any function block
object CarPrice {
    var price = 10;
    fun greetMessage(msg: String) = "$msg!"
    fun updatePrice(price: Int): String{
        this.price = price
        return "Price Updated!!"
    }
}

fun main(){
    val number1 = RandomNumberGenerator()
    val number2 = RandomNumberGenerator()
    number1.getRandomNumber() // 4
    number2.getRandomNumber() // 0

    // Object / Instance creation with anonymous function block
    bikePrice(11) // Bike Price : 110

    // Instance creation directly using object keyword, without any function block
    println(CarPrice.price) // 10
    println(CarPrice.greetMessage("Hello Car")) // Hello Car!
    println(CarPrice.updatePrice(120)) // Price Updated!!
    println(CarPrice.price) // 120

}
