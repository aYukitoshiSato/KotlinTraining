package io.access.kotlintraining

import java.util.Scanner

fun welcome() {
    println("welcome to ACCESS!")
}

fun hello() {
    println("Hello World!")
}


fun fizzbuzz(i: Int): String {
    when {
        i % 15 == 0 -> return "FizzBuzz"
        i % 3 == 0 -> return "Fizz"
        i % 5 == 0 -> return "Buzz"
        else -> return "$i"
    }
}

fun inputyear() {
    val input = Scanner(System.`in`)
    println("年を入力")
    var year: Int = input.nextInt()
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

fun Int.isOdd() = this % 2 == 1

fun Int.isEven() = this % 2 == 0


fun oddeven() {
    val a = 5
    println(a.isOdd())
    println(a.isEven())
}

