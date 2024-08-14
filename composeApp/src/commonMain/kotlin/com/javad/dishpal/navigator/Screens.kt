package com.javad.dishpal.navigator

sealed class Screen(val name: String, val args: Map<String, String> = mapOf()) {

    data object OnBoard1 : Screen("OnBoard1")
    data object OnBoard2 : Screen("OnBoard2")
    data object OnBoard3 : Screen("OnBoard3")
}