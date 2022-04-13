// open modifier - allows class inheritence
open class Car{
    init{
        println("In Car Constructor")
    }
    open fun sayHello(){
        println("Hello Car !!")
    }
}

class CarX : Car(){
    // override modifier - allows inherited class function - overriding
    override fun sayHello() {
        super.sayHello()
        println("Hello CarX !!")
    }
}


open class Bike(val x: String){
   init{
       println("In Bike Constructor")
   }
    fun sayHello(){
        println("Bike Origin Place : $x")
    }
}

// Passing Arguments to Inherited Class Constructor
class BikeX : Bike("aaa")


open class Plane(val value: String){
    init {
        println("In Plane Constructor")
    }
    fun sayHello(){
        println("Plane Origin Place : $value")
    }
}

// Another Way : Passing Arguments to Inherited Class(Super Class) Constructor
class PlaneX(value: String) : Plane(value){
    init{
        println("In PlaneX Constructor")
    }
}


fun main(){
    val car: Car = CarX()
    car.sayHello()
    // In Car Constructor
    // Hello Car !!
    // Hello CarX !!

    val bike: Bike = BikeX()
    bike.sayHello()
    // In Bike Constructor
    // Bike Origin Place : aaa

    val plane: Plane = PlaneX("bbb")
    plane.sayHello()
    // In Plane Constructor
    // In PlaneX Constructor
    // Plane Origin Place : bbb

}
