package com.eslirodrigues.codewars.twentytwo.jan

import java.text.DecimalFormat

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