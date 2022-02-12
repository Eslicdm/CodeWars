package com.eslirodrigues.codewars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.eslirodrigues.codewars.ui.theme.CodeWarsTheme
import java.text.DecimalFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeWarsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Answer(convertRomanToDecimal().toString())
                }
            }
        }
    }
}

@Composable
fun Answer(answer: String) {
    Text(text = answer, fontSize = 25.sp)
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