package com.javad.dishpal.design_system

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun LightTheme(): Colors {
    return Colors(
        primary = Red500,
        primaryVariant = Orange800,
        secondary = Orange500,
        secondaryVariant = Orange800,
        background = MaterialTheme.colors.background,
        surface = MaterialTheme.colors.surface,
        error = MaterialTheme.colors.error,
        onPrimary = MaterialTheme.colors.onPrimary,
        onSecondary = MaterialTheme.colors.onSecondary,
        onBackground = MaterialTheme.colors.onBackground,
        onSurface = MaterialTheme.colors.onSurface,
        onError = MaterialTheme.colors.onError,
        isLight = true
    )
}

@Composable
fun DarkTheme(): Colors {
    return Colors(
        primary = Orange500,
        primaryVariant = Orange800,
        secondary = Red500,
        secondaryVariant = Orange800,
        background = MaterialTheme.colors.background,
        surface = MaterialTheme.colors.surface,
        error = MaterialTheme.colors.error,
        onPrimary = MaterialTheme.colors.onPrimary,
        onSecondary = MaterialTheme.colors.onSecondary,
        onBackground = MaterialTheme.colors.onBackground,
        onSurface = MaterialTheme.colors.onSurface,
        onError = MaterialTheme.colors.onError,
        isLight = true
    )
}