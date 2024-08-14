package com.javad.dishpal

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.javad.dishpal.navigator.Navigation
import com.javad.dishpal.navigator.NavigationViewModel
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import dishpal.composeapp.generated.resources.Res
import dishpal.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val coroutineScope = rememberCoroutineScope()
        val viewModel = remember { NavigationViewModel(coroutineScope) }

        Navigation(modifier = Modifier, viewModel = viewModel)
    }
}