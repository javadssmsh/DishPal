package com.javad.dishpal.feature_home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javad.dishpal.core.ActionCard
import com.javad.dishpal.navigator.Screen
import dishpal.composeapp.generated.resources.Res
import dishpal.composeapp.generated.resources.chat
import dishpal.composeapp.generated.resources.home
import dishpal.composeapp.generated.resources.invite_your_friend
import dishpal.composeapp.generated.resources.set_location


@Composable
fun ColumnScope.HomeScreen(modifier: Modifier, state: HomeState, onNavigate: (Screen) -> Unit) {

    LazyColumn(
        modifier = modifier.weight(1f)
            .padding(3.dp)
            .background(color = if (MaterialTheme.colors.isLight) Color.White else Color.Black),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth().padding(5.dp)
                    .align(Alignment.CenterHorizontally),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ActionCard(
                    modifier = Modifier.weight(1f),
                    icon = Res.drawable.home,
                    string = Res.string.set_location,
                    onClick = {})

                ActionCard(
                    modifier = Modifier.weight(1f),
                    icon = Res.drawable.chat,
                    string = Res.string.invite_your_friend,
                    onClick = {})
            }


        }
        state.posts.forEach {
            item {
                PostCard(
                    post = it,
                    onClick = {},
                    onCommentClick = {},
                    onShareClick = {},
                    imageHeight = 400.dp
                )
            }
        }
    }

}