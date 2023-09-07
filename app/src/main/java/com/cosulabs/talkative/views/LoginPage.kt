package com.cosulabs.talkative.views

import androidx.activity.ComponentActivity
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

class LoginPage : ComponentActivity() {
    
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun loginPage(){
        Column (horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxSize()){
            Column(verticalArrangement = Arrangement.Center, modifier = Modifier.height((
                LocalConfiguration.current.screenHeightDp.dec() / 3).dp)) {
                TextField(placeholder = {Text("Username:")},modifier = Modifier.padding(5.dp),value = "", onValueChange = {})
                TextField(placeholder = {Text("Password:")},modifier = Modifier.padding(5.dp),value = "", onValueChange = {})
            }
            Row {
                Button(onClick = {}) {
                    Text("Login")
                }
                Button(onClick = {}) {
                    Text("Register")
                }
            }
        }

    }
    
}