package com.hank.bmi

class Hello {

}

fun main() {
    val p = Person()
    p.hello()

    println("Hello Kotlin!")

    //Byte, Short, Int, Long
    val age = 20
    val population = 9999L
    println(age.inc())
    println(age)
    var name = "Hank"
    println(name.get(1))
    name = "Jack"
    println(name)
    //Float(32), Double(64)
    val weight:Float = 65.5f
    //true, false
    val isAdult = false
    //Char
    val c = 'A'
    println(c)
}