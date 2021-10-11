package com.study.compose.navigation

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_page")
    object LayoutScreen : Screen("layout_page")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}