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
    print("Hello $myName $myLastName!")
}