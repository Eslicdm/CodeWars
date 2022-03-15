package com.eslirodrigues.codewars.twentytwo.feb

// Return an array with multiples
fun multiplicationTable() : Array<IntArray> {
    val input = 3 + 1

    val array = Array(input, init = { intArrayOf()})

    for (values in 0 until input) {
        array[values] = IntArray(input) { it * values}.copyOfRange(1, input)
    }

    return array.copyOfRange(1, array.size)

    // Better solution
    // fun multiplicationTable(size: Int) = Array(size) { x -> IntArray(size) { y -> (x + 1) * (y + 1) } }
}