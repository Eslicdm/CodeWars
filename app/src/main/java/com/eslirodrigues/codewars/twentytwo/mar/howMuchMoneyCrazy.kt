package com.eslirodrigues.codewars.twentytwo.mar

// Find out how much money he has
fun howMuchMoneyCrazy(): String {
    val start = 1
    val end = 100 + 1

    val listMoney = mutableListOf(1)

    for (values in start until end) {
        for (i in start until end) {
            if (values - 7 * i == 2) {
                listMoney.add(values)
            }
            if (values - 9 * i == 1) {
                listMoney.add(values)
            }
        }
    }

    val news = listMoney.groupBy { it }.filter { it.value.size > 1 }.keys

    val listBoats = Array(news.size) { it }
    val listCars = Array(news.size) { it }

    var boatIndex = 0
    var carIndex = 0

    for (values in start until end) {
        for (i in news) {
            if (i - 7 * values == 2) {
                listBoats[boatIndex] = values
                boatIndex++
            }
            if (i - 9 * values == 1) {
                listCars[carIndex] = values
                carIndex++
            }

        }
    }

    val array1 = Array(news.size) { index ->
        arrayOf("M: ${listMoney.groupBy { it }.filter { it.value.size > 1 }.keys.elementAtOrNull(index)} B: ${listBoats[index]} C: ${listCars[index]}")
    }

    val string: String = array1.contentDeepToString()

    return string.replace(", ", "")
}