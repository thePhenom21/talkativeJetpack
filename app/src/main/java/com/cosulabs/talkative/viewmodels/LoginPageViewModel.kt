package com.cosulabs.talkative.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginPageViewModel : ViewModel() {
        private var _username = mutableStateOf("")
        private var _password = mutableStateOf("")

        val username : String
            get() = _username.value

        val password : String
            get() = _password.value

        fun updateUsername(username : String){
            _username.value = username
        }

        fun updatePassword(password : String){
            _password.value = password
        }


}