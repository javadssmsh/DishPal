package com.javad.dishpal.core

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


@Composable
fun ActionCard(
    modifier: Modifier,
    height: Dp = 150.dp,
    icon: DrawableResource,
    string: StringResource,
    onClick: () -> Unit

) {

    Card(modifier = modifier.height(height).padding(5.dp).clickable {
        onClick()
    }, elevation = 5.dp, shape = RoundedCornerShape(10.dp)) {

        Column(modifier = Modifier.fillMaxSize()) {

            Spacer(modifier = Modifier.weight(1f))
            Image(
                modifier = Modifier.size(width = 70.dp, height = 70.dp).padding(10.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(icon),
                contentDescription = null
            )

            Spacer(modifier = Modifier.weight(1f))
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(10.dp),
                text = stringResource(
                    string
                ),
                style = TextStyle(fontSize = 14.sp)
            )

            Spacer(modifier = Modifier.weight(1f))
        }

    }

}