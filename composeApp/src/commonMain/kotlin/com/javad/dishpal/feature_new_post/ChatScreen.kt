package com.javad.dishpal.feature_new_post

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.javad.dishpal.navigator.Screen


@Composable
fun ColumnScope.ChatScreen(modifier: Modifier, onNavigate: (Screen) -> Unit){

    Box(modifier = modifier.weight(1f)){
        Text(text = "Chat Screen")
    }

}