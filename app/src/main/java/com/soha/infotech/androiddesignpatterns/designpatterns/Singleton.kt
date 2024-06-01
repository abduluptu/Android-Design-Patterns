package com.soha.infotech.androiddesignpatterns.designpatterns

/**
 * Step1: Singleton design pattern
 */

object Singleton {

    fun doSomething(): String {
        return "Hello, Singleton"
    }
}

fun main() {
    val result = Singleton.doSomething()
    println(result)
}