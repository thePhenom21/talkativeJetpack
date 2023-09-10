package com.cosulabs.talkative.views

import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cosulabs.talkative.components.CustomTextField
import com.cosulabs.talkative.components.LoginButton
import com.cosulabs.talkative.util.BUTTON_WIDTH
import com.cosulabs.talkative.viewmodels.LoginPageViewModel
import kotlinx.coroutines.runBlocking


@Composable
fun LoginView(){

    val loginPageViewModel : LoginPageViewModel = viewModel()

    var usernameController by remember {
        mutableStateOf(TextFieldValue())
    }

    var passwordController by remember {
        mutableStateOf(TextFieldValue())
    }


    var controlText by remember {
        mutableStateOf("")
    }


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
            modifier = Modifier.padding(bottom = 30.dp), value = passwordController, onValueChange = {passwordController = it})
        LoginButton(text = "Login", modifier = Modifier.width(BUTTON_WIDTH), onClick = {
            runBlocking {
                login(usernameController.text,passwordController.text,loginPageViewModel)
            }
            })
        LoginButton(text = "Register",modifier = Modifier.width(BUTTON_WIDTH), onClick = { runBlocking {
            register(usernameController.text,passwordController.text,loginPageViewModel)
        } })
        OutlinedButton(onClick = {},modifier = Modifier.padding(top = 20.dp), colors = ButtonDefaults.outlinedButtonColors(containerColor = Color.LightGray, contentColor = Color.DarkGray)) {
            Text("Forgot Password?",)
        }
        Text(text = controlText, modifier = Modifier.padding(top = 40.dp))
    }
}

suspend fun login(username: String, password: String, loginPageViewModel: LoginPageViewModel){
    loginPageViewModel.login(username,password)
}


suspend fun register(username: String, password: String, loginPageViewModel: LoginPageViewModel){
    loginPageViewModel.register(username,password)
}