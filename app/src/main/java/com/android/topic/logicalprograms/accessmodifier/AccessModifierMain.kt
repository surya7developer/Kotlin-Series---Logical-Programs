package com.android.topic.logicalprograms.accessmodifier

fun main() {

    var b = B()

    b.checkAccessibility()

}


open class A {

    var one = 1
    private var two = 2
    protected var three = 3
    internal var four = 4

}

class B : A() {

    fun checkAccessibility() {
        println(one) // it can accessible everywhere in project
        //println(two) // it can only accessible within a class where it is created,
                       // here it will give you compile error
        println(three) // It can accessible only within class and its subclass only
        println(four) // it can accessible within same module
    }

}