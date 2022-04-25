// https://play.kotlinlang.org/byExample/07_Delegation/01_delegationPattern

// interface with one method
interface CarNew{
    fun drive()
}

// Delegate Object
//class Car1 implement the interface and contain their own implementations of the method
class Car1(val n: String): CarNew {
    override fun drive() = println("${n} start & drive slow !!!")
}

//class Car2 implement the interface and contain their own implementations of the method
class Car2(val n: String): CarNew {
    override fun drive() = println("${n} start & drive fast !!!")
}

// The classes LocalCar and HighwayCar also implement the interface, but not the method.
// Instead, they delegate the method calls to the responsible implementation. The delegate object is defined after the by keyword.
// As you see, no boilerplate code is required.
class LocalCar(n: String): CarNew by Car1(n)
class HighwayCar(n: String): CarNew by Car2(n)

fun main(){

    // When drive() is called on localCar of type LocalCar or highwayCar of type HighwayCar,
    // the call is delegated to the corresponding delegate object
    val localCar = LocalCar("Company A")
    localCar.drive()

    val highwayCar = HighwayCar("Company B")
    highwayCar.drive()
}
