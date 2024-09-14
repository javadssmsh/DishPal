package com.javad.dishpal.core

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


@Composable
fun ColumnScope.OnboardHeader(
    modifier: Modifier = Modifier,
    image: DrawableResource,
    title: StringResource
) {
    Box(modifier = modifier.fillMaxWidth().padding(top = 50.dp)) {
        Image(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            contentScale = ContentScale.Fit,
            painter = painterResource(image),
            contentDescription = null
        )

        Row(modifier = modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Text(
                modifier = Modifier.padding(top = 50.dp, end = 10.dp).width(150.dp),
                text = stringResource(title),
                style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
            )
        }
    }
}