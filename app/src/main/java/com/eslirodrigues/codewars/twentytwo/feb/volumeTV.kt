package com.eslirodrigues.codewars.twentytwo.feb

// Max-Vol = 100, Min-Vol = 0. Find the volume
fun volumeTV() : Int {
    val inputInitial = 50
    val inputChanges = 5

    val inputList = listOf(30, 30, 30, 40, -78)

    var finalVolume = inputInitial

    for (values in inputList) {
        finalVolume += values
        if (finalVolume >= 100) {
            finalVolume = 100
        }
        if (finalVolume <= 0) {
            finalVolume = 0
        }
    }

    val answer = finalVolume

    return answer
}