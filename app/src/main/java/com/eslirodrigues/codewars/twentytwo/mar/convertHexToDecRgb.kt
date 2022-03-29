package com.eslirodrigues.codewars.twentytwo.mar

// Convert Hexadecimal to RGB (decimal)
fun convertHexToDecRgb() : String {
    val input = "#Fa3456".uppercase()
    data class RGB(val r: Int, val g: Int, val b: Int)

    val list = emptyList<Int>().toMutableList()

    fun convertHex(first: Char, second: Char) : Int {
        fun hexToNumber(hex: Char) : Int {
            return when(hex) {
                'A' -> 10; 'B' -> 11; 'C' -> 12; 'D' -> 13; 'E' -> 14; 'F' -> 15; else -> hex.digitToInt()
            }
        }
        return hexToNumber(first) * 16 + hexToNumber(second)
    }

    val rgb = RGB(
        r = convertHex(input[1], input[2]),
        g = convertHex(input[3], input[4]),
        b = convertHex(input[5], input[6])
    )

    list.add(rgb.r)
    list.add(rgb.g)
    list.add(rgb.b)

    return list.joinToString()

}