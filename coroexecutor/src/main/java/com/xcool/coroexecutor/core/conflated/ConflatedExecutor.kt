package com.xcool.coroexecutor.core.conflated



interface ConflatedExecutor {

    suspend fun <T> conflate(block: suspend () -> T): T
}
