package com.eslirodrigues.codewars.twentytwo.mar

// Check the char code and see if matches with the pair. If win >= win: WINNER else LOSE
fun winLotteryPair() : String {
    val ticket = arrayOf("ABC" to 65, "HGR" to 74, "BYHT" to 74)

    val inputWin = 1

    var win = 0

    ticket.forEach { pair ->
        pair.first.forEach { char ->
            if (char.code == pair.second) {
                win++
            }
        }
    }

    return if (win >= inputWin) "Winner!" else "Loser!"
}