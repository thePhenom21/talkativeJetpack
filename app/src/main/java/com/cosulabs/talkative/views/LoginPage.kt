package com.cosulabs.talkative.views

import android.annotation.SuppressLint
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.cosulabs.talkative.components.CustomTextField
import com.cosulabs.talkative.components.LoginButton
import com.cosulabs.talkative.util.BUTTON_WIDTH

class LoginPage : ComponentActivity() {

}


@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginView(){
    var usernameController by remember { mutableStateOf(TextFieldValue()) }

    var passwordController by remember { mutableStateOf(TextFieldValue()) }


    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .fillMaxHeight(),verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        CustomTextField(
            placeholder = { Text("Username: ",color = Color.White) },
            modifier = Modifier.padding(bottom = 10.dp), value = usernameController, onValueChange = {usernameController = it})
        CustomTextField(
            visualTransformation = PasswordVisualTransformation('*'),
            placeholder = {Text("Password: ", color = Color.White)},
            modifier = Modifier.padding(bottom = 30.dp),
            value = passwordController, onValueChange = {passwordController = it})
        LoginButton(text = "Login", modifier = Modifier.width(BUTTON_WIDTH))
        LoginButton(text = "Register",modifier = Modifier.width(BUTTON_WIDTH))
    }
}
