package com.eslirodrigues.codewars.twentytwo.feb

// Remove dash/underscore from words and join them and capitalize
fun removeDashJoinWordsCapitalize(): String {
    val input = "the_stealth_warrior"

    val chars = mutableListOf("")

    input.forEach { chars += it.toString() }

    chars.forEachIndexed { index, s ->
        if (s == "_" || s == "-") {
            chars[index + 1] = chars[index + 1].uppercase()
        }
    }

    return chars.joinToString().filter { it.isLetter() && !it.isWhitespace()}

    // Better solution
    // str.split("-", "_").mapIndexed { i, s -> if (i == 0) s else s.capitalize() }.joinToString("")
}