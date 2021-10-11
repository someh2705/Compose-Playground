package com.study.compose.page.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.study.compose.navigation.Screen


@Composable
fun MainScreen(navController: NavController, viewModel: MainViewModel = hiltViewModel()) {
    val state = viewModel.state.value
    Scaffold(
        backgroundColor = Color.White,
        topBar = {

        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ClickableText(text = AnnotatedString("Layout"), onClick = {
                navController.navigate(Screen.LayoutScreen.route)
            })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    MainScreen(navController = rememberNavController())
}