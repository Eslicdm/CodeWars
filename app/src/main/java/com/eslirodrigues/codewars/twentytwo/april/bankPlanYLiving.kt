package com.eslirodrigues.codewars.twentytwo.april

// Find out if he can live with this plan. Last year must be more than withDraw with inflation
fun bankPlanYLiving() : String {
    val entry = 100000
    val bankPercentage = 1.0 / 100
    val withDraw = 9185
    val years = 12
    val inflation = 1.0 / 100

    fun convert(entry1: Int, bankPercentage1: Double, withDraw1: Int = 0, inflation1: Double = 0.0, newValue: Boolean) : Int {
        return if (newValue) (entry1 + bankPercentage1 * entry1 - (inflation1)).toInt() else (entry1 + bankPercentage1 * entry1 - (withDraw1)).toInt()
    }

    val list = mutableListOf(entry)

    var cur: Int? = null
    var curInflation: Double? = null

    for (values in 1 until years) {
        if (cur == null) {
            val converted = convert(entry1 = entry, bankPercentage1 = bankPercentage, withDraw1 = withDraw, newValue = false)
            cur = converted
            curInflation = withDraw + withDraw * inflation
            list.add(cur)
        } else {
            val converted2 = convert(entry1 = cur, bankPercentage1 = bankPercentage, inflation1 = curInflation!!, newValue = true)
            cur = converted2
            curInflation += curInflation * inflation
            list.add(cur)
        }
    }

    val answer = list[list.lastIndex] > curInflation!!
    return answer.toString()
}