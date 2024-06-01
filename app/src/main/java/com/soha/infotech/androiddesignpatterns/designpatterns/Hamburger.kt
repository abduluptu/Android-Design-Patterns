package com.soha.infotech.androiddesignpatterns.designpatterns

/**
 * Step3: Builder design pattern
 */

// Create a Hamburger class with different types of burger
class Hamburger private constructor(
    val cheese: Boolean,
    val chicken: Boolean,
    val onions: Boolean
) {
    class Builder {
        private var cheese: Boolean = true
        private var chicken: Boolean = true
        private var onions: Boolean = true

        fun cheese(value: Boolean) = apply { cheese = value }
        fun chicken(value: Boolean) = apply { chicken = value }
        fun onions(value: Boolean) = apply { onions = value }

        fun build() = Hamburger(cheese, chicken, onions)
    }
}

// Note:  go to MainActivity to check rest of code