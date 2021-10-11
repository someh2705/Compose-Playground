package com.study.compose.screen.main

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainScreenViewModel @Inject constructor(

) : ViewModel() {

    private val _state = mutableStateOf(MainScreenState())
    val screenState: State<MainScreenState> = _state

    init {
        
    }
}