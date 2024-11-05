package com.example.kotlin.TestProject

data class User(var name: String, var age: Int){

    fun isAdult(): Boolean {
        return age>= 18
    }

    fun isTeenager(): Boolean {
        return age in 13..17
    }

    fun IsNotAdult(): Boolean{
        return age<18
    }
}