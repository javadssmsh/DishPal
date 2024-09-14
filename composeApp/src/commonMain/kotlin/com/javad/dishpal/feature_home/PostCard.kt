package com.javad.dishpal.feature_home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.javad.dishpal.core.Avatar
import com.javad.dishpal.core.Rating
import com.javad.dishpal.design_system.White300
import com.javad.dishpal.domain.model.Post
import dishpal.composeapp.generated.resources.Res
import dishpal.composeapp.generated.resources.comment
import dishpal.composeapp.generated.resources.like
import dishpal.composeapp.generated.resources.share
import org.jetbrains.compose.resources.painterResource

@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    post: Post,
    imageHeight: Dp,
    onClick: (Long) -> Unit,
    onShareClick: (Long) -> Unit,
    onCommentClick: (Long) -> Unit
) {

    Card(modifier = modifier.height(400.dp).clickable {
        onClick(post.id)
    }) {
        Column(modifier = Modifier.fillMaxSize()) {

            Box(modifier = Modifier.height(imageHeight)) {
                ImageBanner(
                    modifier = Modifier.fillMaxSize().background(color = White300),
                    listOf()
                )
                Column(modifier = Modifier.padding(5.dp)) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Avatar()
                        Rating(modifier = modifier.padding(10.dp), rate = 3f)
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Row {
                        Text(text = "Top Bottom ")
                    }
                }
            }

            Text(text = post.dishDescription)
            Row(
                modifier = Modifier.fillMaxWidth().background(color = Color.Green)
                    .padding(start = 20.dp, end = 20.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    modifier = Modifier.height(28.dp),
                    contentDescription = null,
                    painter = painterResource(Res.drawable.share),
                    colorFilter = ColorFilter.tint(MaterialTheme.colors.primary)
                )
                Image(
                    modifier = Modifier.height(28.dp),
                    contentDescription = null,
                    painter = painterResource(Res.drawable.like),
                    colorFilter = ColorFilter.tint(MaterialTheme.colors.primary)
                )
                Image(
                    modifier = Modifier.height(28.dp),
                    contentDescription = null,
                    painter = painterResource(Res.drawable.comment),
                    colorFilter = ColorFilter.tint(MaterialTheme.colors.primary)
                )

            }
        }
    }
}

@Composable
fun ImageBanner(modifier: Modifier, imageUrls: List<String>) {

}
