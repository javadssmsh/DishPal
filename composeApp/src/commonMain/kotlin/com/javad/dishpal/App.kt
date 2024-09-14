package com.javad.dishpal

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.javad.dishpal.design_system.DarkTheme
import com.javad.dishpal.design_system.LightTheme
import com.javad.dishpal.navigator.Navigation
import com.javad.dishpal.navigator.NavigationViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme(colors = if (isSystemInDarkTheme()) DarkTheme() else LightTheme()) {
        val coroutineScope = rememberCoroutineScope()
        val viewModel = remember { NavigationViewModel(coroutineScope) }

        Navigation(modifier = Modifier, viewModel = viewModel)
    }
}