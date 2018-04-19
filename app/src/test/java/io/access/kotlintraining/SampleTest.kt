package io.access.kotlintraining

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()
    }

    @Test
    fun testHello() {
        hello()
    }

    @Test
    fun testfizzbuzz() {
        assertEquals("Fizz", fizzbuzz(3))
        assertEquals("Buzz", fizzbuzz(5))
        assertEquals("FizzBuzz", fizzbuzz(15))
    }

    @Test
    fun testisLeapyear() {
        assertEquals(true, isLeapYear(1600))
        assertEquals(true, isLeapYear(2000))
        assertEquals(true, isLeapYear(2400))
        assertEquals(false, isLeapYear(1700))
        assertEquals(false, isLeapYear(2100))
        assertEquals(false, isLeapYear(2200))
        assertEquals(false, isLeapYear(1999))
    }

    @Test
    fun testoddeven() {
        oddeven()
        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testdiceroll() {
        val d = Dice(16)
        for (i in 1..100) {
            println(d.roll()) // 1〜16 までの数字
        }
        println(d.roll())
    }
}