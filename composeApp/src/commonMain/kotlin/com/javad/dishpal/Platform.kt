package com.javad.dishpal

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform