package com.android.topic.logicalprograms.kotlinPrograms

fun main() {

    // second smallest is 4
    val numList = mutableListOf<Int>(2,4,6,90,63,13,5)
    var small = Int.MAX_VALUE // 2147483647
    var secondSmall = Int.MAX_VALUE // 2147483647

    //[1]
    //item = 2
    // small = 1
    // secondSmall = 2147483647

    // second small = 2

    //[2]
    //item = 4

    for(item in numList){

        if(item < small){
            secondSmall = small
            small = item
        }
        else if(item < secondSmall && item!=small){
            secondSmall = item
        }

    }

    println(small)
    println(secondSmall)
}