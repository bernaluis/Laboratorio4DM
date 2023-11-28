package com.example.laboratorio3bm101219

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
internal fun FirstCompose(onClickNavigateTo:()->Unit) {
    Button(onClick = {
        onClickNavigateTo()
    }) {
        Text(text="Ir a la segunda vista")
    }

}