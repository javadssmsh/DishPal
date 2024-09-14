package com.javad.dishpal.feature_home

import com.javad.dishpal.domain.model.Post
import com.javad.dishpal.navigator.Screen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch


data class HomeState(
    val posts: List<Post> = arrayListOf(),
    val isLoading: Boolean = false,
    val error: Throwable? = null
)

class HomeViewModel(
    val scope: CoroutineScope
) {

    private val _state = MutableStateFlow(HomeState())
    val state = _state.asStateFlow()


    init {
        loadPost()
    }

    fun loadPost() {
        scope.launch {
            _state.update {
                it.copy(
                    posts = listOf(
                        Post(
                            id = 1,
                            dishName = "Some dish",
                            dishType = "Chineese",
                            dishDescription = "very easy to cook",
                            createdByUserId = 1,
                            dishImageUrl = null, rateCount = 0, recipe = "just do it ", rate = null
                        )
                    )
                )
            }
        }
    }
}