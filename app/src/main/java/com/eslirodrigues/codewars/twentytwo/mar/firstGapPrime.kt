package com.eslirodrigues.codewars.twentytwo.mar


// Find the first gap(g) between m and n
fun firstGapPrime() : String {
    val g = 2
    val m = 100L
    val n = 102L

    val list = mutableListOf(1L)

    for (values in m until n + 1) {
        if (values == 2L || values == 3L || values == 5L || values == 7L) {
            list.add(values)
        }
        if (values % 2L != 0L &&
            values % 3L != 0L &&
            values % 5L != 0L &&
            values % 7L != 0L
        ) {
            list.add(values)
        }
    }

    var cur: Long? = null

    val listLong = LongArray(size = 2)

    for (next in list) {
        if (cur != null) {
            if (next - cur == g.toLong()) {
                listLong[0] = cur
                listLong[1] = next
                break
            }
        }
        cur = next
    }

    return listLong.joinToString(prefix = "[", postfix = "]")
}