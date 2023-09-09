package com.cosulabs.talkative.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Buttons {





}

@Composable
fun LoginButton(
    onClick : () -> Unit,
    text: String
){
    Button(onClick = onClick) {
        Text(text)
    }
}