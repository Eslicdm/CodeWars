package com.eslirodrigues.codewars.twentytwo.april

// Return char max reps
fun stringMaxReps(): String {
    val input = "bbbaaabaaaa"

    val mutable = mutableListOf<Pair<Char?, Int>>()

    input.groupBy { it }.forEach { mutable.add(Pair(it.key, it.value.size)) }

    val max = mutable.maxByOrNull { it.second }

    return max?.toList()!!.joinToString(prefix = "(", postfix = ")")
}