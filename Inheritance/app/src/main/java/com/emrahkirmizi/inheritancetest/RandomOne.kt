package com.emrahkirmizi.inheritancetest

import kotlin.random.Random

open class RandomOne : Number() {

    var correctResul1: Int = resultNumber1 * resultNumber2

    fun showCorrectResult1() {
        println(correctResul1)
    }

}