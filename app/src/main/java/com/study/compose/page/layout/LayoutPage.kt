package com.study.compose.page.layout

import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LayoutPage() {
    Scaffold(
        backgroundColor = Color.White,
        topBar = {
            TopAppBar {

            }
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun LayoutPagePreview() {
    LayoutPage()
}
