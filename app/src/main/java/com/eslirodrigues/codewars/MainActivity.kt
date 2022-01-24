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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeWarsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Answer(salaryIncreased().toString())
                }
            }
        }
    }
}

@Composable
fun Answer(answer: String) {
    Text(text = answer, fontSize = 25.sp)
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
fun increaseSalaryPercentage(percentage: Int, inputNumber: Double): Double = ((percentage * inputNumber) / 100) + inputNumber
fun salaryIncreased() : Double {
    val inputSalary = 1000.00
    val answer: Double

    when(inputSalary) {
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
