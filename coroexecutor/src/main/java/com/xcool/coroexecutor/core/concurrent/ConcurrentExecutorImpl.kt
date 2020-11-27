package com.xcool.coroexecutor.core.concurrent

import javax.inject.Inject


class ConcurrentExecutorImpl @Inject constructor() : ConcurrentExecutor {

    override suspend fun <T> run(block: suspend () -> T): T {
        return block()
    }
}
