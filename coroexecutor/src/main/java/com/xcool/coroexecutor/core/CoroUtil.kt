package com.xcool.coroexecutor.core

import kotlinx.coroutines.Dispatchers.Default
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Dispatchers.Unconfined
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext


object CoroUtil {
    val MainThread: CoroutineContext
        get() = Main + SupervisorJob()

    val DefaultThread: CoroutineContext
        get() = Default + SupervisorJob()
    
    val IOThread: CoroutineContext
        get() = IO + SupervisorJob()
    
    val UnconfinedThread: CoroutineContext
        get() = Unconfined + SupervisorJob()
}
