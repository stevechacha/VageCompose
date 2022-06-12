package com.steve.vagecompose.presentation.splash_screen

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.produceState
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.delay
import com.steve.vagecompose.R
import com.steve.vagecompose.presentation.destinations.HomeScreenDestination
import com.steve.vagecompose.presentation.destinations.OnBoardingScreenDestination
import com.steve.vagecompose.presentation.onboarding_screen.OnBoardingScreen


@SuppressLint("ProduceStateDoesNotAssignValue")
@Destination(start = true)
@Composable
fun SplashScreen(
    navigator: DestinationsNavigator
) {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.size(128.dp),
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Logo"
            )
        }
    }

    produceState(initialValue = -1) {
        delay(3000)
        navigator.popBackStack()
        navigator.navigate(OnBoardingScreenDestination)
//        actions.gotoOnBoarding()
    }
}
