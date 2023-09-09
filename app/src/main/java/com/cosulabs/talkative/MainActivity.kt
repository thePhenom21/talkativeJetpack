package com.cosulabs.talkative

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.cosulabs.talkative.views.HomePage
import com.cosulabs.talkative.components.Buttons
import com.cosulabs.talkative.components.LoginButton
import com.cosulabs.talkative.login.*


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()
        }

    }


}

