package com.example.kotlin.TestProject

import org.junit.Test

import org.junit.Assert.*

class UserTest {

    @Test
    fun user_IsAdult() {
        val use = User("John", 20)
        assertTrue(use.isAdult())
    }

    @Test
    fun user_isTeenager() {
        val use = User("John", 17)
        assertTrue(use.isTeenager())
    }

    @Test
    fun user_IsNotAdult() {
        val use = User("John", 18)
        assertTrue(use.IsNotAdult())
    }

}