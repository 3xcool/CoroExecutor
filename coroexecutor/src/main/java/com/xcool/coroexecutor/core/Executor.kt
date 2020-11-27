package com.xcool.coroexecutor.core


interface Executor {

    suspend fun <T> execute(
      schema: ExecutorSchema,
      block: suspend () -> T
    ): T
}
