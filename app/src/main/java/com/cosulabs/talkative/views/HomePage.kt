package com.cosulabs.talkative.views

import androidx.activity.ComponentActivity
import androidx.compose.runtime.Composable
import com.cosulabs.talkative.chat.*

class HomePage : ComponentActivity() {

    @Composable
    fun homePage(){
        Chat()
    }

}