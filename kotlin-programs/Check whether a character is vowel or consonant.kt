package com.includehelp.basic

import java.util.*

//Main Function, entry Point of Program
fun main(args: Array<String>) {
    // InputStream to get Input
    val scanner = Scanner(System.`in`)

    //Input Character
    print("Enter Character : ")
    val c = scanner.next()[0]
    
    when (c) {
        'a','e' ,'i' ,'o' ,'u','A','E','I','O','U' -> println("The given character $c is vowel")
        else -> println("The given character $c is consonant")
    }
}
