package com.example.laboratorio3bm101219

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SecondCompose(function: () -> Unit) {
    Button(onClick = {
        crashFunction()
    }) {
        Text(text="Crasheame")
    }

}
fun crashFunction(){
    var division:Int = 1/0
}