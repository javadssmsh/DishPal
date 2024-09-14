package com.javad.dishpal.core

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.javad.dishpal.design_system.Orange500


@Composable
fun Rating(
    modifier: Modifier = Modifier,
    maxStar: Int = 5,
    rate: Float,
    starSize: Dp = 16.dp,
    spaceBetween: Dp = 3.dp,
    tintColor: Color = Orange500,
    tintColorUnSelected: Color = Color.White,
    onRatingChanged: (Float) -> Unit = {}
) {
    Row(modifier = modifier) {
        for (i in 1..maxStar) {
            val isSelected = i <= rate
            val icon = if (isSelected) Icons.Filled.Star else Icons.Outlined.Star
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (isSelected) tintColor else tintColorUnSelected,
                modifier = Modifier.selectable(
                    selected = isSelected,
                    onClick = { onRatingChanged(i.toFloat()) })
                    .shadow(elevation = 5.dp)
                    .width(starSize)
                    .height(starSize)
            )
            if (i < maxStar)
                Spacer(modifier = Modifier.width(spaceBetween))
        }
    }
}