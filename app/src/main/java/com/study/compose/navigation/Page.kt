package com.study.compose.navigation

sealed class Page(val route: String) {
    object MainPage : Page("main_page")
    object LayoutPage : Page("layout_page")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}