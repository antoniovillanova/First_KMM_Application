/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package it.aesys.viewmodel

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel

@Suppress("EmptyDefaultConstructor")
actual open class ViewModel actual constructor() : androidx.lifecycle.ViewModel() {
    protected actual val viewModelScope: CoroutineScope = CoroutineScope(Dispatchers.Main)

    public actual override fun onCleared() {
        super.onCleared()

        viewModelScope.cancel()
    }
}
