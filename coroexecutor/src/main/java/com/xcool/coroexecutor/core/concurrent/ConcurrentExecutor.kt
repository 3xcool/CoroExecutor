package com.xcool.coroexecutor.core.concurrent



interface ConcurrentExecutor {

    suspend fun <T> run(block: suspend () -> T): T
}
