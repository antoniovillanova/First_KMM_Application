package it.aesys.viewmodel

import kotlinx.coroutines.CoroutineScope

@Suppress("EmptyDefaultConstructor")
expect open class ViewModel() {
    protected val viewModelScope: CoroutineScope

    open fun onCleared()
}