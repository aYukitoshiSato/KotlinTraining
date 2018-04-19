package io.access.kotlintraining

import java.util.Scanner

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello() {
    println("Hello World!")
}


fun fizzbuzz() {
    for (i in 1..100)
        when {
            i % 15 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
}

fun inputyear() {
    val input = Scanner(System.`in`)
    println("年を入力")
    var year : Int = input.nextInt()
    isLeapYear(year)
}


fun isLeapYear(y: Int): Boolean {
    if (y % 4 == 0) {
        if (y % 100 == 0) {
            return y % 400 == 0
        }
        return true
    } else {
        return false
    }
}