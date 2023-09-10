package com.cosulabs.talkative.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.post
import io.ktor.http.Url
import io.ktor.util.InternalAPI
import kotlinx.coroutines.coroutineScope
import java.lang.Exception
import java.net.URL
import kotlin.coroutines.coroutineContext

class LoginPageViewModel : ViewModel() {
        private val client : HttpClient = HttpClient(CIO)

        private var _username = mutableStateOf(TextFieldValue())
        private var _password = mutableStateOf(TextFieldValue())

        val username : TextFieldValue
            get() = _username.value

        val password : TextFieldValue
            get() = _password.value

        fun updateUsername(username : String){
            _username.value = TextFieldValue(username)
        }

        fun updatePassword(password : String){
            _password.value = TextFieldValue(password)
        }

        @OptIn(InternalAPI::class)
        suspend fun login(username : String, password: String){
            coroutineScope {
                try{
                    var response = client.post(url = Url("http://10.0.2.2:44511/login?username=${username}&password=${password}"))
                    println(response.content.readUTF8Line(1000))
                }catch (e : Exception){
                    println(e.message)
                }

            }
        }

        suspend fun register(username: String, password: String){

        }


}