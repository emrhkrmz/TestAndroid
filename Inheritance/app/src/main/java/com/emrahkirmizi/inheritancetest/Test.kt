package com.emrahkirmizi.inheritancetest

fun main() {
    var correctResult = RandomOne()
    correctResult.showCorrectResult1()

    println("* * * * * * * * *")
    correctResult.showOverride(9,5)
    correctResult.superShowSuper()
    println("* * * * * * * * *")

    var wrongResult1 = RandomSecond()
    wrongResult1.showWrongResult1()
    wrongResult1.showWrongResult2()
    wrongResult1.showWrongResult3()

}