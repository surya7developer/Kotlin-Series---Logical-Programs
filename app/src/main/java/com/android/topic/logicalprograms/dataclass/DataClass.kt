package com.android.topic.logicalprograms.dataclass

class NormalClass(val name:String,val age:Int)
data class DataClass(val name:String,val age:Int)

fun main() {

    val normalClass = NormalClass(name = "Suresh", age = 25)
    val dataClass = DataClass(name = "Suresh", age = 25)

    val(name,age) = dataClass

    println("Normal class = $normalClass")
    println("data class = $dataClass")

    println("comparison = ${dataClass.equals(normalClass)}")
}

/*

Output
------

Normal class = com.android.topic.logicalprograms.dataclass.NormalClass@5b464ce8
data class = DataClass(name=Suresh, age=25)
comparison = false

Process finished with exit code 0




*/