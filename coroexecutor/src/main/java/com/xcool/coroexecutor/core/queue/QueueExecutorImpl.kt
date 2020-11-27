package com.xcool.coroexecutor.core.queue

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import javax.inject.Inject


class QueueExecutorImpl @Inject constructor() : QueueExecutor {
    private val mutex: Mutex = Mutex()

    override suspend fun <T> enqueue(block: suspend () -> T): T {
        mutex.withLock {
            return block()
        }
    }
}
