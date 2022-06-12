package com.steve.vagecompose.presentation.home_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
@Destination
fun HomeScreen(
    navigator: DestinationsNavigator
) {

    Column( modifier = Modifier.fillMaxSize()) {

        Text(text = "HomeScreen")
        
    }

}