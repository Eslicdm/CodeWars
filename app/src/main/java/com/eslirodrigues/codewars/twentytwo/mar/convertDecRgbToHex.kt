package com.eslirodrigues.codewars.twentytwo.mar

// Convert RGB (decimal) to Hexadecimal
fun convertDecRgbToHex() : String {
    val r = 255
    val g = 255
    val b = 300

    fun convertDecToHex(number: Int) : String {
        val remainderList = mutableListOf("")

        var value = if (number > 255) 255 else number
        if (value == 0) remainderList.add("00")

        while (value != 0) {
            when (val remainderDiv = value % 16) {
                10 -> remainderList.add("A")
                11 -> remainderList.add("B")
                12 -> remainderList.add("C")
                13 -> remainderList.add("D")
                14 -> remainderList.add("E")
                15 -> remainderList.add("F")
                else -> remainderList.add(remainderDiv.toString())
            }
            value /= 16
        }

        return remainderList.joinToString(separator = "").reversed()
    }

    val remainder = mutableListOf(
        convertDecToHex(r),
        convertDecToHex(g),
        convertDecToHex(b)
    )

    return remainder.joinToString(separator = "")
}

