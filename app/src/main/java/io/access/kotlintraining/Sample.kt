package io.access.kotlintraining

import java.util.Scanner
import java.util.Random

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
        else -> return i.toString()
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


fun power(a: Int, n: Int): Long {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0
    }
    var answer: Long = a.toLong()
    for (i in 1..n - 1) {
        answer *= a
    }
    return answer
}


fun Int.isOdd() = this % 2 == 1

fun Int.isEven() = this % 2 == 0

fun oddeven() {
    val a = 5
    println(a.isOdd())
    println(a.isEven())
}


class Dice constructor(n: Int) {
    var counter = 0
    val dicenum: Int = n
    fun roll(): Int {
        if (counter >= 100) {
            throw Exception("I was broken")
        }
        val random = Random()
        val m = random.nextInt(dicenum)
        counter++
        return m
    }
}


class MyCustomClass {
    var counter: Int = 0
    var propertyWithCounter: Int = 0
        set(value) {
            println("propertyに${value}をsetしました")
            field = value
            counter++
        }
}


class NabeAtsu {
    var counter: Int = 0
    fun next(): String {
        counter++
        if (counter % 3 == 0) {
            return "Aho"
        }
        val regex = Regex("3")
        if (regex.containsMatchIn("${counter}")) {
            return "Aho"
        }
        return counter.toString()
    }
}

fun callNabeAtsu() {
    val n = NabeAtsu()
    for (i in 1..100) {
        println(n.next())
    }
}