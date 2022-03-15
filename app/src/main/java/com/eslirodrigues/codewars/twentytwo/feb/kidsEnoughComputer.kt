package com.eslirodrigues.codewars.twentytwo.feb

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