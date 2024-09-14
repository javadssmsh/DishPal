package com.javad.dishpal.domain.model

data class User(
    val id: Long,
    val rate: Float?,
    val rateCount: Float,
    val fulName: String,
    val userAvatarUrl: String?,
    val userInitials: String = ""
)
