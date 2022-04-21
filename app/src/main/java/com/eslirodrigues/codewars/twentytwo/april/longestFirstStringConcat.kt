package com.eslirodrigues.codewars.twentytwo.april

fun longestFirstStringConcat(): String {
    val input = arrayOf("zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail")
    val inputToMutableList = input.toMutableList()
    val concatNumber = 2

    val concatList = mutableListOf<String>()

    if (concatNumber >= 1 && !input.isNullOrEmpty() && concatNumber < input.size) {
        while (inputToMutableList.size >= concatNumber) {
            var char = ""
            for (values in 0 until concatNumber) {
                char += inputToMutableList[values]
            }
            concatList.add(char)
            inputToMutableList.removeFirstOrNull()
        }
    }

    return if (concatList.isNotEmpty()) concatList.first { it.length == concatList.maxOf { string -> string.length } } else ""

    // Better Solution
    // inout.toList().windowed(concatNumber).map { it.joinToString("").maxBy { it.length } } ?: ""
}