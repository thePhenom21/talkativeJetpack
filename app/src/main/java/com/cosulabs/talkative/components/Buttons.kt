package com.cosulabs.talkative.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

class Buttons {


}

@Preview
@Composable
fun LoginButton(
    width : Dp = 150.dp,
    height : Dp = 40.dp,
    onClick : () -> Unit = {},
    text: String = "Login"
){

    ElevatedButton(modifier = Modifier.width(width).height(height = height),onClick = onClick, colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)) {
        Text(text)
    }
}