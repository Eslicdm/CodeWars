package com.eslirodrigues.codewars.twentytwo.feb

// Find multiples of 3 and 5, change the multiple by a word
fun arrayMultiples3and5(): Array<String> {
    val input = 10 + 1

    val list = Array(size = input, init = { i -> i.toString() })

    for (i in 1 until input) {
        if (i % 3 == 0 && i % 5 == 0) {
            list[i] = "FizzBuzz"
        } else if (i % 3 == 0) {
            list[i] = "Fizz"
        } else if (i % 5 == 0) {
            list[i] = "Buzz"
        } else {
            list[i] = i.toString()
        }
    }

    return list.copyOfRange(1, list.size)
}