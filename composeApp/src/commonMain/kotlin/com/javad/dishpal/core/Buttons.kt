package com.javad.dishpal.core

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dishpal.composeapp.generated.resources.Res
import dishpal.composeapp.generated.resources.next
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource


@Composable
fun DefaultButton(modifier: Modifier, onClick: () -> Unit, text: StringResource) {
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(50.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)
    ) {
        Text(
            modifier = Modifier.defaultMinSize(minWidth = 100.dp).padding(10.dp),
            style = TextStyle(fontSize = 16.sp, color = Color.White),
            text = stringResource(text),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ColumnScope.NextButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    DefaultButton(
        modifier.padding(15.dp).align(Alignment.CenterHorizontally),
        onClick,
        Res.string.next
    )
}