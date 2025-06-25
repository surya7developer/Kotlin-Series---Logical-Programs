package com.android.topic.logicalprograms.dsa

fun main() {

    // So here output will be remain same, but time complexity will be different (in terms of steps)
    // so here binary search will take less steps as compare to linear search
    // because linear search will compare target object will all the element from list
    // if the target element is at index 0 then its fine, buts let assume if list with 1000 size and target at 999 index
    // so binary search will take less search even if size of list is very long

    val numbers = mutableListOf(2, 5, 8, 12, 16, 27, 33, 46, 89, 99)
    val target = 89

    // This will return the index where target is located
    val result1 = linearSearch(numbers, target)
    println(result1)

    // This will return the index where target is located
    val result2 = binarySearch(numbers, target)
    println(result2)


    /*
    => Output

    Linear Search : Steps - 8
    8
    Binary Search : Steps - 3
    8


     -> Here binary search's performance is batter then linear in term of steps

    */
}

fun linearSearch(numbers: MutableList<Int>, target: Int): Int {

    for (i in numbers.indices) {

        if (target == numbers[i]) {
            printStepLog("Linear Search", i) // This is only for printing steps log
            return i
        }

    }

    return -1
}


fun binarySearch(numbers: MutableList<Int>, target: Int): Int {
    var left = 0
    var right = numbers.size - 1

    var countSteps = 0

    while (left <= right) {
        countSteps++ // This is only for printing step log

        val mid = (left + right) / 2

        if (numbers[mid] == target) {
            printStepLog("Binary Search", countSteps)
            return mid
        } else if (numbers[mid] < target) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }


    return -1
}


fun printStepLog(tag: String, steps: Int) {
    println("$tag : Steps - $steps")
}