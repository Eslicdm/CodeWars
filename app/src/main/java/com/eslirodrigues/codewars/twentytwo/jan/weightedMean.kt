package com.eslirodrigues.codewars.twentytwo.jan

// Find the arithmetic mean. A = peso 2, B = peso 3, C = peso 5. WeightedMean used for resolution
fun weightedMean() : Double {
    val inputA = 10.0
    val inputB = 10.0
    val inputC = 5.0

    val pesoA = 2
    val pesoB = 3
    val pesoC = 5

    val media = ((inputA * pesoA) + (inputB * pesoB) + (inputC * pesoC)) / ( pesoA + pesoB + pesoC)

    val answer = media

    return answer
}