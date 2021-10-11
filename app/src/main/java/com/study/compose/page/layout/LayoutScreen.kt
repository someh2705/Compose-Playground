package com.study.compose.page.layout

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LayoutScreen() {
    Scaffold(
        backgroundColor = Color.White,
        topBar = {

        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPagePreview() {
    LayoutScreen()
}
