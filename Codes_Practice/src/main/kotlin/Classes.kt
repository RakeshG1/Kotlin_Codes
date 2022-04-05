class Student(val id: Int, var Name: String){
    fun greet(str:String){
        println(str)
    }
    var age = 20
}

fun main(){
    var s = Student(1, "John")
    println(s) // Student@1b28cdfa
    println(s.id) // 1
    println(s.Name) // John
    println(s.age) // 20
    s.greet(str="Hello") // Hello
}

