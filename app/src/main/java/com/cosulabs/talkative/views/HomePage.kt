package com.cosulabs.talkative.views

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cosulabs.talkative.viewmodels.LoginPageViewModel

class HomePage : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun homePage(){
        val loginPageViewModel : LoginPageViewModel = viewModel()
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), verticalArrangement = Arrangement.Bottom) {
            LazyColumn(Modifier.height((11*(LocalConfiguration.current.screenHeightDp.dec()/12)).dp),content = {
                items(count = 100, itemContent = { Text(text = "hey")})
            })
            TextField(modifier = Modifier.width((LocalConfiguration.current.screenWidthDp-10).dp).padding(10.dp).height((LocalConfiguration.current.screenHeightDp.dec()/12).dp),value = "", onValueChange = {})
        }
    }

}