package com.eslirodrigues.codewars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.eslirodrigues.codewars.ui.theme.CodeWarsTheme
import kotlinx.coroutines.channels.ticker
import java.text.DecimalFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeWarsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Answer(howMuchMoneyCrazy())
                }
            }
        }
    }
}

@Composable
fun Answer(answer: String) {
    Text(text = answer, fontSize = 25.sp)
}

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

// Return an array with multiples
fun multiplicationTable() : Array<IntArray> {
    val input = 3 + 1

    val array = Array(input, init = { intArrayOf()})

    for (values in 0 until input) {
        array[values] = IntArray(input) { it * values}.copyOfRange(1, input)
    }

    return array.copyOfRange(1, array.size)

    // Better solution
    // fun multiplicationTable(size: Int) = Array(size) { x -> IntArray(size) { y -> (x + 1) * (y + 1) } }
}

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


// Find multiples of 3 and 5, change the multiple by a word
fun arrayMultiples3and5(): Array<String> {
    val input = 10 + 1

    val list = Array(size = input, init = { i -> i.toString() })

    for (i in 1 until input) {
        if (i % 3 == 0 && i % 5 == 0) {
            list[i] = "FizzBuzz"
        } else if (i % 3 == 0) {
            list[i] = "Fizz"
        } else if (i % 5 == 0) {
            list[i] = "Buzz"
        } else {
            list[i] = i.toString()
        }
    }

    return list.copyOfRange(1, list.size)
}

// Find out if have enough pc for students
fun kidsEnoughComputer() : String {
    val pcProf = 1
    val inputAStudents = 3
    val inputCTotalPc = 6
    val inputXCaioBurn = 1
    val inputYNoCompiler = 2

    val workingPcs = inputCTotalPc - pcProf - inputXCaioBurn - inputYNoCompiler

    var answer = ""

    if (workingPcs >= inputAStudents) {
        answer = "Igor Happy!"
    }
    if (workingPcs < inputAStudents) {
        answer = "Igor Mad!"
    }
    if (workingPcs <= inputAStudents && inputXCaioBurn > (inputYNoCompiler / 2)) {
        answer = "Caio, it's your fault!"
    }

    return answer
}

// Return a decimal from Roman numeral
fun convertRomanToDecimal() : Int {
    val input = "MCMXC"

    var values = 0

    for (value in input) {
        if (value.toString() == "I") {
            values += 1
        }
        if (value.toString() == "V") {
            values += 5
        }
        if (value.toString() == "X") {
            values += 10
        }
        if (value.toString() == "L") {
            values += 50
        }
        if (value.toString() == "C") {
            values += 100
        }
        if (value.toString() == "D") {
            values += 500
        }
        if (value.toString() == "M") {
            values += 1000
        }
    }

    if (input.contains("IV") || input.contains("IX")) {
        values -= 2
    }

    if (input.contains("XL") || input.contains("XC")) {
        values -= 20
    }

    if (input.contains("CM") || input.contains("CD")) {
        values -= 200
    }

    val answer = values
    return answer
}


// Max-Vol = 100, Min-Vol = 0. Find the volume
fun volumeTV() : Int {
    val inputInitial = 50
    val inputChanges = 5

    val inputList = listOf(30, 30, 30, 40, -78)

    var finalVolume = inputInitial

    for (values in inputList) {
        finalVolume += values
        if (finalVolume >= 100) {
            finalVolume = 100
        }
        if (finalVolume <= 0) {
            finalVolume = 0
        }
    }

    val answer = finalVolume

    return answer
}

// Find sum of multiples of 3 and 5.
fun multiples() : Int {
    val input = 200 - 1
    var numbers = 0

    for (i in 1..input) {
        if (i % 3 == 0 && i % 5 == 0){
            numbers += i
        } else if (i % 3 == 0) {
            numbers += i
        } else if (i % 5 == 0) {
            numbers += i
        }
    }

    val answer = numbers

    return answer

//    Better solution
//    fun solution(number: Int) = (1 until number).filter { it % 3 == 0 || it % 5 == 0 }.sum()
}

// Find the arithmetic mean. A = peso 2, B = peso 3, C = peso 5. WeightedMean used for resolution
fun weightedMean() : Double {
    val inputA = 10.0
    val inputB = 10.0
    val inputC = 5.0

    val pesoA = 2
    val pesoB = 3
    val pesoC = 5

    val media = ((inputA * pesoA) + (inputB * pesoB) + (inputC * pesoC)) / ( pesoA + pesoB + pesoC)

    val answer = media

    return answer
}


// increases salary according to percentage
fun increaseSalaryPercentage(percentage: Int, inputNumber: Double) : String {
    val newSalary = ((percentage * inputNumber) / 100) + inputNumber
    val readjustment = (percentage * inputNumber) / 100

    val df = DecimalFormat("0.00")

    return """
        New salary: ${df.format(newSalary)}
        Gain readjustment: ${df.format(readjustment)}
        In percentage: $percentage %
    """.trimIndent()
}
fun salaryIncreased(): String {
    val inputSalary = 1000.00
    val answer: String

    when (inputSalary) {
        in 0.00..400.00 -> {
            answer = increaseSalaryPercentage(percentage = 15, inputNumber = inputSalary)
        }
        in 400.01..800.00 -> {
            answer = increaseSalaryPercentage(percentage = 12, inputNumber = inputSalary)
        }
        in 800.01..1200.00 -> {
            answer = increaseSalaryPercentage(percentage = 10, inputNumber = inputSalary)
        }
        in 1200.01..2000.00 -> {
            answer = increaseSalaryPercentage(percentage = 7, inputNumber = inputSalary)
        }
        else -> {
            answer = increaseSalaryPercentage(percentage = 4, inputNumber = inputSalary)
        }
    }

    return answer
}