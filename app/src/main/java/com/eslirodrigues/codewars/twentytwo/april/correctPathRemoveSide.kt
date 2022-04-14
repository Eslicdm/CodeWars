package com.eslirodrigues.codewars.twentytwo.april

// Find out the correct path removing the N-S W-E
fun correctPathRemoveSide() : String {
    val input = arrayOf("NORTH", "WEST", "SOUTH", "EAST")

    var north = 0
    var south = 0
    var east = 0
    var west = 0

    input.forEach {
        when (it) {
            "NORTH" -> north++
            "SOUTH" -> south++
            "EAST" -> east++
            "WEST" -> west++
        }
    }

    val values = mutableListOf(north - south, south - north, east - west, west - east)

    val textList = arrayListOf<String>()

    if (values[0] == 0 && values[1] == 0 && values[2] == 0 && values[3] == 0) {
        textList.add(input[0])
        textList.add(input[1])
        textList.add(input[2])
        textList.add(input[3])
    } else {
        (if (values[0] > 0) "NORTH".repeat(values[0]) else null)?.let { textList.add(it) }
        (if (values[1] > 0) "SOUTH".repeat(values[1]) else null)?.let { textList.add(it) }
        (if (values[2] > 0) "EAST".repeat(values[2]) else null)?.let { textList.add(it) }
        (if (values[3] > 0) "WEST".repeat(values[3]) else null)?.let { textList.add(it) }
    }

    return textList.joinToString()
}