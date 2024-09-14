package com.javad.dishpal.domain.model

data class Post(
    val id: Long,
    val rate: Float?,
    val rateCount: Long,
    val recipe: String,
    val dishName: String,
    val dishImageUrl: List<String>?,
    val dishType: String,
    val dishDescription: String,
    val createdByUserId: Long,
    val createdBy: User? = null
)
