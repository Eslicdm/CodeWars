package com.eslirodrigues.codewars.twentytwo.feb

// Return a decimal from Roman numeral
fun convertRomanToDecimal() : Int {
    val input = "MCMXC"

    var values = 0

    for (value in input) {
        if (value.toString() == "I") {
            values += 1
        }
        if (value.toString() == "V") {
            values += 5
        }
        if (value.toString() == "X") {
            values += 10
        }
        if (value.toString() == "L") {
            values += 50
        }
        if (value.toString() == "C") {
            values += 100
        }
        if (value.toString() == "D") {
            values += 500
        }
        if (value.toString() == "M") {
            values += 1000
        }
    }

    if (input.contains("IV") || input.contains("IX")) {
        values -= 2
    }

    if (input.contains("XL") || input.contains("XC")) {
        values -= 20
    }

    if (input.contains("CM") || input.contains("CD")) {
        values -= 200
    }

    val answer = values
    return answer
}