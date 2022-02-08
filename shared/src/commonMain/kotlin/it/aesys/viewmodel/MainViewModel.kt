package it.aesys.viewmodel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {
    private val _count = MutableStateFlow(0)
    val count : StateFlow<Int> = _count

    fun incrementCounter() {
        _count.value++
    }
}