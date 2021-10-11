package com.study.compose.screen.layout

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LayoutScreenViewModel @Inject constructor(

): ViewModel() {
    private val _state = mutableStateOf(LayoutScreenState())
    val screenState: State<LayoutScreenState> = _state

    init {

    }
}