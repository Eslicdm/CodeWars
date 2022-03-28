package com.eslirodrigues.codewars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.eslirodrigues.codewars.twentytwo.mar.*
import com.eslirodrigues.codewars.twentytwo.feb.*
import com.eslirodrigues.codewars.twentytwo.jan.*
import com.eslirodrigues.codewars.ui.theme.CodeWarsTheme
import java.text.DecimalFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeWarsTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Answer(firstGapPrime())
                }
            }
        }
    }
}

@Composable
fun Answer(answer: String) {
    Text(text = answer, fontSize = 25.sp)
}