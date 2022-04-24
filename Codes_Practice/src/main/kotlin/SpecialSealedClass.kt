// https://play.kotlinlang.org/byExample/03_special_classes/03_Sealed%20Classes
// Sealed classes let you restrict the use of inheritance.
sealed class Machine(val name: String)

class Car(val carname: String) : Machine(carname)
class Bike(val bikename: String) : Machine(bikename)

fun greetMachine(machine: Machine): String{
    when(machine){
        is Car -> return "Hello ${machine.name}"
        is Bike -> return "Hello ${machine.name}"
    }
}

fun main(){
    println(greetMachine(Car("BMW"))) // Hello BMW
    println(greetMachine(Car("Ducati"))) // Hello Ducati
}
