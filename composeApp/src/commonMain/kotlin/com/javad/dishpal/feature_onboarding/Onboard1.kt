package com.javad.dishpal.feature_onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javad.dishpal.core.NextButton
import com.javad.dishpal.core.OnboardHeader
import com.javad.dishpal.navigator.NavigationViewModel
import com.javad.dishpal.navigator.Screen
import dishpal.composeapp.generated.resources.Res
import dishpal.composeapp.generated.resources.onboard1
import dishpal.composeapp.generated.resources.onboard1_subtitle
import dishpal.composeapp.generated.resources.onboard1_title
import org.jetbrains.compose.resources.stringResource


@Composable
fun Onboard1(modifier: Modifier = Modifier, viewModel: NavigationViewModel) {

    Column(modifier = Modifier.background(Color.White).fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly) {

        OnboardHeader(
            image = Res.drawable.onboard1,
            title = Res.string.onboard1_title,
        )

        Text(
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(start = 50.dp, end = 50.dp),
            textAlign = TextAlign.Center,
            style = TextStyle(fontSize = 10.sp),
            text = stringResource(Res.string.onboard1_subtitle)
        )


        NextButton {
            viewModel.navigate(Screen.OnBoard2)
        }
    }

}


