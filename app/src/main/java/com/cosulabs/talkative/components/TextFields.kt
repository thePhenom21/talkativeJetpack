package com.cosulabs.talkative.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

class TextFields {


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    visualTransformation: VisualTransformation = VisualTransformation.None,
    placeholder: @Composable() (() -> Unit)?,
    modifier: Modifier,
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    color: TextFieldColors = TextFieldDefaults.textFieldColors(containerColor = Color.DarkGray, textColor = Color.White)
){
    TextField(visualTransformation = visualTransformation, singleLine = true,placeholder = placeholder, modifier = modifier, value = value, onValueChange = onValueChange,colors = color,)
}
