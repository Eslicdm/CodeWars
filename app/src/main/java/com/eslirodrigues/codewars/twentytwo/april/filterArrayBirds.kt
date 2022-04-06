package com.eslirodrigues.codewars.twentytwo.april

// Filter an array
fun filterArrayBirds() : String {
    val inputArray = arrayOf("Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish")
    val listFilter = arrayOf("African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher")

    val filteredList = inputArray.filter { !listFilter.contains(it) }

    return filteredList.joinToString()
}