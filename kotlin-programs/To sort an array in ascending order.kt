package com.includehelp.basic

import java.util.*

//Main Function entry Point of Program
fun main(args: Array<String>) {
    //Input Stream
    val s = Scanner(System.`in`)

    //Input Array Size
    print("Enter number of elements in the array: ")
    val size = s.nextInt()

    //Create Integer array of Given size
    val intArray = IntArray(size)

    //Input array elements
    println("Enter Arrays Elements:")
    for (i in intArray.indices) {
        print("intArray[$i] : ")
        intArray[i] = s.nextInt()
    }

    //to Perform Ascending Order Sorting on integer Array
    var temp:Int
    for (i in intArray.indices) {
        for (j in i + 1 until intArray.size) {
            if (intArray[i] > intArray[j]) {
                temp = intArray[i]
                intArray[i] = intArray[j]
                intArray[j] = temp
            }
        }
    }

    //Alternatively we can also use sort() method of Arrays 
    //Class in kotlin to sort in Ascending Order
    //intArray.sort()

    print("Ascending Order: ")
    for (item in intArray) {
        print("$item ")
    }
}
