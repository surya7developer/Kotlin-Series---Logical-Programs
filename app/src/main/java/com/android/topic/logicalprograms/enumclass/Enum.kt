package com.android.topic.logicalprograms.enumclass

fun main() {

    // val day = Day()  : We can't do like this
    val day: Day = Day.MONDAY
    println(day)

    day.printDay() // we can call method like this

    val result = Result.SUCCESS
    result.doWork(1) // we can call specific constants method

    val res = result.name // we can access constant like this
    println(res)

    handleResults(Result.SUCCESS)
}

fun handleResults(result: Result) {

    when (result) {
        Result.ERROR -> {
            // Write error logic
        }

        Result.LOADING -> {
            // Write loading logic
        }

        Result.SUCCESS -> {
            // Write success logic
        }
    }
}

interface FetchData {
    fun doWork(id: Int)
}

enum class Result : FetchData {
    LOADING {
        override fun doWork(id: Int) {
            println("This is doWork of Loading")
        }
    },
    SUCCESS {
        override fun doWork(id: Int) {
            println("This is doWork of Success")
        }
    },
    ERROR {
        override fun doWork(id: Int) {
            println("This is doWork of Error")
        }
    }
}

enum class Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    fun printDay() {
        println("This is $this")
    }
}


/*

-> enum class is a special type used to define a fixed set of constant values.
-> Each value of enum is object
-> We can not create object of enum class like this ->  val day = Day()
-> Enum class itself is not singleton but
-> Each constant inside the enum is a singleton — created only once and shared across the app.
-> We can create concrete methods in enum class
-> Enum is not abstract class but we can create abstract method on it and it must be implemented for their all constant
-> Enum is final by default.
-> Enum only support constant values
-> It can not hold any dynamic object where we can change their value


*/