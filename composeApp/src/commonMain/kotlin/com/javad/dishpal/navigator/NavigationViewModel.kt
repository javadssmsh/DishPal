package com.javad.dishpal.navigator

import androidx.compose.runtime.MutableState
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class NavigationViewModel(
    val scope: CoroutineScope
) {

    private val _currentScreen = MutableStateFlow<Screen>(Screen.OnBoard1)

    val currentScreen = _currentScreen.asStateFlow()

    fun navigate(to: Screen) {
        scope.launch {
            _currentScreen.update { to }
        }
    }
}