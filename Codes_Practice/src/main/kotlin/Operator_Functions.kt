 fun main(){
     //  Using Infix Wise Implementing Functions
     //  infix fun Int.times(str: String) = str.repeat(this)
     //  println(2 times "Hi ") // Hi Hi

     //  Using Operator Wise Implementing Functions
      operator fun Int.times(str: String) = str.repeat(this)
      println(2 * "Hi ") // Hi Hi

     //  Using Operator Wise Implementing Functions
     operator fun String.get(range: IntRange) = substring(range)
     val str = "Hi, How are you?"
     println(str[0..6]) // Hi, How

 }


