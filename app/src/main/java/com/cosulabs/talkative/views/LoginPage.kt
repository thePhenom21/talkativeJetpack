package com.cosulabs.talkative.views

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.cosulabs.talkative.components.LoginButton
import com.cosulabs.talkative.util.BUTTON_WIDTH

class LoginPage : ComponentActivity() {

}


@Composable
fun LoginView(){
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("test")
        Text(text = "test2")
        LoginButton(text = "Login", modifier = Modifier.width(BUTTON_WIDTH))
        LoginButton(text = "Register",modifier = Modifier.width(BUTTON_WIDTH))
    }
}
