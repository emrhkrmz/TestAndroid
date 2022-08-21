package com.emrahkirmizi.inheritancetest

import kotlin.random.Random

open class Number {
    var number1: Int? = null
    var number2: Int? = null

    var resultNumber1: Int = Random.nextInt(1,10)
    var resultNumber2: Int = Random.nextInt(1,10)
    var resultNumber3: Int = Random.nextInt(1,10)
    var resultNumber4: Int = Random.nextInt(1,10)
    var resultNumber5: Int = Random.nextInt(1,10)
    var resultNumber6: Int = Random.nextInt(1,10)
    var resultNumber7: Int = Random.nextInt(1,10)
    var resultNumber8: Int = Random.nextInt(1,10)


    fun show() {
        println(number1)
        println(number2)
    }

    open fun showOverride(numberOne: Int, numberTwo: Int) {
        println(numberOne)
        println(numberTwo)
    }

    open fun showSuper(numberThree: Int, numberFour: Int) {
        println(numberThree)
        println(numberFour)
    }
}