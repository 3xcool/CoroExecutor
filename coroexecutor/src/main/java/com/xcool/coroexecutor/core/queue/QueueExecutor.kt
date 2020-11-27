package com.xcool.coroexecutor.core.queue


interface QueueExecutor {

    suspend fun <T> enqueue(block: suspend () -> T): T
}
