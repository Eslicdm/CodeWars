package com.eslirodrigues.codewars.twentytwo.jan

// Find sum of multiples of 3 and 5.
fun multiples3and5() : Int {
    val input = 200 - 1
    var numbers = 0

    for (i in 1..input) {
        if (i % 3 == 0 && i % 5 == 0){
            numbers += i
        } else if (i % 3 == 0) {
            numbers += i
        } else if (i % 5 == 0) {
            numbers += i
        }
    }

    val answer = numbers

    return answer

//    Better solution
//    fun solution(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
}