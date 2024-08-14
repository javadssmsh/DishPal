package com.javad.dishpal.feature_onboarding

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.javad.dishpal.navigator.NavigationViewModel
import com.javad.dishpal.navigator.Screen


@Composable
fun Onboard1(modifier: Modifier = Modifier, viewModel: NavigationViewModel) {

    Column {
        Text(modifier = modifier, text = "screen 1")

        Button(onClick = {
            viewModel.navigate(Screen.OnBoard2)
        }) {
            Text(text = "Next")
        }
    }

}