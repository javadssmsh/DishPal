package com.javad.dishpal.navigator

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.javad.dishpal.feature_onboarding.Onboard1
import com.javad.dishpal.feature_onboarding.Onboard2
import com.javad.dishpal.feature_onboarding.Onboard3

@Composable
fun Navigation(modifier: Modifier, viewModel: NavigationViewModel) {


    when (viewModel.currentScreen.collectAsState().value) {
        is Screen.OnBoard1 -> Onboard1(modifier = modifier, viewModel = viewModel)
        is Screen.OnBoard2 -> Onboard2(modifier = modifier, viewModel = viewModel)
        is Screen.OnBoard3 -> Onboard3(modifier = modifier, viewModel = viewModel)
    }

}



