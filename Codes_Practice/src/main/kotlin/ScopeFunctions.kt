// https://play.kotlinlang.org/byExample/09_Kotlin_JS/03_external
// https://blog.mindorks.com/using-scoped-functions-in-kotlin-let-run-with-also-apply

// Scoped Functions in Kotlin
// By definition, Scoped functions are functions that execute a block of code within the context of an object

class Fruit(){
    var name: String = "mango"
    fun displayObj()  = print("\n Name: $name\n " + "")
}

// Providing null checks
open class Car(){
    var name: String? = "BMW"
}


// Difference between “it” and “this”


fun main(){

    // let :
    // This implies that the “let” operator provides an option to perform an operation on the current object and return any value based on the use case
    fun performLet(){
        val fruit = Fruit().let {
            // Note: It is not necessary to write “return@let”. This is only done to enhance code readability.
            // In Kotlin, if the last statement in a “let” block is a non-assignment statement, it is by default a return statement
            // return@let "Name of the fruit : ${it.name}"
            // "Name of the fruit : ${it.name}" // Name of the fruit : mango
            it.name = "apple"
            "Name of the fruit : ${it.name}" // Name of the fruit : apple
        }
        println(fruit) // Name of the fruit : mango
    }

    fun performLetNullCheck(){
        val car = Car().let {
            "Name of the Car : ${it.name}" // Name of the Car : BMW
        }
        println(car) // Name of the Car : BMW
    }

    performLet()
    performLetNullCheck()

    // Let : on call chain
    val fruitsList = mutableListOf("mango", "apple", "grapes")
    val resultList = fruitsList.map { it.length }.filter { it > 5 }
    println(resultList) // [6]

    fruitsList.map { it.length }.filter { it > 5 }.let { println(it) } // [6]

    // Run : a “run” operator can be used to initialize an object and return the result of it.
    // run vs let
    // So if run is similar to let in terms of accepting any return value,
    // what’s the difference? The difference is run refers to the context of the object as “this” and not “it”.
    // That is the reason we did not use “${this.name}” as it would be redundant here since the block of code understands that “name”
    // is used here concerning the Person object.
    fun performRun(){
        val result = Fruit().run{
            name = "pineapple"
            return@run "The details of the Person is: ${displayObj()}"
            // Name: pineapple
            // The details of the Person is: kotlin.Unit
        }
        println(result)
    }

    fun performRun1(){
        val result = Fruit().run{
            name = "pineapple"
            return@run "The details of the Person is: ${this.name}"
        }
        println(result)
    }

    fun performRunNullCheck(){
        val result = Car().name?.run{
            return@run "Car name is: ${this}"
        }
        println(result)
    }

    performRun() // Name: pineapple The details of the Person is: kotlin.Unit
    performRun1() // The details of the Person is: pineapple
    performRunNullCheck() // Car name is: BMW

    // with
    // The “with” operator is completely similar to the run operator that we just discussed.
    // It also refers to the context of the object as “this”, similar to how the “run” operator uses it.

    fun performWith(){
        val fruit = with(Fruit()){
            return@with "Fruit Name : ${this.name}"
        }
        println(fruit)
    }

    performWith() // Fruit Name : mango

    // let vs with vs run

    fun performWithNullCheck(){
        val fruit: Fruit? = null
        with(fruit){
            this?.name = "Papaya"
            this?.displayObj()
        }
    }

    fun performRunNullCheck1(){
        val fruit: Fruit? = null
        fruit?.run{
            name = "Gauva"
            displayObj()
        }
    }

    performWithNullCheck()
    performRunNullCheck1()

    // apply
    // The apply function is similar to the run functionality only in terms of referring to the context of the object as
    // “this” and not “it” and also in providing null safety checks

    fun performApplyNullCheck(){
        val fruit: Fruit? = null
        fruit?.apply{
            name = "Gauva"
            displayObj()
        }
    }

    performApplyNullCheck()

    fun performRunApply(){
        val fruit1 = Fruit().run{
            name = "Watermelon"
            return@run "Returning String Instead of Object"
        }
        print(fruit1) // Returning String Instead of Object

        val fruit2 = Fruit().apply {
            name = "Orange"
            // return@apply "Returning String Instead of Object"
        }
        println(fruit2.displayObj()) // Name: Orange kotlin.Unit

    }

    performRunApply()


    // also

    // The “also” function is similar to the let functionality only in terms of referring to the context of the object as “it” and not “this”
    // and also in providing null safety checks:

    fun performAlso(){
        val fruit = Fruit().also { currentFruitName ->
            println("Current Fruit Name : ${currentFruitName.name}") // Current Fruit Name : mango
            currentFruitName.name = "Watermelon"
        }.run {
            "Latest Fruit Name : $name\n" // Latest Fruit Name : Watermelon
        }
        print(fruit)
    }

    performAlso() // Latest Fruit Name : Watermelon

}
