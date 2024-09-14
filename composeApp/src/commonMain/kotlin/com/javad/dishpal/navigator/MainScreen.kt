package com.javad.dishpal.navigator

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javad.dishpal.design_system.White300
import com.javad.dishpal.feature_chat.NewPostScreen
import com.javad.dishpal.feature_home.HomeScreen
import com.javad.dishpal.feature_home.HomeViewModel
import com.javad.dishpal.feature_new_post.ChatScreen
import dishpal.composeapp.generated.resources.Res
import dishpal.composeapp.generated.resources.add_post
import dishpal.composeapp.generated.resources.chat
import dishpal.composeapp.generated.resources.home
import dishpal.composeapp.generated.resources.profile
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


@Composable
fun MainScreen(modifier: Modifier, currentScreen: Screen, onNavigate: (Screen) -> Unit) {


    Column(modifier = modifier.fillMaxSize().background(color = White300)) {
        Header(modifier = modifier.fillMaxWidth().height(50.dp))

        ScreenContainer(
            modifier = modifier.fillMaxWidth().weight(1f).heightIn(300.dp),
            currentScreen = currentScreen,
            onNavigate = onNavigate
        )

        BottomNavbar(
            modifier = modifier.fillMaxWidth().height(75.dp),
            currentScreen = currentScreen,
            onHomeClicked = { onNavigate(Screen.Home) },
            onNewPostClicked = { onNavigate(Screen.NewPost) },
            onChatClicked = { onNavigate(Screen.Chat) }
        )
    }
}

@Composable
fun ColumnScope.BottomNavbar(
    modifier: Modifier = Modifier,
    currentScreen: Screen,
    onHomeClicked: () -> Unit,
    onNewPostClicked: () -> Unit,
    onChatClicked: () -> Unit
) {
    Row(
        modifier = modifier.background(color = Color.White).drawBehind {
            val stroke = 2.dp
            drawLine(color = Color.LightGray, Offset(0f, 0f), Offset(size.width, 0f), stroke.value)
        }.padding(start = 30.dp, end = 30.dp, bottom = 5.dp, top = 0.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        NavbarItem(
            modifier = modifier.weight(1f),
            icon = Res.drawable.home,
            isSelected = currentScreen == Screen.Home,
            text = Res.string.home,
            tint = ColorFilter.tint(color = MaterialTheme.colors.primary),
            onClick = onHomeClicked
        ) // home

        NavbarItem(
            modifier = modifier.weight(1f),
            icon = Res.drawable.profile,
            isSelected = currentScreen == Screen.NewPost,
            text = Res.string.add_post,
            tint = ColorFilter.tint(color = MaterialTheme.colors.primary),
            onClick = onNewPostClicked
        ) // add post


        NavbarItem(
            modifier = modifier.weight(1f),
            icon = Res.drawable.chat,
            isSelected = currentScreen == Screen.Chat,
            text = Res.string.chat,
            tint = ColorFilter.tint(color = MaterialTheme.colors.primary),
            onClick = onChatClicked
        ) // chat
    }
}

@Composable
fun ColumnScope.ScreenContainer(
    modifier: Modifier = Modifier,
    onNavigate: (Screen) -> Unit,
    currentScreen: Screen
) {
    when (currentScreen) {
        Screen.Home -> {
            val scope = rememberCoroutineScope()
            val viewmModel = remember { HomeViewModel(scope) }
            val state = viewmModel.state.collectAsState()
            HomeScreen(modifier = modifier, state = state.value, onNavigate = onNavigate)
        }

        Screen.NewPost -> NewPostScreen(modifier = modifier, onNavigate = onNavigate)
        Screen.Chat -> ChatScreen(modifier = modifier, onNavigate = onNavigate)
        else -> {}
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.background(color = MaterialTheme.colors.primary),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // profile icon
    }
}

@Composable
fun NavbarItem(
    modifier: Modifier = Modifier,
    icon: DrawableResource,
    isSelected: Boolean = false,
    size: Dp = 28.dp,
    textPadding: Dp = 3.dp,
    textSize: TextUnit = 13.sp,
    text: StringResource,
    onClick: () -> Unit,
    tint: ColorFilter? = null
) {
    Column(modifier = modifier.background(color = if (isSelected) Color.Red else Color.White)) {

        Image(
            modifier = modifier.height(size).width(size).align(Alignment.CenterHorizontally)
                .clickable { onClick() },
            contentScale = ContentScale.Fit,
            painter = painterResource(icon),
            contentDescription = null,
            colorFilter = if (isSelected) tint else null
        )

        Text(
            modifier = modifier.align(Alignment.CenterHorizontally).padding(top = textPadding),
            text = stringResource(text),
            style = TextStyle(fontSize = textSize)
        )
    }

}
