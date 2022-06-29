package com.iamwintrow.kotlinbasics

fun main() {
    // mutable variable
    var myName = "Mitchell"
    // immutable variable
    val myLastName = "Wintrow"
    // TODO: Print both variables
    // Type int (32 bit)
    var myAge = 31

    // Integer Types: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    // type Byte
    val myByte: Byte = 13
    // type Short
    val myShort: Short = 125
    // type Int
    val myInt: Int = 123123123
    // type Long
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans
    var isSunny: Boolean = true
    isSunny = false

    // Chars
    val letterChar: Char = 'A'
    val digitChar: Char = '1'

    // Strings
    val myStr: String = "Hello World"
    var firstCharInStr: Char = myStr[0]
    var lastCharInStr: Char = myStr[myStr.length - 1]

    println("Hello $myName $myLastName! First is $firstCharInStr and Last is $lastCharInStr.")
    println("The length of myName is ${myName.length}")

    var heightPerson1 = 170
    var heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson1 == heightPerson2) {
        println("head to head battle")
    } else {
        println("use technique")
    }
}