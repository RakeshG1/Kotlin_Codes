// https://play.kotlinlang.org/byExample/07_Delegation/02_DelegatedProperties

import kotlin.reflect.KProperty

class ExampleFruit {
    var name: String by DelegateFruit() // This Class object takes responsibilty for getter and setter methods of this property
    override fun toString() = "Mango"
}

class DelegateFruit(){
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

fun main(){
    val fruit = ExampleFruit()
    println(fruit.name) // Mango, thank you for delegating 'name' to me!
    fruit.name = "Apple" // Apple has been assigned to name in Mango
}
