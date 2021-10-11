package com.study.compose.page.layout

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LayoutViewModel @Inject constructor(

): ViewModel() {
    private val _state = mutableStateOf(LayoutState())
    val state: State<LayoutState> = _state

    init {

    }
}