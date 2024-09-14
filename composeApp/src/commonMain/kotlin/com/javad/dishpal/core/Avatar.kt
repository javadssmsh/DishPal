package com.javad.dishpal.core

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.kamel.core.utils.URI
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import io.ktor.http.Url


@Composable
fun Avatar(
    modifier: Modifier = Modifier,
    size: Dp = 40.dp,
    borderWith: Dp = 1.dp,
    borderColor: Color = Color.White,
    backgroundColor: Color = MaterialTheme.colors.primary,
    imageUrl: String? = null,
    initialize: String = ""
) {

    if (!imageUrl.isNullOrEmpty()) {
        // TODO : load image
        KamelImage(
            resource = asyncPainterResource(Url(imageUrl)), modifier = modifier.clip(
                CircleShape
            ).width(size).height(size).border(borderWith, borderColor, CircleShape)
                .background(backgroundColor), contentDescription = "Avatar"
        )
    } else {

        Box(
            modifier = modifier.clip(CircleShape).width(size).height(size).border(
                borderWith, borderColor,
                CircleShape
            ).background(backgroundColor)
        ) {
            Text(
                text = initialize, style = TextStyle(fontSize = 13.sp), modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
    }
}