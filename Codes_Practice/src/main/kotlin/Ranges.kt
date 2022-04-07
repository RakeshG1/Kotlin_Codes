// https://play.kotlinlang.org/byExample/02_control_flow/03_Ranges

fun main(){
    // -----------
    // Numeric's
    // -----------

    for(i in 0..3){
        println(i)
//        0
//        1
//        2
//        3
    }

    for(i in 0 until 3){
        println(i)
//        0
//        1
//        2
    }

    for(i in 0..2 step 2){
        println(i)
//        0
//        2
    }

    // Reverse Order
    for(i in 3 downTo 0){
        println(i)
//        3
//        2
//        1
//        0
    }

    // -----------
    // Characters's
    // -----------

    for (x in 'a'..'c'){
        println(x)
//        a
//        b
//        c
    }

    // Reverse Order with down step 2
    for (x in 'y' downTo 'u' step 2){
        println(x)
//        y
//        w
//        u
    }


    val z = 10
    if (z in 1..11){
        println(true)
        // true
    }

    if (z !in 11..15){
        println(false)
        // false
    }


}