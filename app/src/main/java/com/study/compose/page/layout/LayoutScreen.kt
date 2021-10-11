package com.study.compose.page.layout

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun LayoutScreen(navController: NavController, viewModel: LayoutViewModel = hiltViewModel()) {
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
    LayoutScreen(navController = rememberNavController())
}
