package com.emrahkirmizi.inheritancetest

open class RandomOne : Number() {

    var correctResul1: Int = resultNumber1 * resultNumber2

    fun showCorrectResult1() {
        println(correctResul1)
    }

    override fun showOverride(numberOne: Int, numberTwo: Int) {
        super.showOverride(99,3)
    }

    fun superShowSuper() {
        super.showSuper(90,3)
    }

}