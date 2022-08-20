package com.emrahkirmizi.inheritancetest

class RandomSecond : RandomOne() {

    var wrongResult1: Int = resultNumber3 * resultNumber4
    var wrongResult2: Int = resultNumber5 * resultNumber6
    var wrongResult3: Int = resultNumber7 * resultNumber8

    fun showWrongResult1() {
        println(wrongResult1)
    }
    fun showWrongResult2() {
        println(wrongResult2)
    }
    fun showWrongResult3() {
        println(wrongResult3)
    }
}